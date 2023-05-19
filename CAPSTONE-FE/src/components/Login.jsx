import { useState } from "react"
import { Button, Col, Form, InputGroup, Row } from "react-bootstrap"
function Login() {
  const user = {
    username: "",
    password: "",
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

  const postLogin = async () => {
    try {
      const response = await fetch("http://localhost:8080/api/auth/login", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(input),
      })
      console.log(response)
      if (response.ok) {
        alert("sei entrato :) ")
        window.location.href = "http://localhost:3000/"
      }
    } catch (error) {
      alert("testComment", error)
    }
  }

  return (
    <>
      <Form className="mt-5" noValidate validated={validated} onSubmit={handleSubmit}>
        <Row className="mb-3">
          <Form.Group as={Col} md="4" controlId="validationCustomUsername">
            <Form.Label className="text-white">Username</Form.Label>
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

          <Form.Group as={Col} md="4" controlId="validationCustomPassword">
            <Form.Label className="text-white">Password</Form.Label>
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
        <Button onClick={postLogin}>Entra nel tuo account</Button>
      </Form>
    </>
  )
}

export default Login
