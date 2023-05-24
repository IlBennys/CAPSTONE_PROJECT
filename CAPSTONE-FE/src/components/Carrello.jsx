import "../assets/sass/CarrelloCustom.scss"
import { useEffect, useState } from "react"
import { Button, Card } from "react-bootstrap"

function Carrello() {
  const [carrello, setCarrello] = useState([])
  const deleteCarrello = async (id, id2) => {
    try {
      const response = await fetch(`http://localhost:8080/api/carrello/articoli/${id}/articoli/${id2}`, {
        method: "DELETE",
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

  const getCarello = async () => {
    try {
      const response = await fetch("http://localhost:8080/api/carrello/1", {
        method: "GET",
        headers: {
          Authorization:
            "Bearer eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJ0ZXN0ZXJlci5VQGV4YW1wbGUuY29tIiwiaWF0IjoxNjg0OTQ5NTkzLCJleHAiOjE2ODU1NTQzOTN9.Uy_D0pC92IvkJtDaHPGQsGCunw0OXiZopsbp-T5AiaML46F7ilGkTXAb45X0x3SI",
          "Content-Type": "application/json",
        },
      })
      console.log(response)
      if (response.ok) {
        const { articoli } = await response.json()
        console.log(articoli, "oooooooooooooo")
        setCarrello(articoli)
      }
    } catch (error) {
      alert("testComment", error)
    }
  }

  useEffect(() => {
    getCarello()
  }, [])

  return (
    <>
      <div className="d-flex justify-content-between  flex-wrap mt-5">
        {carrello.map((e, i) => (
          <Card style={{ width: "18rem" }} key={i} className="mt-4 coloresfondo">
            <Card.Img className="h-50 scarpeimg" variant="top" src={e.img} />
            <Card.Title className="text-white text-center">{e.nomeArticoli}</Card.Title>
            <Button className="coloresfondo my-1" variant="primary">
              Acquista ora
            </Button>
            <Button className="coloresfondo my-1" onClick={() => deleteCarrello()} variant="primary">
              Elimina dal carrello
            </Button>
          </Card>
        ))}
      </div>
    </>
  )
}

export default Carrello
