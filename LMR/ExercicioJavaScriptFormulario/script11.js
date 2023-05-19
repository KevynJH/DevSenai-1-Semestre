let nome;
let email;
let cEmail;
let senha;
let cSenha;
let endereco;

function Nome() {
    nome = document.getElementById('Nome1').value;
    if (nome == "") {
        alert("Preencha o Nome Por Favor")
    }
}

function Email() {
    email = document.getElementById('Email1').value;
    if (email == "") {
        alert("Preencha o Email Por Favor")
    }
}

function CEmail() {
    cEmail = document.getElementById('cEmail1').value;
    if (cEmail == "") {
        alert("Preencha o Email Por Favor")
    } else if (cEmail !== email) {
        alert("Preencha o Email corretamente por favor")
    }
}

function Senha() {
    senha = document.getElementById('Senha1').value;
    if (senha == "") {
        alert("Preencha a Senha Por Favor ")
    }
}

function CSenha() {
    cSenha = document.getElementById('cSenha1').value;
    if (cSenha == "") {
        alert("Preencha a Senha Por Favor ")
    } else if (cSenha != senha) {
        alert("Digite a Senha Corretamente")
    }
}

function Endereço() {
    endereco = document.getElementById('Endereço1').value;
    if (endereco == "") {
        alert("Preencha seu Endereço")
    }
}