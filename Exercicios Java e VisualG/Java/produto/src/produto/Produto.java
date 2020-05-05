
package produto;

import java.util.Scanner;


public class Produto {

    
    public static void main(String[] args) {
        
        //Definição de variaveis
        double preco, result;
        String nome;
        
        
        //entrada
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual é o nome do produto?");
        nome = entrada.next();
        
        
        System.out.println("Qual é o preço do produto");
        preco = entrada.nextDouble();
        
        
        //Processamento
        
        result = (preco*1.65);
        
System.out.println("Você vai vender o produto: "+nome+" por $:"+result);
    }
    
}
