import { Button, Card } from "react-bootstrap"
import { useDispatch, useSelector } from "react-redux"
import { creaFattura, getFattura, getOrdine } from "../redux/actions"
import jsPDF from "jspdf"
import { useEffect } from "react"

const OrdineFattura = () => {
  const token = useSelector((state) => state.user.token)
  const ordine = useSelector((state) => state.user.ordine)
  const fattura = useSelector((state) => state.user.fattura)
  const dispatch = useDispatch()

  const creaPDF = () => {
    let doc = new jsPDF()
    doc.text(20, 20, `IL TUO ORDINE: ${ordine.numeroOrdine}`)
    doc.text(20, 30, `IN STATO: ${ordine.statoOrdine}`)
    doc.text(20, 40, `EFFETTUATO DA: ${ordine.azienda.nomeAzienda}`)
    doc.text(20, 50, `SARA' CONSEGNATO AL TUO INDIRIZZO: ${ordine.user.indirizzo}`)
    doc.text(20, 60, `IN DATA: ${ordine.dataConsegna}`)
    doc.text(20, 70, `PREZZO TOTALE FATTURA: ${fattura.importoTotale}`)

    doc.save("Fattura.pdf")
  }

  useEffect(() => {
    dispatch(getOrdine(1, token))
  }, [])
  return (
    <>
      <div className="rounded-3  my-4" style={{ height: "50vh", backgroundColor: "white" }}>
        <p>NUMERO ORDINE: {ordine.numeroOrdine}</p>
        <p> DATA ORDINE: {ordine.dataOrdine}</p>
        <p> DATA CONSEGNA: {ordine.dataConsegna}</p>
        <p> PREZZO CONSEGNA: {ordine.prezzoConsegna}</p>
        {ordine.carrello.articoli.map((e) => (
          <Card>
            <Card.Text className="text-center">
              <img src={e.img} alt="pic-shoes"></img>
            </Card.Text>
            <Card.Text className="text-center">{e.nomeArticoli}</Card.Text>
          </Card>
        ))}
        <Button
          className="my-4"
          onClick={() => {
            dispatch(creaFattura(0, token))
            dispatch(() => getFattura(0, token))
            creaPDF()
          }}
        >
          SCARICA FATTURA
        </Button>
      </div>
    </>
  )
}

export default OrdineFattura
