algoritmo "juroscompostos"
// Fun��o :  Descobrir os juros
// Autor :  Geovanne Meloni dos Santos
// Data : 04/05/2020
// Se��o de Declara��es 
var
emp, taxa, result: real
temp: inteiro
inicio
// Entrada
escreval ("Ol� bem vindo ao Banco Itau o que podemos a oferecer?")

escreval ("O quanto voc� quer emprestado?")
leia (emp)

escreval ("E em quantos meses voc� vai pagar?")
leia (temp)

taxa<- 0.02


// Processamento

result<- emp*(1+taxa)^temp

// Sa�da

escreval ("Ao final de", temp, " meses, voc� pagara: R$", result, "reais")

fimalgoritmo
