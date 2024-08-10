// Não são funções nativas do JavaScript
// gets -> lê uma linha com dados de entrada (inputs) do usuário
// print -> imprime um texto de saída (output)

// lê os valores de entrada
const valorSalario = parseFloat(gets());
const valorBeneficios = parseFloat(gets());

// Calcula o imposto através da função
const valorImposto = calcularImposto(valorSalario);

// Calcula e imprime a saida com 2 casas decimais
const saida = valorSalario - valorImposto + valorBeneficios;
print(saida.toFixed(2));

// função util para o calculo do imposto
function calcularImposto(salario) {
    let aliquota;
    if (salario >=0 && salario <= 1100) {
        aliquota = 0.5;
    } else if
    (salario>= 1100.01 && salario <= 2500.00){
        // atribui a aliquota de 10% mediante o salário
        aliquota = 0.10;
    }
    else
    {
        // atribui a aliquota de 15% mediante o salário
        aliquota = 0.15;
    }

    return aliquota * salario;
}