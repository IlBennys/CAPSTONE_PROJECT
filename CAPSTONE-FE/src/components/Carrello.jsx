import "../assets/sass/CarrelloCustom.scss"
import { useEffect, useState } from "react"
import { Button, Card } from "react-bootstrap"
import { useDispatch, useSelector } from "react-redux"
import { creaOrdine } from "../redux/actions"

function Carrello() {
  const [carrello, setCarrello] = useState([])
  const [stato, setStato] = useState(false)
  const token = useSelector((state) => state.user.token)
  const dispatch = useDispatch()

  const deleteCarrello = async (id, id2) => {
    try {
      const response = await fetch(`http://localhost:8080/api/carrello/${id}/articoli/${id2}`, {
        method: "DELETE",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      console.log(response)
      if (response.ok) {
        alert("Articolo eliminato con successo.")
        setCarrello((prevCarrello) => prevCarrello.filter((e) => e.id !== id2))
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
          Authorization: `Bearer ${token}`,
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
  }, [stato])

  return (
    <>
      <div className="d-flex justify-content-between  flex-wrap mt-5">
        {carrello.map((e, i) => (
          <Card style={{ width: "18rem" }} key={i} className="mt-4 coloresfondo">
            <Card.Img className="h-50 scarpeimg" variant="top" src={e.img} />
            <Card.Title className="text-white text-center">{e.nomeArticoli}</Card.Title>

            <Button
              className="coloresfondo my-1"
              onClick={() => {
                deleteCarrello(1, e.id)
              }}
              variant="primary"
            >
              Elimina dal carrello
            </Button>
          </Card>
        ))}
        <Button
          className="coloresfondo w-50 h-50 mt-5 d-flex justify-content-center align-items-center"
          variant="primary"
          onClick={() => dispatch(creaOrdine(1, 1, token))}
        >
          Acquista ora
        </Button>
      </div>
    </>
  )
}

export default Carrello
