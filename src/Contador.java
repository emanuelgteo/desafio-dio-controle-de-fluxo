import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Digite 2 números: ");
            int primeiroNumero = scanner.nextInt();
            int segundoNumero = scanner.nextInt();

            try {
            contar(primeiroNumero, segundoNumero);
            break;
            
            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
                scanner.nextLine();
            }
        }
    }

    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if(numero1 > numero2) {
        throw new ParametrosInvalidosException();
        }
        int repeticoes = numero2 - numero1;

        for(int num = 1; num <= repeticoes ; num++) {
            System.out.println("Imprimindo o número " + num);
        }
    }
}