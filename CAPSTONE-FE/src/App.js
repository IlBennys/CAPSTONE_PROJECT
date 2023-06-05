import "bootstrap/dist/css/bootstrap.min.css"
import { BrowserRouter, Route, Routes } from "react-router-dom"
import { Col, Container, Row } from "react-bootstrap"
import Home from "./components/Home"
import Register from "./components/Register"
import NavCustom from "./components/NavCustome"
import Login from "./components/Login"
import Scarpe from "./components/Scarpe"
import Felpe from "./components/Felpe"
import Cappelli from "./components/Cappelli"
import Carrello from "./components/Carrello"
import OrdineFattura from "./components/OrdineFattura"
import Profilo from "./components/Profilo"
import "./assets/sass/App.scss"
import Ordini from "./components/Ordini"
import Azienda from "./components/Azienda"
function App() {
  return (
    <>
      <BrowserRouter>
        <NavCustom />
        <Container>
          <Row className="d-flex flex-column flex-md-row">
            <Col xs={12} lg={12}>
              <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/register" element={<Register />} />
                <Route path="/azienda" element={<Azienda />} />
                <Route path="/ordini" element={<Ordini />} />
                <Route path="/scarpe" element={<Scarpe />} />
                <Route path="/felpe" element={<Felpe />} />
                <Route path="/cappelli" element={<Cappelli />} />
                <Route path="/profilo" element={<Profilo />} />
                <Route path="/login" element={<Login />} />
                <Route path="/ordine" element={<OrdineFattura />} />
                <Route path="/carrello" element={<Carrello />} />
              </Routes>
            </Col>
          </Row>
        </Container>
      </BrowserRouter>
    </>
  )
}

export default App
