import "../assets/sass/CarrelloCustom.scss"
import { useEffect, useState } from "react"
import { Button, Card, Container, Modal } from "react-bootstrap"
import { useDispatch, useSelector } from "react-redux"
import { creaOrdine, deleteCarrello, getCarrello } from "../redux/actions"
import { BsCartX } from "react-icons/bs"

function Carrello() {
  const token = useSelector((state) => state.user.token)
  const user = useSelector((state) => state.user.user)
  const carrello = useSelector((state) => state.user.carrello)
  const dispatch = useDispatch()
  const [show, setShow] = useState(false)

  const handleClose = () => setShow(false)
  const handleShow = () => setShow(true)

  useEffect(() => {
    dispatch(getCarrello(user.id, token))
  }, [dispatch, user.id, token])

  const handleDeleteItem = (itemId) => {
    dispatch(deleteCarrello(user.id, itemId, token))
    dispatch(getCarrello(1, token))
  }

  useEffect(() => {
    const updatedArticoli = carrello.articoli.filter((e) => e.id !== carrello.itemDeletedId)
    const updatedCarrello = { ...carrello, articoli: updatedArticoli }
    dispatch({ type: "SET_CARRELLO", payload: updatedCarrello })
  }, [carrello, dispatch])

  return (
    <>
      <Container className="p-4">
        <div className="d-flex justify-content-evenly flex-wrap mt-5">
          {carrello.articoli.map((e, i) => (
            <Card style={{ width: "18rem" }} key={i} className="mt-4 coloresfondo">
              <Card.Img className="h-50 scarpeimg" variant="top" src={e.img} />
              <Card.Title className="text-white text-center mt-3">{e.nomeArticoli}</Card.Title>
              <Card.Title className="text-white text-center mt-3">{e.prezzo}€</Card.Title>
              <Button
                className="coloresfondo"
                onClick={() => {
                  handleDeleteItem(e.id)
                  handleShow()
                }}
                variant="primary"
              >
                Elimina dal carrello
              </Button>
            </Card>
          ))}
        </div>
        <div className=" d-flex justify-content-center align-items-center">
          <Button
            type="button"
            className="coloresfondo w-25 h-50 mt-5  BOOO"
            variant="primary"
            disabled={carrello.articoli.length === 0}
            onClick={() => {
              dispatch(creaOrdine(user.id, user.id, token))
            }}
          >
            Acquista ora
          </Button>
        </div>
      </Container>

      <Modal show={show} onHide={handleClose} centered>
        <Modal.Header className="spanneriz d-flex justify-content-center align-items-center">
          <Modal.Title className="spanneriz">ARTICOLO ELIMINATO!</Modal.Title>
        </Modal.Header>
        <Modal.Body className="spanneriz fs-4">
          <span className="spanneriz">Il tuo articolo é stato eliminato con successo</span>
          <span className="fs-6 ms-3 text-white" style={{ opacity: "40%" }}>
            <BsCartX />
          </span>
          <span className="fs-5 ms-3 text-white" style={{ opacity: "60%" }}>
            <BsCartX />
          </span>
          <span className="fs-4 ms-3 text-white" style={{ opacity: "80%" }}>
            <BsCartX />
          </span>
          <span className="fs-3 ms-3 text-white">
            <BsCartX />
          </span>
        </Modal.Body>
        <Modal.Footer className="spanneriz">
          <Button variant="danger" className="spanneriz bottonesp" onClick={handleClose}>
            CHIUDI
          </Button>
        </Modal.Footer>
      </Modal>
    </>
  )
}

export default Carrello
