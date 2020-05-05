package emprestimo;

import java.util.Scanner;


public class Emprestimo {

    
    public static void main(String[] args) {
        //Definição de variaveis
        double emp, taxa, result;
        int temp;
        Scanner entrada = new Scanner(System.in);
        
        //Entrada
        
        System.out.println("Quanto quer emprestado?");
        emp = entrada.nextDouble();
         
        System.out.println("E em quantos meses vai pagar?");
        temp = entrada.nextInt();
        
        taxa =0.02;
        
        //Processamento
        
       Math.pow(emp, emp);
       result =emp*(Math.pow((1+taxa),temp));
       
       //Saída
       
       System.out.println("Ao final de:"+ temp+" meses,você pagará: R$"+ result+"reais");
       

    }
}
