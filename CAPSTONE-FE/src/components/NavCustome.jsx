import "../assets/sass/NavCustom.scss"
import Container from "react-bootstrap/Container"
import Nav from "react-bootstrap/Nav"
import Navbar from "react-bootstrap/Navbar"
import { FiSearch } from "react-icons/fi"
import { BsHeart } from "react-icons/bs"
import { MdOutlineShoppingCart } from "react-icons/md"
import logo from "../assets/LOGOnIKEE.png"
import scritta from "../assets/NIKE SCRITTA.png"

const NavCustom = () => {
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
                <Nav.Link id="scarpeButton" href="scarpe">
                  SCARPE
                </Nav.Link>
              </span>

              <Nav.Link id="felpeButton" href="felpe">
                FELPE
              </Nav.Link>

              <Nav.Link id="cappelliButton" href="cappelli">
                CAPPELLI
              </Nav.Link>

              <Nav.Link href="#features">
                <span>MI PIACE</span>
                <span className="ms-2">
                  <BsHeart />
                </span>
              </Nav.Link>
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
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    </>
  )
}

export default NavCustom
