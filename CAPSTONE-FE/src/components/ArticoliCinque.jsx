import { useEffect, useState } from "react"
import { Card, Container } from "react-bootstrap"
import "../assets/sass/HomeCustom.scss"

const ArticoliCinque = () => {
  const [scarpe, setscarpe] = useState([])

  const getArticoli = async () => {
    try {
      const response = await fetch("http://localhost:8080/api/articolo", {
        method: "GET",
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
      <>
        <Container className="pb-5 contenitore">
          <div className="d-flex flex-row align-items-center justify-content-around">
            {scarpe.slice(0, 5).map((e, i) => (
              <Card
                style={{ width: "18rem", height: "110px", backgroundColor: "rgb(23 55 115 / 76%)" }}
                className="rounded-3 ms-3 d-flex flex-row"
                key={i}
              >
                <Card.Img className="h-100 imgscarpee" variant="top" src={e.img} />
                <Card.Text className=" d-flex flex-row align-items-center text-white">
                  <a className="a12" href="http://localhost:3000/scarpe">
                    Prezzo: {e.prezzo}€ <br /> Prendilo!
                  </a>
                </Card.Text>
              </Card>
            ))}
          </div>
        </Container>
      </>
    </>
  )
}

export default ArticoliCinque
