import "../assets/sass/OrdiniCustom.scss"
import { AiOutlineCloseCircle } from "react-icons/ai"
import { useEffect } from "react"
import { useDispatch, useSelector } from "react-redux"
import { getOrdini } from "../redux/actions"
import { Container, Table } from "react-bootstrap"

const Ordini = () => {
  const ordini = useSelector((state) => state.user.ordini)
  const token = useSelector((state) => state.user.token)
  const idUser = useSelector((state) => state.user.user)
  const idCarrello = useSelector((state) => state.user.idCarrello)
  console.log(idUser, "questo mio")

  const dispatch = useDispatch()

  useEffect(() => {
    dispatch(getOrdini(token, idUser.id, idCarrello))
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [])

  return (
    <>
      <Container>
        <h1 className="mt-2">I MIEI ORDINI:</h1>
        {ordini.length === 0 ? (
          <h2 className="text-center text-white">
            Non hai ordini <AiOutlineCloseCircle />
          </h2>
        ) : (
          ordini.map((e, i) => (
            <div key={i}>
              <Table striped bordered hover variant="dark" className="mt-5 rounded">
                <thead>
                  <tr>
                    <th className="text-center">Ordine</th>
                    <th className="text-center">Numero Ordine</th>
                    <th className="text-center">Stato Ordine</th>
                    <th className="text-center">Riepilogo Ordine</th>
                    <th className="text-center">Data Ordine</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td className="text-center">{e.id}</td>
                    <td className="text-center">{e.numeroOrdine}</td>
                    <td className="text-center">{e.statoOrdine}</td>
                    <td className="text-center">{e.riepilogoOrdine}</td>
                    <td className="text-center">{e.dataOrdine}</td>
                  </tr>
                </tbody>
              </Table>
            </div>
          ))
        )}
      </Container>
    </>
  )
}

export default Ordini
