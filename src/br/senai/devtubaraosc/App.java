// Arquivo App.java
package br.senai.devtubaraosc;

import br.senai.devtubaraosc.model.ContaPoupanca;
import br.senai.devtubaraosc.model.ContaCorrente;

public class App {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca("12345", "001", "Dave Grohl", 1000.0);
        ContaCorrente corrente = new ContaCorrente("54321", "002", "Chad Smith", 2000.0);

        System.out.println("Dados da conta poupança:");
        poupanca.mostrarDados();

        System.out.println("\nDados da conta corrente:");
        corrente.mostrarDados();
    }
}
