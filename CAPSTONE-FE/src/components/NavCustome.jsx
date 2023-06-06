import "../assets/sass/NavCustom.scss"
import Container from "react-bootstrap/Container"
import Nav from "react-bootstrap/Nav"
import Navbar from "react-bootstrap/Navbar"
import { MdOutlineShoppingCart } from "react-icons/md"
import { FaUserCircle } from "react-icons/fa"
import { BsHousesFill } from "react-icons/bs"
import { RiShoppingBag2Fill } from "react-icons/ri"
import logo from "../assets/LOGOnIKEE.png"
import scritta from "../assets/NIKE SCRITTA.png"
import { useEffect } from "react"
import { useDispatch, useSelector } from "react-redux"
import { Badge, Button, NavDropdown } from "react-bootstrap"
import { getCarrello, getUser, logoutUser, svuotaOrdini } from "../redux/actions"

const NavCustom = () => {
  const token = useSelector((state) => state.user.token)
  const dispatch = useDispatch()
  const carrello = useSelector((state) => state.user.carrello)
  const username = useSelector((state) => state.user.username)

  useEffect(() => {
    dispatch(getCarrello(1, token))
    dispatch(getUser(token, username))
    // eslint-disable-next-line react-hooks/exhaustive-deps
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
              <img
                src={logo}
                onClick={() => dispatch(svuotaOrdini())}
                width="100"
                height="55"
                className=""
                alt="pic-logo"
              />
            </span>
          </Navbar.Brand>
          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav className="ms-auto me-auto" style={{ gap: "40px" }}>
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
            </Nav>
            <Nav>
              {token !== "" ? (
                <>
                  <NavDropdown title={`Ciao ${username}`} className="caratteraGrande" id="basic-nav-dropdown">
                    <NavDropdown.Item className="caratteraGrande text-white items" href="/profilo">
                      <span>Il mio profilo</span>
                      <span className="ms-2">
                        <FaUserCircle />
                      </span>
                    </NavDropdown.Item>
                    <NavDropdown.Item
                      className="caratteraGrande text-white items d-flex flex-row justify-content-between"
                      href="/ordini"
                    >
                      I miei ordini
                      <span className="ms-2">
                        <RiShoppingBag2Fill />
                      </span>
                    </NavDropdown.Item>
                    <NavDropdown.Item
                      className="caratteraGrande text-white items d-flex flex-row justify-content-between"
                      href="/azienda"
                    >
                      About Us
                      <span className="ms-2">
                        <BsHousesFill />
                      </span>
                    </NavDropdown.Item>

                    <NavDropdown.Divider />
                    <Button
                      href="/"
                      className="w-100 bottoneItems text-white btn btn-outline-danger p-2"
                      onClick={() => {
                        dispatch(logoutUser())
                      }}
                    >
                      Logout
                    </Button>
                  </NavDropdown>
                  <Nav.Link className="caratteraGrande" href="carrello">
                    <div className="position-relative">
                      <MdOutlineShoppingCart />
                      <Badge className="numeretto" bg="numeretto">
                        {carrello.articoli.length}
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
