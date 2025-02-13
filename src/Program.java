import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Número da conta: ");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Agência: ");
        String codigoDaAgencia = scanner.nextLine();

        System.out.print("Saldo da conta: ");
        double saldoDaConta = scanner.nextDouble();

        String text = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nome, codigoDaAgencia, numeroDaConta, saldoDaConta);

        System.out.println(text);
    }
}
