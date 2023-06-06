import { Container, Modal, Spinner } from "react-bootstrap"
import "../assets/sass/ScarpeCustom.scss"
import { useEffect, useState } from "react"
import Button from "react-bootstrap/Button"
import Card from "react-bootstrap/Card"
import { useDispatch, useSelector } from "react-redux"
import { getArticoli, getCarrello } from "../redux/actions"
import { BiCartAdd } from "react-icons/bi"
import { ImWarning } from "react-icons/im"
function Felpe() {
  const felpe = useSelector((state) => state.user.articoli)
  const dispatch = useDispatch()
  const [carrello, setCarrello] = useState([])
  const token = useSelector((state) => state.user.token)
  const [ultimoArticoloAggiunto, setUltimoArticoloAggiunto] = useState(null)
  const [show, setShow] = useState(false)
  const [show1, setShow1] = useState(false)
  const handleClose = () => setShow(false)
  const handleClose1 = () => setShow1(false)

  const [loader, setLoader] = useState(true)

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
            const articolo = felpe.find((e) => e.id === id2)
            setCarrello((prevCarrello) => [...prevCarrello, articolo])
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
      .then(() => {
        setLoader(false)
      })
      .catch((error) => {
        console.error("Errore durante il recupero degli articoli:", error)
        setLoader(false)
      })
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [])
  return (
    <>
      <Container>
        {loader ? (
          <div className="d-flex justify-content-center align-items-center h-100 w-100 mt-5">
            <span className="fs1 text-white">
              CARICAMENTO...
              <span className="ms-2">
                <Spinner animation="grow" variant="primary" />
              </span>
            </span>
          </div>
        ) : (
          <div className="d-flex justify-content-between  flex-wrap mt-5">
            {felpe.slice(20, 40).map((e, i) => (
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
                      disabled={token === ""}
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
        )}
      </Container>

      <Modal show={show} onHide={handleClose} centered>
        <Modal.Header className="spanneriz d-flex justify-content-center align-items-center">
          <Modal.Title className="spanneriz"> - ARTICOLO AGGIUNTO - </Modal.Title>
        </Modal.Header>
        {ultimoArticoloAggiunto && (
          <Modal.Body className="spanneriz">
            <span className="spanneriz fs-4 me-5">
              Hai aggiunto l'articolo
              <span className="mx-1" style={{ textDecoration: "underline" }}>
                {ultimoArticoloAggiunto.nomeArticoli}
              </span>
              al tuo carrello!
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

      <Modal show={show1} onHide={handleClose1} centered>
        <Modal.Header className="spanneriz d-flex justify-content-center align-items-center">
          <Modal.Title className="spanneriz ">
            <span className="me-3">
              <ImWarning />
            </span>
            <span>GIA' ESISTE</span>
            <span className="ms-3">
              <ImWarning />
            </span>
          </Modal.Title>
        </Modal.Header>
        <Modal.Body className="spanneriz fs-4">Hai già aggiunto questo articolo al carrello!</Modal.Body>
        <Modal.Footer className="spanneriz">
          <Button variant="danger" className="spanneriz bottonesp" onClick={handleClose1}>
            CHIUDI
          </Button>
        </Modal.Footer>
      </Modal>
    </>
  )
}

export default Felpe
