//import logo from "./logo.svg"
import "bootstrap/dist/css/bootstrap.min.css"
import "./assets/sass/App.scss"
import { BrowserRouter, Route, Routes } from "react-router-dom"
import { Col, Container, Row } from "react-bootstrap"
import Home from "./components/Home"
import Register from "./components/Register"
import NavCustom from "./components/NavCustome"
import Login from "./components/Login"
import Scarpe from "./components/Scarpe"
import Felpe from "./components/Felpe"
import Cappelli from "./components/Cappelli"

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
                <Route path="/scarpe" element={<Scarpe />} />
                <Route path="/felpe" element={<Felpe />} />
                <Route path="/cappelli" element={<Cappelli />} />
                <Route path="/login" element={<Login />} />
              </Routes>
            </Col>
          </Row>
        </Container>
      </BrowserRouter>
    </>
  )
}

export default App
