import "../assets/sass/HomeCustom.scss"
import logo from "../assets/justdoit.png"
import palla from "../assets/palla.png"
import { AiOutlineCaretRight } from "react-icons/ai"
import scritta from "../assets/SCRITTANIKE.png"
import { Col, Row } from "react-bootstrap"
import ArticoliCinque from "./ArticoliCinque"
const Home = () => {
  return (
    <>
      <div className="totalissimo">
        <Row>
          <Col xs={12} lg={3}>
            <div className="divimg">
              <img src={logo} alt="pic-scritta" style={{ height: "425px" }} />
              <p className="pp">
                Sarai entusiasto di scoprire i migliori <br /> designe per le scarpe!
              </p>
            </div>
            <div className="divscritta">
              <img src={scritta} alt="pic-scritta" style={{ transform: "rotate(90deg)" }} />
              <p className="pi">
                <a className="aa" href="http://localhost:3000/scarpe">
                  Vedi tutti gli articoli! --
                  <span>
                    <AiOutlineCaretRight />
                  </span>
                </a>
              </p>
            </div>
          </Col>
        </Row>
        <div className="divPalla">
          <img src={palla} alt="ball-pic" />
        </div>

        <Row className="my-3">
          <ArticoliCinque />
        </Row>
      </div>
    </>
  )
}

export default Home
