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

        System.out.println("Por favor, digite o número da Conta!");
        Conta = input.next();

        System.out.println("Por favor, digite o nome do cliente!");
        NomeCliente = input.next();

        System.out.println("Por favor, digite o saldo!");
        Saldo = input.nextFloat();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Conta + " e seu saldo " + Saldo + " já está disponível para saque.");

    }
}
