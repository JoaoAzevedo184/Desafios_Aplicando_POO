package Desafio_1;

import java.util.Scanner;

class Conta {

    // TODO: Implemente os atributos privados para garantir que só podem ser acessados dentro da classe:
    private String titular;
    private int numeroConta;
    private double saldo;

    // TODO: Crie o construtor para inicializar os atributos da conta:
    public Conta(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // TODO: Adicione o método público para consultar o saldo:
    public double consultarSaldo(){//getSaldo
        return this.saldo;
    }

    // TODO: Adicione o método público para realizar saque:
    public boolean sacar(double valor){
        if (valor <= 0) {
            return false;
        } else {
            if(valor > saldo) {
                return false;
            } else {
                saldo -= valor;
                return true;
            }
        }
    }

    // TODO: Crie o método público para realizar depósito
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Operação Inválida.");
        } else {
            if(valor > saldo) {
                System.out.println("Operação Inválida.");
            } else {
                saldo += valor;
            }
        }
        return;
    }

}

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String titular = sc.nextLine();
        int numeroConta = sc.nextInt();
        double saldoInicial = sc.nextDouble();

        Conta conta = new Conta(titular, numeroConta, saldoInicial);

        // Operações de saque e depósito
        if (sc.hasNextDouble()) {
            double valorSaque = sc.nextDouble();
            if (!conta.sacar(valorSaque)) {
                System.out.println("Saque invalido: Saldo insuficiente");
                System.out.println("Saldo Atual: " + String.format("%.2f", conta.consultarSaldo()));
                return;
            }
        }

        if (sc.hasNextDouble()) {
            double valorDeposito = sc.nextDouble();
            conta.depositar(valorDeposito);
        }

        // Imprime o saldo final atualizado
        System.out.println("Saldo Atualizado: " + String.format("%.2f", conta.consultarSaldo()));
    }
}