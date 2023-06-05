import { Container } from "react-bootstrap"
import "../assets/sass/ScarpeCustom.scss"
import { useEffect, useState } from "react"
import Button from "react-bootstrap/Button"
import Card from "react-bootstrap/Card"
import { useDispatch, useSelector } from "react-redux"
import { getArticoli, getCarrello } from "../redux/actions"
function Scarpe() {
  const scarpe = useSelector((state) => state.user.articoli)
  const dispatch = useDispatch()
  const [carrello, setCarrello] = useState([])
  const token = useSelector((state) => state.user.token)

  const postCarrello = (id, id2) => {
    const isPresente = carrello.some((item) => item.id === id2)
    if (isPresente) {
      alert("Hai già aggiunto questo articolo al carrello.")
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
            alert("Articolo aggiunto al carrello.")
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
    </>
  )
}

export default Scarpe
