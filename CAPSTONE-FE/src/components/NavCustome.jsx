import { useState } from "react"
import Container from "react-bootstrap/Container"
import Nav from "react-bootstrap/Nav"
import Navbar from "react-bootstrap/Navbar"
import { FiSearch } from "react-icons/fi"

const NavCustom = () => {
  //const [isLoggedIn, setIsLoggedIn] = useState(false)

  return (
    <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
      <Container>
        <Navbar.Brand href="/">React-Bootstrap</Navbar.Brand>
        <Navbar.Toggle aria-controls="responsive-navbar-nav" />
        <Navbar.Collapse id="responsive-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="#features">Features</Nav.Link>
            <Nav.Link href="#pricing">Pricing</Nav.Link>
          </Nav>
          <Nav>
            <Nav.Link href="#deets">More deets</Nav.Link>
            <Nav.Link eventKey={2} href="#memes">
              <FiSearch />
            </Nav.Link>
            <Nav.Link href="login">accedi</Nav.Link>
            <Nav.Link href="register">registrati</Nav.Link>

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
