package impressao_formatada;


public class Impressao_Formatada {

    public static void main(String[] args) {
        String nome = "Gabriel Mazzieri";
        double altura = 1.73;
        int idade = 17;
        
        System.out.printf("Ol�!"
                + "Meu nome �: %s \n"
                + "Minha altura �: %.2f \n"
                + "Minha idade �: %d \n", nome, altura, idade);
                
        System.out.println("Minha idade �: " + idade + "anos");
        
        System.out.println("Ol�! \n"
                + "Meu nome �: " + nome + "\n"
                + "Minha altura �: " + altura + "\n"
                + "Minha idade �: " + idade +"\n\n");
    }
    
}
