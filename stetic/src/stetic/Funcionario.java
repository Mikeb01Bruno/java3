package stetic;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected Genero genero;
    protected double salarioBase;
    protected LocalDate dataNascimento;
    protected LocalDate dataAdmissao;

    public Funcionario(String nome, String cpf, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "\n Nome: " + nome + 
               "\n CPF: " + cpf + 
               "\n Gênero: " + genero.getTexto() +
               "\n Salário Base: " + Util.formatarMonetario(salarioBase) + 
               "\n Data Nascimento: " + Util.formatarData(dataNascimento) + 
               "\n Data Admissão: " + Util.formatarData(dataNascimento) +
               "\n Idade: " + getIdade();
    }
    
}
