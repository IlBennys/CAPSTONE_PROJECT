//import logo from "./logo.svg"
import "bootstrap/dist/css/bootstrap.min.css"
import "./assets/sass/App.scss"
import { BrowserRouter, Route, Routes } from "react-router-dom"
import { Col, Container, Row } from "react-bootstrap"

function App() {
  return (
    <>
      <BrowserRouter>
        <Container>
          <Row className="d-flex flex-column flex-md-row">
            <Col xs={12} lg={12}>
              <Routes>
                <Route path="/" element={<></>} />
              </Routes>
            </Col>
          </Row>
        </Container>
      </BrowserRouter>
    </>
  )
}

export default App
