import { Container, Modal } from "react-bootstrap"
import "../assets/sass/ScarpeCustom.scss"
import { BiCartAdd } from "react-icons/bi"
import { useEffect, useState } from "react"
import Button from "react-bootstrap/Button"
import Card from "react-bootstrap/Card"
import { useDispatch, useSelector } from "react-redux"
import { getArticoli, getCarrello } from "../redux/actions"
function Scarpe() {
  const [show, setShow] = useState(false)
  const [show1, setShow1] = useState(false)
  const [ultimoArticoloAggiunto, setUltimoArticoloAggiunto] = useState(null)

  const handleClose = () => setShow(false)
  const handleShow = () => setShow(true)
  const handleClose1 = () => setShow1(false)
  const handleShow1 = () => setShow1(true)

  const scarpe = useSelector((state) => state.user.articoli)
  const dispatch = useDispatch()
  const [carrello, setCarrello] = useState([])
  const token = useSelector((state) => state.user.token)

  const postCarrello = (id, id2) => {
    const isPresente = carrello.some((item) => item.id === id2)
    if (isPresente) {
      setShow1(true)
    } else {
      fetch(`http://localhost:8080/api/carrello/${id}/articoli/${id2}`, {
        method: "POST",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
        .then((response) => {
          console.log(response)
          if (response.ok) {
            const articolo = scarpe.find((e) => e.id === id2)
            setCarrello((prevCarrello) => [...prevCarrello, articolo])
            //alert("Articolo aggiunto al carrello.")
            setShow(true)
            setUltimoArticoloAggiunto(articolo)
            dispatch(getCarrello(1, token))
          } else if (response.status === 409) {
            alert("Articolo già aggiunto al carrello.")
          }
        })
        .catch((error) => {
          console.error("testComment", error)
          alert("Si è verificato un errore durante l'aggiunta all'articolo al carrello.")
        })
    }
  }

  useEffect(() => {
    dispatch(getArticoli(token))
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [])

  return (
    <>
      <Container>
        <div className="d-flex justify-content-between  flex-wrap mt-5">
          {scarpe.slice(0, 20).map((e, i) => (
            <Card style={{ width: "18rem" }} key={i} className="mt-4 BLUES">
              <Card.Img className="h-50 scarpeimg" variant="top" src={e.img} />
              <Card.Body>
                <Card.Title className="text-white text-center">{e.nomeArticoli}</Card.Title>
                <Card.Text className="text-white">
                  <hr />
                  Colore: {e.descrizioneArticolo}
                  <hr />
                  Brand: {e.brand}
                  <hr />
                  Prezzo: {e.prezzo}€
                  <hr />
                </Card.Text>
                <div className="d-flex flex-column align-items-center justify-content-center mt-4">
                  <Button
                    onClick={() => {
                      postCarrello(1, e.id)
                    }}
                    className="coloresfondo"
                  >
                    Aggiungi al Carrello
                  </Button>
                </div>
              </Card.Body>
            </Card>
          ))}
        </div>
      </Container>

      <Modal show={show} onHide={handleClose}>
        <Modal.Header className="spanneriz d-flex justify-content-center align-items-center">
          <Modal.Title className="spanneriz"> - ARTICOLO AGGIUNTO - </Modal.Title>
        </Modal.Header>
        {ultimoArticoloAggiunto && (
          <Modal.Body className="spanneriz">
            <span className="spanneriz fs-4 me-5">
              Hai aggiunto l'articolo{" "}
              <span style={{ textDecoration: "underline" }}>{ultimoArticoloAggiunto.nomeArticoli}</span> al tuo
              carrello!
            </span>
            <span className="fs-6 ms-3 text-white" style={{ opacity: "40%" }}>
              <BiCartAdd />
            </span>
            <span className="fs-5 ms-3 text-white" style={{ opacity: "60%" }}>
              <BiCartAdd />
            </span>
            <span className="fs-4 ms-3 text-white" style={{ opacity: "80%" }}>
              <BiCartAdd />
            </span>
            <span className="fs-3 ms-3 text-white">
              <BiCartAdd />
            </span>
          </Modal.Body>
        )}
        <Modal.Footer className="spanneriz">
          <Button variant="danger" className="spanneriz bottonesp" onClick={handleClose}>
            CHIUDI
          </Button>
        </Modal.Footer>
      </Modal>

      <Modal show={show1} onHide={handleClose1}>
        <Modal.Header closeButton>
          <Modal.Title>GIA ESISTE</Modal.Title>
        </Modal.Header>
        <Modal.Body>Woohoo, you are reading this text in a modal!</Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose1}>
            Close
          </Button>
          <Button variant="primary" onClick={handleClose1}>
            Save Changes
          </Button>
        </Modal.Footer>
      </Modal>
    </>
  )
}

export default Scarpe
