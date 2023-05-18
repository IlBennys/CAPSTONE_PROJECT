//import { useState } from "react"
import "../assets/sass/NavCustom.scss"
import Container from "react-bootstrap/Container"
import Nav from "react-bootstrap/Nav"
import Navbar from "react-bootstrap/Navbar"
import { FiSearch } from "react-icons/fi"
import { MdOutlineShoppingCart } from "react-icons/md"
import logo from "../assets/nike.png"

const NavCustom = () => {
  //const [isLoggedIn, setIsLoggedIn] = useState(false)

  return (
    <Navbar className="Navbar" collapseOnSelect expand="lg" variant="dark">
      <Container>
        <Navbar.Brand href="/">
          <img src={logo} alt="pic-logo" style={{ color: "white", width: "50px" }} />
        </Navbar.Brand>
        <Navbar.Toggle aria-controls="responsive-navbar-nav" />
        <Navbar.Collapse id="responsive-navbar-nav">
          <Nav className="me-auto ms-auto">
            <Nav.Link href="#features">Mi Piace</Nav.Link>
            <Nav.Link href="#pricing">Men</Nav.Link>
          </Nav>
          <Nav>
            <Nav.Link href="#deets">
              <MdOutlineShoppingCart />
            </Nav.Link>
            <Nav.Link eventKey={2} href="#memes">
              <FiSearch />
            </Nav.Link>
            <Nav>
              <Nav.Link href="login">accedi</Nav.Link>
              <Nav.Link href="register">registrati</Nav.Link>
            </Nav>
            {/* {isLoggedIn ? (
              <>
                <Nav.Link href="login">accedi</Nav.Link>
                <Nav.Link href="register">registrati</Nav.Link>
              </>
            ) : (
              <>
                <Nav.Link onClick={setIsLoggedIn(true)} href="register">
                  registrati
                </Nav.Link>
              </>
            )} */}
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  )
}

export default NavCustom
