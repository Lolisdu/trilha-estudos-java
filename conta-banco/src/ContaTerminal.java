import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    System.out.println("------Conta Bancário------");
    System.out.println();
    System.out.println("Digite o número da Conta Corrente: ");
    numero = terminal.nextInt();

    System.out.println("Digite o número da Agência: ");
    agencia = terminal.next();

    System.out.println("Nome do Cliente: ");
    nomeCliente = terminal.next();
    terminal.nextLine();

    System.out.println("Seu saldo atual: ");
		saldo = terminal.nextDouble();

        System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);

		terminal.close();
    }
}
