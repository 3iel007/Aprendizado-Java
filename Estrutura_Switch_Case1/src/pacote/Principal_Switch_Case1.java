package pacote;

import java.util.Scanner;

public class Principal_Switch_Case1 {

   public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       
       System.out.println("1 - Op��o 1");
       System.out.println("2 - Op��o 2");
       System.out.println("3 - Sair");
       
        int op = ler.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Voc� escolheu 1");
                break;
            case 2:
                System.out.println("Voc� escolheu a op��o 2");
                break;
            case 3: 
                System.out.println("Saindo...");
                System.exit(0);
            default:
                System.out.println("Op��o Inv�lida");
               
        }
    }
}
