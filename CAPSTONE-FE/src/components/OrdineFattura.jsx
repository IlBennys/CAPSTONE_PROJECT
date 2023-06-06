import "../assets/sass/OrdineFatturaCustom.scss"
import loghino from "../assets/palla.png"
import { Button, Card, Container, Row } from "react-bootstrap"
import { useDispatch, useSelector } from "react-redux"
import { creaFattura, deleteCarrello, getCarrello, getFattura, trovaIdOrdine } from "../redux/actions"
import jsPDF from "jspdf"
import { useEffect, useState } from "react"

const OrdineFattura = () => {
  const imglogo = `${loghino}`
  const token = useSelector((state) => state.user.token)
  const ordine = useSelector((state) => state.user.ordine)
  const user = useSelector((state) => state.user.user)
  const carrello = useSelector((state) => state.user.carrello)
  const idOrdine = useSelector((state) => state.user.idOrdine)
  const [ordineConfermato, setOrdineConfermato] = useState(false)
  const dispatch = useDispatch()

  const creaPDF = () => {
    let doc = new jsPDF()

    // CALCOLA IL PREZZO TOTALE DELLA FATTURA
    let prezzoTotale = 0
    if (ordine.articoli.length > 0) {
      prezzoTotale = ordine.articoli.reduce((acc, articolo) => {
        return acc + articolo.prezzo
      }, 0)
    }
    prezzoTotale += ordine.prezzoConsegna
    const iva = prezzoTotale * 0.22

    // CALCOLA IL COLORE DEL TESTO
    const schiarimentoPercentuale = 0.8
    const red = Math.round(128 + (255 - 128) * schiarimentoPercentuale)
    const green = 0
    const blue = 0

    // INTESTAZIONE
    doc.addImage(imglogo, "png", 195, -20, 60, 30, null, null, 180)
    doc.setTextColor(red, green, blue)
    doc.setFont("Times", "bold")
    doc.setFontSize(30)
    doc.text(60, 20, `${ordine.azienda.nomeAzienda}`)

    // ORDINE
    doc.setTextColor(0, 0, 128)
    doc.setFont("Times", "bold")
    doc.setFontSize(12)
    doc.text(10, 25, `DATI ORDINE:`)
    doc.setFont("Times", "normal")
    doc.setTextColor(0, 0, 0)
    doc.text(10, 35, `IL TUO ORDINE: ${ordine.numeroOrdine}`)
    doc.text(
      10,
      45,
      `DESTINATARIO: ${user.lastname}`.toLocaleUpperCase() + " " + `${user.firstname}`.toLocaleUpperCase()
    )
    doc.text(10, 55, `IN STATO: ${ordine.statoOrdine}`)
    doc.text(10, 65, `RIEPILOGO: ${ordine.riepilogoOrdine}`.toLocaleUpperCase())

    doc.line(10, 75, 190, 75, "S")

    // AZIENDA
    doc.setTextColor(0, 0, 128)
    doc.setFont("Times", "bold")
    doc.text(10, 85, `DATI AZIENDA:`)
    doc.setTextColor(0, 0, 0)
    doc.setFont("Times", "normal")
    doc.text(10, 95, `${ordine.azienda.nomeAzienda}`)
    doc.text(10, 105, `P.IVA: ${ordine.azienda.partitaIva}`)
    doc.text(10, 115, `CODICE FISCALE: ${ordine.azienda.codiceFiscale}`)
    doc.text(10, 125, `PEC: ${ordine.azienda.pec}`)
    doc.text(10, 135, `CON SEDE LEGALE: ${ordine.azienda.citta}`)

    // TABELLA ARTICOLI
    doc.setTextColor(0, 0, 128)
    doc.setFont("Times", "bold")
    doc.setFontSize(10)
    doc.text(12, 157, `DATI PRODOTTI:`, { maxWidth: 20 })
    doc.text(75, 160, `SPECIFICHE PRODOTTI:`)
    doc.text(165, 160, `PREZZO:`, { maxWidth: 20 })
    doc.setTextColor(0, 0, 0)
    doc.setFontSize(12)
    doc.line(10, 162, 190, 162, "S")
    doc.line(10, 152, 190, 152, "S")
    doc.line(10, 152, 10, 162, "S")
    doc.line(35, 152, 35, 162, "S")
    doc.line(155, 152, 155, 162, "S")
    doc.line(190, 152, 190, 162, "S")
    ordine?.articoli?.map(
      (e, i) => (
        // orizzontale
        // eslint-disable-next-line no-sequences
        doc.line(10, 172 + i * 10, 190, 172 + i * 10, "S"),
        // verticale 1
        doc.line(10, 165 + i * 10, 10, 172 + i * 10, "S"),
        // verticale 2
        doc.line(35, 165 + i * 10, 35, 172 + i * 10, "S"),
        // verticale 3
        doc.line(155, 165 + i * 10, 155, 172 + i * 10, "S"),
        // verticale 4
        doc.line(190, 165 + i * 10, 190, 172 + i * 10, "S"),
        doc.text(20, 170 + i * 10, `P - ${e.id}`),
        doc.text(50, 169 + i * 10, `${e.nomeArticoli}`),
        doc.text(80, 169 + i * 10, `COLORE - ${e.descrizioneArticolo}`),
        doc.text(158, 170 + i * 10, `€ ${e.prezzo} + IVA 22%`)
      )
    )

    doc.setTextColor(255, 0, 0)
    doc.setFont("Times", "bold")
    //orizzontale
    doc.line(10, 265, 190, 265, "S")
    //verticale 1
    doc.line(10, 265, 10, 275, "S")
    // verticale 2
    doc.line(35, 265, 35, 275, "S")
    //verticale 3
    doc.line(120, 265, 120, 275, "S")
    //verticale 5
    doc.line(190, 265, 190, 275, "S")
    doc.text(20, 273, `N.${ordine.articoli.length}`)
    doc.text(40, 273, `BASE IMPONIBILE: ${prezzoTotale.toFixed(2)}€`)
    doc.text(122, 273, `IMPORTO TOTALE: ${(prezzoTotale + iva).toFixed(2)}€`)
    doc.line(10, 275, 190, 275, "S")

    doc.save("Fattura Energy Shoes")
  }

  const deleteAllArticoli = () => {
    ordine.articoli.forEach((e) => {
      dispatch(deleteCarrello(user.id, e.id, token))
      dispatch(getCarrello(user.id, token))
    })
  }

  useEffect(() => {
    dispatch(trovaIdOrdine(token, user.id, user.id, carrello.articoli))
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [])

  return (
    <>
      <div className="divTOtt">
        <Container className="containe ">
          <Row>
            <Card className="rounded-3 my-3 BLUES">
              <Card.Text className="text-center text-black mt-2">
                NUMERO ORDINE:<span className="fw-bold text-black"> {ordine.numeroOrdine}</span>
              </Card.Text>
              <Card.Text className="text-center text-black mt-2">
                DATA ORDINE: <span className="fw-bold text-black">{ordine.dataOrdine}</span>
              </Card.Text>
              <Card.Text className="text-center text-black mt-2">
                DATA CONSEGNA: <span className="fw-bold text-black">{ordine.dataConsegna}</span>
              </Card.Text>
              <Card.Text className="text-center text-black my-2 ">
                PREZZO CONSEGNA: <span className="fw-bold text-black">{ordine.prezzoConsegna}€</span>
              </Card.Text>
            </Card>
          </Row>
          <Row className="d-flex flex-row align-items-center justify-content-center">
            {ordine?.articoli?.map((e, i) => (
              <Card className="card-custom BLUES" key={i}>
                <Card.Img src={e.img} className="card-custom-img text-center h-50" variant="top" />
                <Card.Title className="text-black text-center">{e.nomeArticoli}</Card.Title>
              </Card>
            ))}
          </Row>
          <Row>
            <div className=" d-flex flex-row align-items-center justify-content-center">
              <Button
                className="my-4 BLUES text-black fw-bolder"
                onClick={() => {
                  dispatch(creaFattura(idOrdine, token))
                  dispatch(getFattura(idOrdine, token))
                  setOrdineConfermato(true)
                  deleteAllArticoli()
                }}
              >
                CONFERMA ORDINE
              </Button>

              {ordineConfermato && (
                <Button
                  className="BLUES text-black fw-bolder ms-4"
                  onClick={() => {
                    creaPDF()
                  }}
                >
                  SCARICA FATTURA
                </Button>
              )}
            </div>
          </Row>
        </Container>
      </div>
    </>
  )
}

export default OrdineFattura
