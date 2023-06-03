import "../assets/sass/OrdineFatturaCustom.scss"

import { Button, Card, Container } from "react-bootstrap"
import { useDispatch, useSelector } from "react-redux"
import { creaFattura, getFattura, getOrdine, trovaIdOrdine } from "../redux/actions"
import jsPDF from "jspdf"
import { useEffect, useState } from "react"

const OrdineFattura = () => {
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
    if (carrello.articoli.length > 0) {
      prezzoTotale = carrello.articoli.reduce((acc, articolo) => {
        return acc + articolo.prezzo
      }, 0)
    }
    prezzoTotale += ordine.prezzoConsegna
    const iva = prezzoTotale * 0.22
    prezzoTotale += iva

    // CALCOLA IL COLORE DEL TESTO
    const schiarimentoPercentuale = 0.8
    const red = Math.round(128 + (255 - 128) * schiarimentoPercentuale)
    const green = 0
    const blue = 0

    doc.setTextColor(red, green, blue)
    doc.setFont("Times", "bold")
    doc.setFontSize(30)
    doc.text(60, 20, `${ordine.azienda.nomeAzienda}`)
    doc.setTextColor(0, 0, 128)
    doc.setFont("Times", "normal")
    doc.setFontSize(12)
    doc.text(10, 30, `DATI ORDINE:`)
    doc.setTextColor(0, 0, 0)
    doc.text(10, 45, `IL TUO ORDINE: ${ordine.numeroOrdine}`)
    doc.text(10, 55, `IN STATO: ${ordine.statoOrdine}`)
    doc.text(10, 65, `RIEPILOGO: ${ordine.riepilogoOrdine}`.toLocaleUpperCase())
    doc.setTextColor(0, 0, 128)
    doc.text(10, 90, `DATI AZIENDA:`)
    doc.setTextColor(0, 0, 0)
    doc.text(10, 105, `${ordine.azienda.nomeAzienda}`)
    doc.text(10, 115, `P.IVA: ${ordine.azienda.partitaIva}`)
    doc.text(10, 125, `CODICE FISCALE: ${ordine.azienda.codiceFiscale}`)
    doc.text(10, 135, `PEC: ${ordine.azienda.pec}`)
    doc.text(10, 145, `CON SEDE LEGALE: ${ordine.azienda.citta}`)
    doc.setTextColor(255, 0, 0)
    doc.setFontSize(18)
    doc.setFont("Times", "bold")
    doc.text(20, 160, `PREZZO TOTALE FATTURA (IVA INCLUSA):   ${prezzoTotale.toFixed(2)}€`)

    doc.save("Fattura Energy Shoes")
  }

  useEffect(() => {
    dispatch(trovaIdOrdine(token, user.id, user.id, carrello.articoli))
    dispatch(getOrdine(idOrdine, token))
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [])

  return (
    <>
      <div className="divTOtt">
        <Container className="containe ">
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
          <Container className="d-flex flex-row align-items-center justify-content-center">
            {ordine.carrello.articoli.map((e, i) => (
              <Card className="card-custom BLUES" key={i}>
                <Card.Img src={e.img} className="card-custom-img text-center h-50" variant="top" />
                <Card.Title className="text-black text-center">{e.nomeArticoli}</Card.Title>
              </Card>
            ))}
          </Container>
          <div className=" d-flex flex-row align-items-center justify-content-center">
            <Button
              className="my-4 BLUES text-black fw-bolder"
              onClick={() => {
                dispatch(creaFattura(idOrdine, token))
                dispatch(getFattura(idOrdine, token))
                setOrdineConfermato(true)
              }}
            >
              CONFERMA ORDINE
            </Button>

            {ordineConfermato && (
              <Button className="BLUES text-black fw-bolder ms-4" onClick={() => creaPDF()}>
                SCARICA FATTURA
              </Button>
            )}
          </div>
        </Container>
      </div>
    </>
  )
}

export default OrdineFattura
