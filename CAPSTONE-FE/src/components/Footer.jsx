import { Col, Row } from "react-bootstrap"
import "../assets/sass/AzinedaCustom.scss"
import { BsTwitter, BsLinkedin, BsInstagram, BsYoutube } from "react-icons/bs"

const Footer = () => {
  return (
    <>
      <div className="footerCust">
        <Row>
          <Col className="ms-4 my-3" md={3} sm={12}>
            <a href="https://about.nike.com/it/volumes/a-culture-of-innovation">
              <p>Stories</p>
            </a>
            <a href="https://about.nike.com/it/impact">
              <p>Impact</p>
            </a>
            <a href="https://about.nike.com/it/company">
              <p>Company</p>
            </a>
            <a href="https://about.nike.com/it/newsroom">
              <p>Newsroom</p>
            </a>
          </Col>
          <Col className=" my-3" md={3} sm={12}>
            <a href="https://www.nike.com/it/">
              <p>Shop Nike.com</p>
            </a>
            <a href="https://www.converse.com/it/it/go">
              <p>Shop Converse.com</p>
            </a>
            <a href="https://www.nike.com/help">
              <p>Get Help</p>
            </a>
            <a href="https://investors.nike.com/Home/default.aspx">
              <p>Investors</p>
            </a>
          </Col>
          <Col className=" my-3 d-flex justify-content-end" md={5} sm={12}>
            <span className="spanner ms-3 ">
              <a href="https://twitter.com/Nike">
                <BsTwitter />
              </a>
            </span>
            <span className="spanner ms-3">
              <a href="https://www.linkedin.com/company/nike">
                <BsLinkedin />
              </a>
            </span>
            <span className="spanner ms-3">
              <a href="https://www.instagram.com/nike/">
                <BsInstagram />
              </a>
            </span>
            <span className="spanner ms-3">
              <a href="https://www.youtube.com/user/NIKE">
                <BsYoutube />
              </a>
            </span>
          </Col>
          <Col md={1} sm={12}></Col>
        </Row>
        <Row>
          <Col className="d-flex flex-row justify-content-end mx-3 mt-5 mb-3" md={12} sm={12}>
            <a href="https://agreementservice.svs.nike.com/rest/agreement?agreementType=termsOfUse&uxId=com.nike.nikefooter&country=US&language=en&requestType=redirect">
              <span className="ms-4">Terms of Use</span>
            </a>
            <a href="https://agreementservice.svs.nike.com/rest/agreement?agreementType=privacyPolicy&uxId=com.nike.nikefooter&country=US&language=en&requestType=redirect">
              <span className="ms-4">Nike Privacy Policy</span>
            </a>
            <a href="https://about.nike.com/en/newsroom/statements/statement-on-forced-labor">
              <span className="ms-4">CA Supply Chains Act</span>
            </a>
            <span className="mx-5">© 2023 NIKE, Inc. All Rights Reserved</span>
          </Col>
        </Row>
      </div>
    </>
  )
}

export default Footer
