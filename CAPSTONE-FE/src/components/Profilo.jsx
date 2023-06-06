import { Col, Container, Row } from "react-bootstrap"
import "../assets/sass/ProfiloCustom.scss"
import { useSelector } from "react-redux"

const Profilo = () => {
  const user = useSelector((state) => state.user.user)
  console.log(user)

  return (
    <>
      <Container>
        <Row>
          <Col lg={12} className="my-4">
            <div className="divtotale">
              <div className="copertina rounded-3">
                <div className="imgprofilo rounded-circle"></div>
              </div>
            </div>
          </Col>
        </Row>
        <br />
        <Row>
          <Col lg={12} className="my-4">
            <div className="sottocategoria rounded-3 ">
              <div className="ms-2 fs-4 text-center fw-bolder">INFO GENERALI</div>

              <p className="ms-2 text-center mt-2">
                NOME:
                <span className="fw-bold ms-2" style={{ color: "black" }}>
                  {user.firstname}
                </span>
              </p>
              <p className="ms-2 text-center">
                COGNOME:
                <span className="fw-bold ms-2" style={{ color: "black" }}>
                  {user.lastname}
                </span>
              </p>
              <p className="ms-2 text-center">
                DATA DI NASCITA:
                <span className="fw-bold ms-2" style={{ color: "black" }}>
                  {user.dataNascita}
                </span>
              </p>
              <p className="ms-2 text-center">
                USERNAME:
                <span className="fw-bold ms-2" style={{ color: "black" }}>
                  {user.username}
                </span>
              </p>
              <p className="ms-2 text-center">
                EMAIL:
                <span className="fw-bold ms-2" style={{ color: "black" }}>
                  {user.email}
                </span>
              </p>
              <p className="ms-2 text-center">
                INDIRIZZO:
                <span className="fw-bold ms-2" style={{ color: "black" }}>
                  {user.indirizzo}
                </span>
              </p>
              <p className="ms-2 text-center">
                NUMERO DI TELEFONO:
                <span className="fw-bold ms-2" style={{ color: "black" }}>
                  {user.numeroTelefono}
                </span>
              </p>
            </div>
          </Col>
        </Row>
      </Container>
    </>
  )
}

export default Profilo
