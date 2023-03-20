//Utilizando axios para consumir a API 

import axios from 'axios'

//adicionando integrante
function adicionarIntegrante(integrante){
    return axios.post('http://localhost:8080/cadastro', integrante)
}

const novoIntegrante = {
    Id: '2',
    franquia: 'ChicagoBullsde1985',
    nome: 'Michael Jordan',
    funcao: 'ala',

}

adicionarIntegrante(novoIntegrante)
    .then(function (response){
        console.log(response.data)
    })
    .catch(function (error){console.log(error)})



//adicionando time
function adicionarTime(time){
        return axios.post('http://localhost:8080/cadastro', time)
    }
    
    const novoTime = {
        Id: '3',
        Data: '15-03-1985',
    
    }
    
    adicionarTime(novoTime)
        .then(function (response){
            console.log(response.data)
        })
        .catch(function (error){console.log(error)})

//Funcionalidade do botão "submit"
const formCadastrar = document.getElementById('formCadastrar')
formCadastrar.addEventListener('submit', adicionarIntegrante, adicionarTime)