import {
  ADD_ID_CARRELLO,
  ADD_ID_FATTURA,
  ADD_ID_ORDINE,
  ADD_ORDINE,
  ADD_TOKEN,
  ARTICOLI,
  CARRELLO_ARTICOLI,
  FATTURA,
  FATTURA_CREATED,
  USER,
  USERNAME_USER,
  ORDINI,
} from "../actions"

const initialState = {
  token: "",
  username: "",
  idCarrello: "",
  idOrdine: "",
  idFattura: "",
  user: {},
  articoli: [],
  carrello: {},
  ordine: {},
  fattura: {},
  ordini: [],
}

const userReducer = (state = initialState, action) => {
  switch (action.type) {
    case ADD_TOKEN:
      return {
        ...state,
        token: action.payload,
      }
    case USERNAME_USER:
      return {
        ...state,
        username: action.payload,
      }
    case ADD_ID_CARRELLO:
      return {
        ...state,
        idCarrello: action.payload,
      }
    case ORDINI:
      return {
        ...state,
        ordini: action.payload,
      }
    case ADD_ID_ORDINE:
      return {
        ...state,
        idOrdine: action.payload,
      }
    case ADD_ID_FATTURA:
      return {
        ...state,
        idFattura: action.payload,
      }
    case USER:
      return {
        ...state,
        user: action.payload,
      }
    case ARTICOLI:
      return {
        ...state,
        articoli: action.payload,
      }
    case CARRELLO_ARTICOLI:
      return {
        ...state,
        carrello: action.payload,
      }
    case ADD_ORDINE:
      return {
        ...state,
        ordine: action.payload,
      }
    case FATTURA:
      return {
        ...state,
        fattura: action.payload,
      }
    case FATTURA_CREATED:
      return {
        ...state,
        fatturaCreata: action.payload,
      }

    default:
      return state
  }
}

export default userReducer
