//Integrantes: Gabriel Mazzieri e Lorenzzo Rodrigues.
package calculadora_imc;
import calculo_imc.PrincipalCalculo;
import visualizar_imc.PrincipalVisualizacaoImc;
import java.util.Scanner;

public class PrincipalCalculadora_IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_num;
        float imc_principal = 0;
       
        //Nome do usu�rio principal
        System.out.print("Digite seu nome: ");
        String nome_user = sc.next();
       
      while (true) {
        System.out.printf("\n----------- Ol� %s! ------------------", nome_user);
        System.out.println("\nDigite 1 para calcular. ");
        System.out.println("Digite 2 para calcular mais de um IMC. ");
        System.out.printf("Digite 3 para ver o �ltimo IMC de %s.\n", nome_user);
        System.out.println("Digite 4 para Sair.");
        System.out.print("-------------------------------------------");

        System.out.print("\nDigite um dos n�meros acima: ");
        user_num = sc.next();        
        
            //Calcular IMC
        if (user_num.equals("1")) {
            imc_principal = PrincipalCalculo.calculo();
 
            //Calcular mais de um IMC
        } else if (user_num.equals("2")) {
            System.out.print("Digite o n�mero de pessoas: ");
            int numPessoas = sc.nextInt();
            for (int i = 0; i < numPessoas; i++) {
                System.out.print("Digite seu nome: ");
                String outro_user = sc.next();
                Float outro_imc = PrincipalCalculo.calculo();
                System.out.printf("IMC de %s �: %.1f\n", outro_user, outro_imc);
                }
            
            //Ver ultimo IMC Calculado do usu�rio principal
        } else if (user_num.equals("3"))  {
            PrincipalVisualizacaoImc.ver_imc(imc_principal);    
        
            //Sair ou Continuar
        } else if (user_num.equals("4")){
            System.out.println("\nDeseja mesmo sair? s/n");
            String sair = sc.next();           
                if (sair.equals("n")){
                    System.out.println("Continuando...");     
                } else if (sair.equals("s")) {
                    System.out.println("Saindo...");
                    System.exit(0);
                }
            //N�mero Inv�lido
            } else{ 
                System.out.println("\nTente um n�mero v�lido.");
            }
        }
    }
}
