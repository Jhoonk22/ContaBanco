package br.com.ContaBanco.jonathan;

public class ContaTerminal {
    private int numero;
    private int agencia;
    private String nome;
    private double saldo;

    public void criaConta(int numero, int agencia, String nome, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String exibeConta(){
        return "Olá, " +nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "
                +agencia+ ", conta " +numero+ " e seu saldo de " +saldo+
                " já esta disponível para saque.";
    }
}
