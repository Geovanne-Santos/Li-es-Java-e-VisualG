algoritmo "juroscompostos"
// Função :  Descobrir os juros
// Autor :  Geovanne Meloni dos Santos
// Data : 04/05/2020
// Seção de Declarações 
var
emp, taxa, result: real
temp: inteiro
inicio
// Entrada
escreval ("Olá bem vindo ao Banco Itau o que podemos a oferecer?")

escreval ("O quanto você quer emprestado?")
leia (emp)

escreval ("E em quantos meses você vai pagar?")
leia (temp)

taxa<- 0.02


// Processamento

result<- emp*(1+taxa)^temp

// Saída

escreval ("Ao final de", temp, " meses, você pagara: R$", result, "reais")

fimalgoritmo
