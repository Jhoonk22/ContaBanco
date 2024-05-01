package br.com.ContaBanco.jonathan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da sua conta: ");
        int numero  = scanner.nextInt();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        conta.criaConta(numero, agencia, nome, saldo);

        System.out.println(conta.exibeConta());
    }
}
