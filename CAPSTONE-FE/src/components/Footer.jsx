import { Col, Row } from "react-bootstrap"
import "../assets/sass/AzinedaCustom.scss"
//import { BiLogoLinkedin, BiLogoTwitter, BiLogoInstagramAlt, BiLogoYoutube } from "react-icons/bs"

const Footer = () => {
  return (
    <>
      <div className="footerCust">
        <Row>
          <Col className="ms-4 my-3" md={3} sm={12}>
            <p>Stories</p>
            <p>Impact</p>
            <p>Company</p>
            <p>Newsroom</p>
          </Col>
          <Col className=" my-3" md={3} sm={12}>
            <p>Shop Nike.com</p>
            <p>Shop Converse.com</p>
            <p>Get Help</p>
            <p>Investors</p>
          </Col>
          <Col md={3} sm={12}></Col>
          <Col className=" my-3" md={3} sm={12}>
            <span>{/* < /> */}</span>
            <span>{/* < /> */}</span>
            <span>{/* < /> */}</span>
            <span>{/* < /> */}</span>
          </Col>
        </Row>
        <Row>
          <Col md={8} sm={12}></Col>
          <Col md={4} sm={12}></Col>
        </Row>
      </div>
    </>
  )
}

export default Footer
