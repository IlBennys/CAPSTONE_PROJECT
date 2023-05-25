import "../assets/sass/NavCustom.scss"
import Container from "react-bootstrap/Container"
import Nav from "react-bootstrap/Nav"
import Navbar from "react-bootstrap/Navbar"
import { FiSearch } from "react-icons/fi"
import { BsHeart } from "react-icons/bs"
import { MdOutlineShoppingCart } from "react-icons/md"
import logo from "../assets/LOGOnIKEE.png"
import scritta from "../assets/NIKE SCRITTA.png"
import { useEffect, useState } from "react"

const NavCustom = () => {
  const [utente, setUtente] = useState([])
  const [isLogged, setisLogged] = useState(false)

  const getUser = async () => {
    try {
      const response = await fetch("http://localhost:8080/api/user/1", {
        method: "GET",
        headers: {
          Authorization:
            "Bearer eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJ0ZXN0ZXJlci5VQGV4YW1wbGUuY29tIiwiaWF0IjoxNjg1MDI5MTk1LCJleHAiOjE2ODU2MzM5OTV9.Z6TXffusNZrKvSIqzHu9QR-QOTv1aOMFAZYUkQO-XZkAXRhyue807Tu6HBU31wSl",
          "Content-Type": "application/json",
        },
      })
      console.log(response)
      if (response.ok) {
        const data = await response.json()
        console.log(data, "oooooooooooooooooooooooooooooooooo")
        setUtente(data)
        setisLogged(true)
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
  useEffect(() => {
    getUser()
  }, [])

  return (
    <>
      <Navbar className="Navbare" collapseOnSelect expand="lg" variant="dark">
        <Container>
          <Navbar.Brand href="/">
            <span>
              <img src={scritta} width="150" height="70" className="" alt="pic-logo" />
            </span>
            <span id="logonike">
              <img src={logo} width="100" height="55" className="" alt="pic-logo" />
            </span>
          </Navbar.Brand>
          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav className="ms-auto me-auto">
              <span>
                <Nav.Link className="caratteraGrande" id="scarpeButton" href="scarpe">
                  SCARPE
                </Nav.Link>
              </span>

              <Nav.Link className="caratteraGrande" id="felpeButton" href="felpe">
                FELPE
              </Nav.Link>

              <Nav.Link className="caratteraGrande" id="cappelliButton" href="cappelli">
                CAPPELLI
              </Nav.Link>

              <Nav.Link className="caratteraGrande" href="#features">
                <span>MI PIACE</span>
                <span className="ms-2">
                  <BsHeart />
                </span>
              </Nav.Link>
            </Nav>
            <Nav>
              <Nav.Link className="caratteraGrande" href="carrello">
                <MdOutlineShoppingCart />
              </Nav.Link>
              <Nav.Link className="caratteraGrande" eventKey={2} href="#memes">
                <FiSearch />
              </Nav.Link>
              {isLogged ? (
                <Nav>
                  <Nav.Link className="caratteraGrande">{utente.username}</Nav.Link>{" "}
                </Nav>
              ) : (
                <Nav>
                  <Nav.Link className="caratteraGrande" href="login">
                    accedi
                  </Nav.Link>
                  <Nav.Link className="caratteraGrande" href="register">
                    registrati
                  </Nav.Link>
                </Nav>
              )}
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    </>
  )
}

export default NavCustom
