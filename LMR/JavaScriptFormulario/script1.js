function MostrarNome() {

    let Nome = document.getElementById('MeuForm').pnome.value;
    let Sobrenome = document.getElementById('MeuForm').psobre.value;
    let NomeCompleto = Nome + ' ' + Sobrenome;
    alert('Olá ' + NomeCompleto);

}
let valor1;
let valor2;
let resultado;
function somar() {
    valor1 = document.getElementById('pv1').value;
    valor2 = document.getElementById('pv2').value;
    if (valor1 == "" || valor2 == "") {
        alert("Preencha todos os Campos")
    }
    else if (valor2 == 0) {
        alert(" não podemos dividir por zero")
    }
    else {
        resultado = parseInt(valor1) + parseInt(valor2);
        alert("o resultado da Soma é " + resultado)
    }
}
function sub() {
    valor1 = document.getElementById('pv1').value;
    valor2 = document.getElementById('pv2').value;
    if (valor1 == "" || valor2 == "") {
        alert("Preencha todos os Campos")
    }
    else if (valor2 == 0) {
        alert(" não podemos dividir por zero")
    }
    else {
        resultado = parseInt(valor1) - parseInt(valor2);
        alert("o resultado da Subitração é " + resultado)
    }
}
function mult() {
    valor1 = document.getElementById('pv1').value;
    valor2 = document.getElementById('pv2').value;
    if (valor1 == "" || valor2 == "") {
        alert("Preencha todos os Campos")
    }
    else if (valor2 == 0) {
        alert(" não podemos dividir por zero")
    }
    else {
        resultado = parseInt(valor1) * parseInt(valor2);
        alert("o resultado da Multiplicação é " + resultado)
    }
}
function div() {
    valor1 = document.getElementById('pv1').value;
    valor2 = document.getElementById('pv2').value;
    if (valor1 == "" || valor2 == "") {
        alert("Preencha todos os Campos")
    }
    else if (valor2 == 0) {
        alert(" não podemos dividir por zero")
    }
    else {
        resultado = parseInt(valor1) / parseInt(valor2);
        alert("o resultado da Divisão é " + resultado)
    }
}
