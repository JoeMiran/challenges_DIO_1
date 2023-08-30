import java.util.Scanner;

public class ContaBancaria {    
    public static void main(String[] args) {
        
        // Create a Scanner object
        Scanner entrada = new Scanner(System.in);

        // Ask the user for the account number
        System.out.print("Enter your account number:  \n");
        // Read the user input and store it in the variable numConta
        int numConta = entrada.nextInt();

        // Ask the user for the agency number
        System.out.print("Enter your agency number: \n");
        // Read the user input and store it in the variable agencia
        String agencia = entrada.nextLine();
        entrada.nextLine();
        // Ask the user for the name of the account holder
        System.out.print("Enter the name of the account holder: \n");
        // Read the user input and store it in the variable nomeTitular
        String nomeTitular = entrada.nextLine();

        // Ask the user for the account's balance
        System.out.print("Enter your account balance: \n");
        // Read the user input and store it in the variable saldo
        double saldo = entrada.nextDouble();

        // Print the results on the screen
        System.out.println("\n------------ REGISTRATION SUCCESSFULLY COMPLETED ------------\n");
        System.out.println("Number account: " + numConta);
        System.out.println("Agency: " + agencia);
        System.out.println("Holder´s account name: " + nomeTitular);
        System.out.println("balance: " + saldo);

        // Close the scanner
        entrada.close();

    }
}
