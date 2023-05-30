import "../assets/sass/ScarpeCustom.scss"
import { useEffect, useState } from "react"
import Button from "react-bootstrap/Button"
import Card from "react-bootstrap/Card"
import { useSelector } from "react-redux"
function Cappelli() {
  const [cappelli, setcappelli] = useState([])
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
            const articolo = cappelli.find((e) => e.id === id2)
            setCarrello((prevCarrello) => [...prevCarrello, articolo])
            alert("Articolo aggiunto al carrello.")
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

  const getArticoli = async () => {
    try {
      const response = await fetch("http://localhost:8080/api/articolo", {
        method: "GET",
      })
      console.log(response)
      if (response.ok) {
        const data = await response.json()
        console.log(data)
        setcappelli(data)
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
  useEffect(() => {
    getArticoli()
  }, [])

  return (
    <>
      <div className="d-flex justify-content-between  flex-wrap mt-5">
        {cappelli.slice(40, 60).map((e, i) => (
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
    </>
  )
}

export default Cappelli
