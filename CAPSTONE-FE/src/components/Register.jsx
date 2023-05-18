import { useState } from "react"
import { Button, Col, Form, InputGroup, Row } from "react-bootstrap"
function Register() {
  const admin = {
    firstname: "",
    lastname: "",
    username: "",
    email: "",
    password: "",
    roles: ["ROLE_USER"],
  }

  const [input, setInput] = useState(admin)
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
      <Form noValidate validated={validated} onSubmit={handleSubmit}>
        <Row className="mb-3">
          <Form.Group as={Col} md="4" controlId="validationCustom01">
            <Form.Label>Nome</Form.Label>
            <Form.Control
              required
              type="text"
              placeholder="Nome"
              onChange={(e) => handleChange("firstname", e.target.value)}
            />
            <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
          </Form.Group>
          <Form.Group as={Col} md="4" controlId="validationCustom02">
            <Form.Label>Cognome</Form.Label>
            <Form.Control
              required
              type="text"
              placeholder="Cognome"
              onChange={(e) => handleChange("lastname", e.target.value)}
            />
            <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
          </Form.Group>
          <Form.Group as={Col} md="4" controlId="validationCustomUsername">
            <Form.Label>Username</Form.Label>
            <InputGroup hasValidation>
              <Form.Control
                type="text"
                placeholder="Username"
                aria-describedby="inputGroupPrepend"
                required
                onChange={(e) => handleChange("username", e.target.value)}
              />
              <Form.Control.Feedback type="invalid">Please choose a username.</Form.Control.Feedback>
            </InputGroup>
          </Form.Group>
          <Form.Group as={Col} md="4" controlId="validationCustomEmail">
            <Form.Label>E-mail</Form.Label>
            <InputGroup hasValidation>
              <InputGroup.Text id="inputGroupPrepend">@</InputGroup.Text>
              <Form.Control
                type="email"
                placeholder="email"
                aria-describedby="inputGroupPrepend"
                required
                onChange={(e) => handleChange("email", e.target.value)}
              />
              <Form.Control.Feedback type="invalid">Please choose an email.</Form.Control.Feedback>
            </InputGroup>
          </Form.Group>
          <Form.Group as={Col} md="4" controlId="validationCustomPassword">
            <Form.Label>Password</Form.Label>
            <InputGroup hasValidation>
              <Form.Control
                type="password"
                placeholder="Password"
                aria-describedby="inputGroupPrepend"
                required
                onChange={(e) => handleChange("password", e.target.value)}
              />
              <Form.Control.Feedback type="invalid">Please choose a password.</Form.Control.Feedback>
            </InputGroup>
          </Form.Group>
        </Row>
        <Row className="mb-3"></Row>
        <Button onClick={postRegistrazione}>completa registrazione</Button>
      </Form>
    </>
  )
}

export default Register
