export const ADD_TOKEN = "ADD_TOKEN"
export const ADD_ORDINE = "ADD_ORDINE"
export const FATTURA = "FATTURA"
export const CARRELLO_ARTICOLI = "CARRELLO_ARTICOLI"
export const ARTICOLI = "ARTICOLI"
export const USERNAME_USER = "USERNAME_USER"
export const ADD_ID_CARRELLO = "ADD_ID_CARRELLO"
export const ADD_ID_ORDINE = "ADD_ID_ORDINE"
export const ADD_ID_FATTURA = "ADD_ID_FATTURA"
export const USER = "USER"
export const FATTURA_CREATED = "FATTURA_CREATED"
export const ORDINI = "ORDINI"

export function regisrazioneUser(input) {
  return async () => {
    try {
      const response = await fetch("http://localhost:8080/api/auth/register", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(input),
      })
      if (response.ok) {
        window.location.href = "http://localhost:3000/login"
      } else if (response.status === 400) {
        alert("EMAIL O PASSWORD GIA' ESISTENTE")
      }
    } catch (error) {
      alert("Errore con la registrazione", error)
    }
  }
}
export function trovaIdOrdine(token, idUser, idCarrello, carrelloArticoli) {
  return async (dispatch) => {
    try {
      const response = await fetch(`http://localhost:8080/api/ordine`, {
        method: "GET",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        const data = await response.json()
        const ordineFiltrato = data.filter(
          (e) =>
            e.user.id === idUser &&
            e.carrello.id === idCarrello &&
            e.carrello.articoli.length === carrelloArticoli.length &&
            e.id === data.length - 1 + 1
        )
        dispatch({
          type: ADD_ID_ORDINE,
          payload: ordineFiltrato[0].id,
        })
        dispatch(getOrdine(ordineFiltrato[0].id, token))
      }
    } catch (error) {
      alert("Errore con il trova ordine!", error)
    }
  }
}
export function trovaIdCarrello(idUser, token) {
  return async (dispatch) => {
    try {
      const response = await fetch(`http://localhost:8080/api/carrello`, {
        method: "GET",
        headers: {
          Authorization: ` Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        const data = await response.json()
        const carrelloFiltrato = data.filter((e) => e.id === idUser)
        dispatch({
          type: ADD_ID_CARRELLO,
          payload: carrelloFiltrato[0].id,
        })
      }
    } catch (error) {
      alert("Errore con trova ID carrello!", error)
    }
  }
}
export function getUser(token, username) {
  return async (dispatch) => {
    try {
      const response = await fetch(`http://localhost:8080/api/user`, {
        method: "GET",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        const data = await response.json()
        const userFiltrato = data.filter((e) => e.username === username)
        dispatch({
          type: USER,
          payload: userFiltrato[0],
        })
        dispatch(trovaIdCarrello(userFiltrato[0].id, token))
      }
    } catch (error) {
      alert("Errore con il GET user!", error)
    }
  }
}
export function trovaIdFattura(token, idOrdine) {
  return async (dispatch) => {
    try {
      const response = await fetch(`http://localhost:8080/api/fattura`, {
        method: "GET",
        headers: {
          Authorization: ` Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        const data = await response.json()
        const fatturaFiltrata = data.filter((e) => e.id === idOrdine)
        dispatch({
          type: ADD_ID_FATTURA,
          payload: fatturaFiltrata[0].id,
        })
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}

export function loginUser(input) {
  return async (dispatch) => {
    try {
      const response = await fetch("http://localhost:8080/api/auth/login", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(input),
      })
      if (response.ok) {
        const data = await response.json()
        dispatch({
          type: ADD_TOKEN,
          payload: data.accessToken,
        }) &&
          dispatch({
            type: USERNAME_USER,
            payload: data.username,
          })
        window.location.href = "http://localhost:3000/"
      } else if (response.status === 500) {
        alert("Email o Password errati")
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}

export function logoutUser() {
  return (dispatch) => {
    dispatch({
      type: ADD_TOKEN,
      payload: "",
    })
    dispatch({
      type: ARTICOLI,
      payload: [],
    })
  }
}

export function getArticoli(token) {
  return async (dispatch) => {
    try {
      const response = await fetch("http://localhost:8080/api/articolo", {
        method: "GET",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        const data = await response.json()

        dispatch({
          type: ARTICOLI,
          payload: data,
        })
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}

export function getCarrello(idCarrello, token) {
  return async (dispatch) => {
    try {
      const response = await fetch(`http://localhost:8080/api/carrello/${idCarrello}`, {
        method: "GET",
        headers: {
          Authorization: ` Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        const data = await response.json()
        dispatch({
          type: CARRELLO_ARTICOLI,
          payload: data,
        })
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}
export function deleteCarrello(idCarrello, idArticolo, token) {
  return async (dispatch) => {
    try {
      const response = await fetch(`http://localhost:8080/api/carrello/${idCarrello}/articoli/${idArticolo}`, {
        method: "DELETE",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        //alert("Articolo eliminato con successo.")
        dispatch(getCarrello(idCarrello, token))
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}
export function creaOrdine(idUser, idCarrello, token) {
  return async () => {
    try {
      const response = await fetch(`http://localhost:8080/api/ordine/user/${idUser}/carrello/${idCarrello}`, {
        method: "POST",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        window.location.href = "/ordine"
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}
export const updateCartItemCount = (count) => ({
  type: "UPDATE_CART_ITEM_COUNT",
  payload: count,
})

export function aggiungiArticoliCarrello(idCarrello, idArticolo, token) {
  return async () => {
    try {
      const response = await fetch(`http://localhost:8080/api/carrello/${idCarrello}/articoli/${idArticolo}`, {
        method: "POST",
        headers: {
          Authorization: ` Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}
export function getOrdine(id, token) {
  return async (dispatch) => {
    try {
      const response = await fetch(`http://localhost:8080/api/ordine/${id}`, {
        method: "GET",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        const data = await response.json()
        dispatch({
          type: ADD_ORDINE,
          payload: data,
        })
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}

export function creaFattura(idOrdine, token) {
  return async (dispatch) => {
    try {
      const response = await fetch(`http://localhost:8080/api/fattura/ordine/${idOrdine}`, {
        method: "POST",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        dispatch({ type: FATTURA_CREATED })
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}

export function getOrdini(token, idUser, idCarrello) {
  return async (dispatch) => {
    try {
      const response = await fetch("http://localhost:8080/api/ordine", {
        method: "GET",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        const data = await response.json()
        const ordiniFiltrati = data.filter((e) => e.user.id === idUser && e.carrello.id === idCarrello)
        dispatch({
          type: ORDINI,
          payload: ordiniFiltrati,
        })
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}

export function getFattura(idOrdine, token) {
  return async (dispatch) => {
    try {
      const response = await fetch(`http://localhost:8080/api/fattura/${idOrdine}`, {
        method: "GET",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        const data = await response.json()
        dispatch({ type: FATTURA, payload: data })
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}
export function svuotaOrdini() {
  return (dispatch) => {
    dispatch({ type: ADD_ORDINE, payload: {} })
    dispatch({ type: ADD_ID_ORDINE, payload: "" })
  }
}
