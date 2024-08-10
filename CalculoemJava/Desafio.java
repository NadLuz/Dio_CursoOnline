import java.util.Scanner;

public class Desafio{
    public static void main(String[] args) {
        try (// Lê os valores de Entrada:
        Scanner leitorDeEntrada = new Scanner(System.in)) {
            float valorSalario = leitorDeEntrada.nextFloat();
            float valorBeneficios = leitorDeEntrada.nextFloat();

            float valorImposto = 0;
            if(valorSalario>= 0 && valorSalario <= 1100){
                // atribui a aliquota de 5% mediante o salário
                valorImposto = 0.05F * valorSalario;
            }
            else if(valorSalario>= 1100.01 && valorSalario <= 2500.00){
                // atribui a aliquota de 10% mediante o salário
                valorImposto = 0.10F * valorSalario;
            }
            else{
                // atribui a aliquota de 15% mediante o salário
                valorImposto = 0.15F * valorSalario;
            }

            // Calcula e imprime a saída (com 2 casas decimais)
            float saida = valorSalario - valorImposto + valorBeneficios;
            System.out.println(String.format("%.2f", saida));
        }
    }
}