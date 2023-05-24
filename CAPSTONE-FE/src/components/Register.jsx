import "../assets/sass/RegisterCustom.scss"
import { useState } from "react"
import { Button, Col, Form, InputGroup, Row } from "react-bootstrap"
import { RiLockPasswordFill } from "react-icons/ri"
function Register() {
  const user = {
    firstname: "",
    lastname: "",
    username: "",
    email: "",
    password: "",
    dataNascita: "",
    indirizzo: "",
    numeroTelefono: "",
    roles: ["ROLE_USER"],
  }

  const [input, setInput] = useState(user)
  const [validated, setValidated] = useState(false)

  const handleSubmit = (event) => {
    const form = event.currentTarget
    if (form.checkValidity() === false) {
      event.preventDefault()
      event.stopPropagation()
    }
    setValidated(true)
  }

  const handleChange = (field, value) => {
    setInput((prev) => ({ ...prev, [field]: value }))
  }

  const postRegistrazione = async () => {
    try {
      const response = await fetch("http://localhost:8080/api/auth/register", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(input),
      })
      console.log(response)
      if (response.ok) {
        const loginUrl = "http://localhost:3000/login"
        window.location.href = loginUrl
      }
    } catch (error) {
      alert("Bad Request", error)
    }
  }

  return (
    <>
      <div className="MIX rounded-3 d-flex flex-column  mt-4 mb-3">
        <Form noValidate validated={validated} onSubmit={handleSubmit}>
          <Row className="d-flex flex-column align-items-center mb-3">
            <Form.Group
              as={Col}
              md="4"
              className="d-flex flex-column align-items-center"
              controlId="validationCustom01"
            >
              <Form.Label id="label" className="text-white fw-semibold fst-italic">
                Nome
              </Form.Label>
              <Form.Control
                id="coloreRegister"
                required
                type="text"
                placeholder="Nome"
                onChange={(e) => handleChange("firstname", e.target.value)}
              />
              <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
            </Form.Group>
            <Form.Group
              as={Col}
              md="4"
              className="d-flex flex-column align-items-center"
              controlId="validationCustom02"
            >
              <Form.Label id="label" className="text-white fw-semibold fst-italic">
                Cognome
              </Form.Label>
              <Form.Control
                required
                id="coloreRegister"
                type="text"
                placeholder="Cognome"
                onChange={(e) => handleChange("lastname", e.target.value)}
              />
              <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
            </Form.Group>
            <Form.Group
              as={Col}
              md="4"
              className="d-flex flex-column align-items-center"
              controlId="validationCustomUsername"
            >
              <Form.Label id="label" className="text-white fw-semibold fst-italic">
                Username
              </Form.Label>
              <InputGroup hasValidation>
                <Form.Control
                  type="text"
                  placeholder="Username"
                  aria-describedby="inputGroupPrepend"
                  required
                  id="coloreRegister"
                  onChange={(e) => handleChange("username", e.target.value)}
                />
                <Form.Control.Feedback type="invalid">Please choose a username.</Form.Control.Feedback>
              </InputGroup>
            </Form.Group>

            <Form.Group
              as={Col}
              md="4"
              className="d-flex flex-column align-items-center"
              controlId="validationCustom02"
            >
              <Form.Label id="label" className="text-white fw-semibold fst-italic">
                data di nascita
              </Form.Label>
              <Form.Control
                className="text-white"
                required
                id="coloreRegister"
                type="date"
                onChange={(e) => handleChange("dataNascita", e.target.value)}
              />
              <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
            </Form.Group>

            <Form.Group
              as={Col}
              md="4"
              className="d-flex flex-column align-items-center"
              controlId="validationCustom02"
            >
              <Form.Label id="label" className="text-white fw-semibold fst-italic">
                indirizzo
              </Form.Label>
              <Form.Control
                required
                id="coloreRegister"
                type="text"
                placeholder="inserire indirizzo"
                onChange={(e) => handleChange("indirizzo", e.target.value)}
              />
              <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
            </Form.Group>

            <Form.Group
              as={Col}
              md="4"
              className="d-flex flex-column align-items-center"
              controlId="validationCustom02"
            >
              <Form.Label id="label" className="text-white fw-semibold fst-italic">
                numero di telefono
              </Form.Label>
              <Form.Control
                required
                id="coloreRegister"
                type="phone"
                placeholder="inserire numero di telefono"
                onChange={(e) => handleChange("numeroTelefono", e.target.value)}
              />
              <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
            </Form.Group>
            <Form.Group
              as={Col}
              md="4"
              className="d-flex flex-column align-items-center"
              controlId="validationCustomEmail"
            >
              <Form.Label id="label" className="text-white fw-semibold fst-italic">
                E-mail
              </Form.Label>
              <InputGroup hasValidation>
                <InputGroup.Text id="inputGroupPrepend">@</InputGroup.Text>
                <Form.Control
                  type="email"
                  placeholder="email"
                  aria-describedby="inputGroupPrepend"
                  required
                  id="coloreRegister"
                  onChange={(e) => handleChange("email", e.target.value)}
                />
                <Form.Control.Feedback type="invalid">inserisci la tua email.</Form.Control.Feedback>
              </InputGroup>
            </Form.Group>
            <Form.Group
              as={Col}
              md="4"
              className="d-flex flex-column align-items-center"
              controlId="validationCustomPassword"
            >
              <Form.Label id="label" className="text-white fw-semibold fst-italic">
                Password
              </Form.Label>
              <InputGroup hasValidation>
                <InputGroup.Text id="inputGroupPrepend3">
                  <RiLockPasswordFill />
                </InputGroup.Text>
                <Form.Control
                  id="coloreRegister"
                  type="password"
                  placeholder="Password"
                  aria-describedby="inputGroupPrepend3"
                  required
                  onChange={(e) => handleChange("password", e.target.value)}
                />
                <Form.Control.Feedback type="invalid">inserisci la tua password.</Form.Control.Feedback>
              </InputGroup>
            </Form.Group>
          </Row>
          <Row className="my-4 d-flex flex-column align-items-center">
            <Button
              id="coloreRegister"
              variant="outline-light"
              style={{ width: "auto" }}
              onClick={postRegistrazione}
              className="fw-bolder"
            >
              completa registrazione
            </Button>
          </Row>
        </Form>
      </div>
    </>
  )
}

export default Register
