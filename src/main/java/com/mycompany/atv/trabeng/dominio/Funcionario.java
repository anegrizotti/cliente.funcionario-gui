package com.mycompany.atv.trabeng.dominio;

public class Funcionario {
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public double salario;

    public Funcionario() {
    }
    
    public Funcionario(String nome, String cpf, String email, String telefone, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.salario = salario;
    }
}
