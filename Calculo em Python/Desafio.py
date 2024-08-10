# Função útil para o cálculo do imposto, baseado na alíquota
def calcular_imposto(salario):
    aliquota = 0.00
    if (salario >= 0 and salario <= 1100):
        aliquota = 0.05
    elif(salario>= 1100.01 and salario <= 2500.00):
        # atribui a aliquota de 10% mediante o salário
        aliquota = 0.10
    else:
    # atribui a aliquota de 15% mediante o salário
        aliquota = 0.15
    return aliquota * salario

# lê os valores de entrada
valor_salario = float(input())
valor_beneficios = float(input())

#Calcula o imposto através da função
valor_imposto = calcular_imposto(valor_salario)

#Calcula e imprime saída com 2 casas decimais
saida = valor_salario - valor_imposto + valor_beneficios
print(f'o salário é R${saida:.2f}')