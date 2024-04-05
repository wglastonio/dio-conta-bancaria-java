import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int Agencia;
        String Conta;
        String NomeCliente;
        float Saldo;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência!");
        Agencia = input.nextInt();
        input.nextLine();               //Skip new line

        System.out.println("Por favor, digite o número da Conta!");
        Conta = input.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        NomeCliente = input.nextLine();

        System.out.println("Por favor, digite o saldo!");
        Saldo = input.nextFloat();

        System.out.println("\nOlá " + NomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Conta + " e seu saldo de R$" + Saldo + " já está disponível para saque.\n");

        input.close();
    }
}
