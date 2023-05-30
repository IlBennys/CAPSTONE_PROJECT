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
import { useDispatch, useSelector } from "react-redux"
import { Badge, Button, NavDropdown } from "react-bootstrap"
import { getCarrello, logoutUser } from "../redux/actions"

const NavCustom = () => {
  const [isLogged, setisLogged] = useState(false)
  const token = useSelector((state) => state.user.token)
  const dispatch = useDispatch()
  const carrello = useSelector((state) => state.user.carrello)
  const idUser = useSelector((state) => state.user.username)
  const [u, setU] = useState([])

  const getUser = async () => {
    try {
      const response = await fetch("http://localhost:8080/api/user", {
        method: "GET",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        const data = await response.json()
        console.log(data, "data")
        const ut = data.filter((e) => e.username === idUser)
        console.log(ut, "filter")
        setU(ut[0])
        console.log(ut, "u")
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
  useEffect(() => {
    dispatch(getCarrello(1, token), getUser())
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
              {token !== "" ? (
                <>
                  <NavDropdown title={`Ciao ${u.username}`} className="caratteraGrande" id="basic-nav-dropdown">
                    <NavDropdown.Item className="caratteraGrande" href="/profilo">
                      Il mio profilo
                    </NavDropdown.Item>
                    <NavDropdown.Item className="caratteraGrande" href="/ordini">
                      I miei ordini
                    </NavDropdown.Item>
                    <NavDropdown.Item className="caratteraGrande" href="/preferiti">
                      Preferiti
                    </NavDropdown.Item>
                    <NavDropdown.Divider />
                    <Button
                      className="w-100"
                      onClick={() => {
                        dispatch(logoutUser())
                      }}
                    >
                      Logout
                    </Button>
                  </NavDropdown>
                  <Nav.Link className="caratteraGrande" eventKey={2} href="#memes">
                    <FiSearch />
                  </Nav.Link>
                  <Nav.Link className="caratteraGrande" href="carrello">
                    <div className="position-relative">
                      <MdOutlineShoppingCart />{" "}
                      <Badge className="numeretto" bg="numeretto">
                        {carrello.length}
                      </Badge>
                    </div>
                  </Nav.Link>
                </>
              ) : (
                <>
                  <Nav.Link className="caratteraGrande" href="/login">
                    Accedi
                  </Nav.Link>
                  <Nav.Link className="caratteraGrande" href="/register">
                    registrati
                  </Nav.Link>
                </>
              )}
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    </>
  )
}

export default NavCustom
