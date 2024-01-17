import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String nomeDoCliente, agencia;
        int numero;
        double saldo;
        
        System.out.println("Por favor, digite o seu nome!");
        nomeDoCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da conta!");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o seu saldo!");
        saldo = sc.nextDouble();

        System.out.println("Olá "+ nomeDoCliente +", obrigado por criar uma conta em nosso banco, sua agência é, " + agencia + ", conta "+numero+" e seu saldo " + saldo + " já está disponível para saque");
        sc.close();
    }
}