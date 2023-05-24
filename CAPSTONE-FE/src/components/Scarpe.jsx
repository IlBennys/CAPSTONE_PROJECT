import "../assets/sass/ScarpeCustom.scss"
import { useEffect, useState } from "react"
import Button from "react-bootstrap/Button"
import Card from "react-bootstrap/Card"
function Scarpe() {
  const [scarpe, setscarpe] = useState([])
  const postCarrello = async (id, id2) => {
    try {
      const response = await fetch(`http://localhost:8080/api/carrello/articoli/${id}/articoli/${id2}`, {
        method: "POST",
        headers: {
          Authorization:
            "Bearer eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJ0ZXN0ZXJlci5VQGV4YW1wbGUuY29tIiwiaWF0IjoxNjg0OTQ5NTkzLCJleHAiOjE2ODU1NTQzOTN9.Uy_D0pC92IvkJtDaHPGQsGCunw0OXiZopsbp-T5AiaML46F7ilGkTXAb45X0x3SI",
          "Content-Type": "application/json",
        },
      })
      console.log(response)
      if (response.ok) {
      }
    } catch (error) {
      alert("testComment", error)
    }
  }

  const getArticoli = async () => {
    try {
      const response = await fetch("http://localhost:8080/api/articolo", {
        method: "GET",
        headers: {
          Authorization:
            "Bearer eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJ0ZXN0ZXJlci5VQGV4YW1wbGUuY29tIiwiaWF0IjoxNjg0OTQ5NTkzLCJleHAiOjE2ODU1NTQzOTN9.Uy_D0pC92IvkJtDaHPGQsGCunw0OXiZopsbp-T5AiaML46F7ilGkTXAb45X0x3SI",
          "Content-Type": "application/json",
        },
      })
      console.log(response)
      if (response.ok) {
        const data = await response.json()
        console.log(data)
        setscarpe(data)
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
        {scarpe.map((e, i) => (
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

export default Scarpe