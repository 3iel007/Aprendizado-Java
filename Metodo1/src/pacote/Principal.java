package pacote;

public class Principal {
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        int x = 10;
        int y = 15;
        
        System.out.println("A soma �: " + calc.SomarNumeros(x, y));
        
        System.out.println("A subtra��o �: " + calc.Subtracao(x, y));

    }
}
