##Exercício 2:
Uma loja de calçados está concedendo 12% de desconto nos produtos.
Calcule o valor de desconto a ser dado num par de sapatos e quanto
deve custar o produto com desconto. O programa deverá exibir as
seguintes mensagens:
O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx

Análise: OK
Entradas: valor, valor2
algoritimo = valor * 0.12 = valor2 // valor-valor2 = valor3
saida: valor 3



#Exercício 3:
Um motorista deseja abastecer seu tanque de combustível. Escreva
um programa para ler o preço do litro da gasolina e o valor do
pagamento e exibir quantos litros ele conseguiu colocar no tanque
Analise: OK
Entrada: valorgasolina, valorpago
algoritimo: valorpago/valorgasolina
saida: vt


#Exercício 4
Faça um programa para ler três notas de um aluno em uma disciplina e 
imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
Analise: OK
Entrada: nota1, nota2, nota 3 e nota 4
algoritimo: 
ler(nota1)
ler(nota2)
ler(nota3)
mediap(nota1+nota2+nota3)/10
saida: mediap 
testes:
Testes:
(E) nota1=3 nota2=6 nota3=9 (S) media=1.8
(E) nota1=2 nota2=4 nota3=6 (S) media=1.2
(E) nota1=4 nota2=8 nota3=10 (S) media=2.2

#Exercício5
Uma granja possui um controle automatizado de cada frango da sua produção. 
No pé direito do frango há um anel com um chip de identificação; no pé
 esquerdo são dois anéis para indicar o tipo de alimento que ele deve
consumir. Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento
custa R$ 3,50, faça um programa para calcular o gasto total da granja para
 marcar todos os seus frangos.
Analise: OK
Entrada: quantidade
Algoritimo:
 ler(quantidade)
 total=quantidade*11
 escrever(total)
(E) quantidade=3 (S)total = 33
(E) quantidade=50 (S)total =550 
(E) quantidade=30 (S)total = 330

#Exercício6
Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
Escreva um programa que leia o peso do prato montado pelo cliente 
(em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.
Analise: OK
Algoritimo:
Entrada: comida 
ler(comida)
total(comida-0.750)
comidavalor=total*25
mostrar(comidavalor)
Testes:
(E) comida =10 (S)total = 231,25
(E) comida =2 (S)total = 31,25
(E) comida =6 (S)total = 131,25

#Exercício7
Uma fábrica de refrigerantes vende seu produto em três formatos:
lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
Se um comerciante compra uma determinada quantidade de cada formato, faça 
um programa para calcular quantos litros de refrigerante ele comprou.
Analise: OK
Algoritimo:
Entrada: pequena, media, grande
ler(pequena)
ler(media)
ler(grande)
valor1(0.350*pequena)
valor2(0.600*media)
valor3(2*grande)
total(valor1+valor2+valor3);
Saída: total

Testes:
(E) pequena =10 media=15 grande= 20 (S)total = 52,5
(E) pequena =2 media=4 grande= 6 (S)total = 15,1
(E) pequena =80 media=90 grande= 100 (S)total = 252,0

#Exercício8
Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
Para isto ela entregou um valor em dólares para o atendente.
Considerando que o atendente tem a cotação do dólar, descreva um 
programa para calcular quantos reais o atendente deve devolver para a
pessoa.
Analise: OK
Algoritimo:
Entrada: dolar
ler(dolar)
total(total*4,97)
Saída: total

Testes:
(E) dolar = 1 (S) total = 4,97
(E) dolar = 5 (S) total = 24,85
(E) dolar = 10 (S) total = 49,70

#Exercício9
Descreva um programa que calcule o volume de uma lata de óleo.
Analise: OK
Entrada: raio, altura 
Algoritimo:
ler(raio)
ler(altura)
volume(pi*raio²*altura)
Saída: volume

Testes:
(E) raio = 1; altura = 10 (S) total = 31,42
(E) raio = 10; altura = 20 (S) total = 6283,19
(E) raio = 30; altura = 20 (S) total = 56548,67


#Exercício10
Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
Fórmula:
°F = (9/5) °C + 32
Analise: OK
Entrada: catetoA, catetoB    
Algoritimo:
ler(catetoA)
ler(catetoB)
catetos( (catetoA*catetoA) + (catetoB*catetoB))
catetos ao quadrado
Saída: hipotenusa

Testes:
(E) catetoA  = 10; catetoB  = 20 (S) total = 22,36
(E) catetoA  = 36; catetoB  = 98 (S) total = 104,40
(E) catetoA  = 2; catetoB  = 1 (S) total = 1,4


#Exercício11
Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. 
 Fórmula:
°F = (9/5) °C + 32
Analise: OK
Entrada: Celcius
Algoritimo:
ler(celcius)
faren(celcius*9/5)+32
mostrar(faren)
Saída: faren

Testes:
(E) celcius  = 10 total = (S)50
(E) celcius = 20,5 total = (S)68,9
(E) celcius = 12  total = (S)53,6

