
package retangulo;

import java.util.Scanner;


public class Retangulo {

   
    public static void main(String[] args) {
        
        double area,perimetro,base, altura;
        
        
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a base");  
        base =entrada.nextDouble();
        
        System.out.println("Digite a altura");
        altura =entrada.nextDouble();
        
        //processamento
        
        area= base*altura;
        perimetro= ((base*2)+(altura*2));  
        
        //Saída
        
        System.out.println("A area do quadrado é:"+area);
        
        System.out.println("O perimetro do quadrado é:"+perimetro);
       
    }
    
}
