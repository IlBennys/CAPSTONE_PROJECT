import { ADD_FATTURA, ADD_ORDINE, ADD_TOKEN, ARTICOLI, CARRELLO_ARTICOLI, USERNAME_USER } from "../actions"

const initialState = {
  token: "",
  articoli: [],
  carrello: [],
  username: "",
  ordine: {},
  fattura: {},
}

const userReducer = (state = initialState, action) => {
  switch (action.type) {
    case ADD_TOKEN:
      return {
        ...state,
        token: action.payload,
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
    case USERNAME_USER:
      return {
        ...state,
        username: action.payload,
      }
    case ADD_ORDINE:
      return {
        ...state,
        ordine: action.payload,
      }
    case ADD_FATTURA:
      return {
        ...state,
        fattura: action.payload,
      }
    default:
      return state
  }
}

export default userReducer
