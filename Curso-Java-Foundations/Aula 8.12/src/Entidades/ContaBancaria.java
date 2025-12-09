package Entidades;

public class ContaBancaria {

    private String nome;
    private String cpf;
    private double saldo;

    public ContaBancaria(String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()) {
            System.out.println("Informe um nome válido.");
        }else{
            this.nome = nome;
        }
    }
    public void setCpf(String cpf) {
        if(cpf == null || cpf.trim().isEmpty()) {
            System.out.println("Informe um nome válido.");
        }else {
            this.cpf = cpf;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}

