export const ADD_TOKEN = "ADD_TOKEN"
export const ADD_ORDINE = "ADD_ORDINE"
export const ADD_FATTURA = "ADD_FATTURA"
export const CARRELLO_ARTICOLI = "CARRELLO_ARTICOLI"
export const ARTICOLI = "ARTICOLI"
export const USERNAME_USER = "USERNAME_USER"

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
        // console.log(response)
        window.location.href = "http://localhost:3000/login"
      } else if (response.status === 400) {
        alert("Email o Username già eistente")
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
      console.log(response)
      if (response.ok) {
        const data = await response.json()
        //console.log(data)
        dispatch({
          type: ADD_TOKEN,
          payload: data.accessToken,
        }) &&
          dispatch({
            type: USERNAME_USER,
            payload: data.username,
          })
        console.log(data.accessToken)
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
    }) &&
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
      console.log(response)
      if (response.ok) {
        const data = await response.json()
        //console.log(data)
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
        const { articoli } = await response.json()
        //console.log(articoli)
        dispatch({
          type: CARRELLO_ARTICOLI,
          payload: articoli,
        })
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
        console.log(response)
        window.location.href = "/ordine"
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}
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
        //console.log(response)
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
        console.log(data)
        dispatch({
          type: ADD_ORDINE,
          payload: data,
        })
        console.log(response)
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}
export function creaFattura(idOrdine, token) {
  return async () => {
    try {
      const response = await fetch(`http://localhost:8080/api/fattura/ordine/${idOrdine}`, {
        method: "POST",
        headers: {
          Authorization: `Bearer ${token}`,
          "Content-Type": "application/json",
        },
      })
      if (response.ok) {
        console.log(response)
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
        console.log(data, "datiamo")
        dispatch({ type: ADD_FATTURA, payload: data })
      }
    } catch (error) {
      alert("testComment", error)
    }
  }
}
