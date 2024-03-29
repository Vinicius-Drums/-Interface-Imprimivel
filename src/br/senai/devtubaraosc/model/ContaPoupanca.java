// Arquivo ContaPoupanca.java
package br.senai.devtubaraosc.model;

import br.senai.devtubaraosc.model.interfaces.Imprimivel;

public class ContaPoupanca implements Imprimivel {
    private String tipoConta;
    private String numeroConta;
    private String agencia;
    private String nomeTitular;
    private double saldo;

    public ContaPoupanca(String numeroConta, String agencia, String nomeTitular, double saldo) {
        this.tipoConta = "Poupança";
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
    }
}
