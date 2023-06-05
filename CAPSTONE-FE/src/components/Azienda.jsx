import { Carousel, Col, Container, Row } from "react-bootstrap"
import "../assets/sass/AzinedaCustom.scss"
import atleta1 from "../assets/atleta1.jpg"
import atleta2 from "../assets/atleta2.jpg"
import happyF from "../assets/happyfamily.jpg"
import happyK from "../assets/happykids.jpg"
import happyT from "../assets/happyteen.jpg"
import { AiOutlineStar } from "react-icons/ai"
import Footer from "./Footer"

const Azienda = () => {
  return (
    <>
      <Container className="mt-5 contaz">
        <div className="text-center fs-1 my-5 aboutus rounded-3">
          <p>
            <span className="mx-2">
              <AiOutlineStar />
            </span>
          </p>
          <p> NIKE - ABOUT US</p>
          <p>
            <span className="mx-2">
              <AiOutlineStar />
            </span>
          </p>
        </div>
        <Row>
          <Col sm={12}>
            <div>
              <img className="me-4 rounded-3 atlimg" src={atleta1} alt="athetic-pic" />
              <p className=" fs-4 atlpar">
                Sosteniamo il progresso continuo per gli atleti e lo sport agendo per aiutare gli atleti a raggiungere
                il loro potenziale. Ogni lavoro in NIKE si basa su una mentalità incentrata sul team, coltivando una
                cultura dell'innovazione e uno scopo condiviso per lasciare un impatto duraturo.
              </p>
            </div>
          </Col>
        </Row>
        <Row className="my-5">
          <Col sm={12}>
            <div>
              <img className="me-4 rounded-3 atlimg2" src={atleta2} alt="athetic-pic" />
              <p className=" fs-4 atlpar">
                Abbiamo passato 50 anni a trasformare grandi idee in piattaforme scalabili e sostenibili che hanno
                cambiato i nostri prodotti e il processo di produzione, alimentato la nostra etica del design e
                sostenuto la nostra comunità di atleti.
              </p>
            </div>
          </Col>
        </Row>

        {/* CAROSELLO */}

        <Row className="my-5">
          <Col md={12} sm={12}>
            <h2 className="mt-3 text-center">Il nostro impatto: Abbattere le barriere dal 1972</h2>
            <Carousel fade>
              {/* PRIMA FOTO */}
              <Carousel.Item>
                <img className="d-block imgcar " style={{ objectPosition: "center" }} src={happyF} alt="First slide" />
                <Carousel.Caption>
                  <h3 className="text-center">NIKE PER FAMIGLIA</h3>
                  <p className="text-center">Nike fa contente tutte le famiglie.</p>
                </Carousel.Caption>
              </Carousel.Item>
              {/* SECONDA FOTO */}
              <Carousel.Item>
                <img className="d-block imgcar " style={{ objectPosition: "top" }} src={happyK} alt="Second slide" />
                <Carousel.Caption>
                  <h3 className="text-center">NIKE PER BAMBINI</h3>
                  <p className="text-center">Nike fa contenti tutti i bambini.</p>
                </Carousel.Caption>
              </Carousel.Item>
              {/* TERZA FOTO */}
              <Carousel.Item>
                <img className="d-block imgcar  " style={{ objectPosition: "top" }} src={happyT} alt="Third slide" />

                <Carousel.Caption>
                  <h3 className="text-center">NIKE PER RAGAZZI</h3>
                  <p className="text-center">Nike fa contenti tutti i ragazzi.</p>
                </Carousel.Caption>
              </Carousel.Item>
            </Carousel>
          </Col>
        </Row>

        {/* percentuali */}
        <Row className="my-5">
          <h2>A PRIMA VISTA</h2>
          <Col md={4} sm={12}>
            <div className="percentdiv">
              <p className="text-black fw-bold percpar">$97.7M</p>
              <p className="text-black">
                investito nell'anno fiscale 2021 di NIKE, Inc. per promuovere un impatto positivo nelle comunità di
                tutto il mondo.
              </p>
            </div>
          </Col>
          <Col md={4} sm={12}>
            <div className="percentdiv">
              <p className="text-black fw-bold percpar">78%</p>
              <p className="text-black">
                energia rinnovabile in impianti di proprietà o gestiti, in aumento rispetto al 48% nell'anno fiscale
                2020.
              </p>
            </div>
          </Col>
          <Col md={4} sm={12}>
            <div className="percentdiv">
              <p className="text-black fw-bold percpar">43%</p>
              <p className="text-black">delle posizioni di leadership di NIKE sono ricoperte da donne.</p>
            </div>
          </Col>
        </Row>
      </Container>

      {/* footer */}
      <Footer />
    </>
  )
}

export default Azienda
