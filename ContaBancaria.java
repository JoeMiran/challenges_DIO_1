import java.util.Scanner;

public class ContaBancaria {    
    public static void main(String[] args) {
        
        // Create a Scanner object
        Scanner entrada = new Scanner(System.in);

        // Ask the user for the account number
        System.out.print("Digite o número da conta corrente:  ");
        // Read the user input and store it in the variable numConta
        int numConta = entrada.nextInt();

        // Ask the user for the agency number
        System.out.print("Digite o número da agência: ");
        // Read the user input and store it in the variable agencia
        String agencia = entrada.nextLine();

        // Ask the user for the name of the account holder
        System.out.print("Digite o nome do titular da conta: ");
        // Read the user input and store it in the variable nomeTitular
        String nomeTitular = entrada.nextLine();

        // Ask the user for the account's balance
        System.out.print("Digite o saldo da conta");
        // Read the user input and store it in the variable saldo
        double saldo = entrada.nextDouble();

        // Print the results on the screen
        System.out.println("\nCadastro efetuado com sucesso:");
        System.out.println("Número da conta: " + numConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);

        // Close the scanner
        entrada.close();

    }
}
