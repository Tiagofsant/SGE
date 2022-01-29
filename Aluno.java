
package model;

import java.sql.Date;

/**
 *
 * @author Tiago F. Santos
 */
public class Aluno {

    private int idAluno;
    private String nome_aluno;
    private String sobrenome_aluno;
    private int rg_aluno;
    private double cpf_aluno;
    private String endereco_aluno;
    private double telefone_aluno;
    private String email_aluno;
    private Date nascimento_aluno;
    private Date cadastro_aluno;

    public Aluno() {
    }

    public Aluno(int idAluno, String nome_aluno, String sobrenome_aluno, int rg_aluno, double cpf_aluno, String endereco_aluno, double telefone_aluno, String email_aluno, Date nascimento_aluno, Date cadastro_aluno) {
        this.idAluno = idAluno;
        this.nome_aluno = nome_aluno;
        this.sobrenome_aluno = sobrenome_aluno;
        this.rg_aluno = rg_aluno;
        this.cpf_aluno = cpf_aluno;
        this.endereco_aluno = endereco_aluno;
        this.telefone_aluno = telefone_aluno;
        this.email_aluno = email_aluno;
        this.nascimento_aluno = nascimento_aluno;
        this.cadastro_aluno = cadastro_aluno;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public String getSobrenome_aluno() {
        return sobrenome_aluno;
    }

    public int getRg_aluno() {
        return rg_aluno;
    }

    public double getCpf_aluno() {
        return cpf_aluno;
    }

    public String getEndereco_aluno() {
        return endereco_aluno;
    }

    public double getTelefone_aluno() {
        return telefone_aluno;
    }

    public String getEmail_aluno() {
        return email_aluno;
    }

    public Date getNascimento_aluno() {
        return nascimento_aluno;
    }

    public Date getCadastro_aluno() {
        return cadastro_aluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public void setSobrenome_aluno(String sobrenome_aluno) {
        this.sobrenome_aluno = sobrenome_aluno;
    }

    public void setRg_aluno(int rg_aluno) {
        this.rg_aluno = rg_aluno;
    }

    public void setCpf_aluno(double cpf_aluno) {
        this.cpf_aluno = cpf_aluno;
    }

    public void setEndereco_aluno(String endereco_aluno) {
        this.endereco_aluno = endereco_aluno;
    }

    public void setTelefone_aluno(double telefone_aluno) {
        this.telefone_aluno = telefone_aluno;
    }

    public void setEmail_aluno(String email_aluno) {
        this.email_aluno = email_aluno;
    }

    public void setNascimento_aluno(Date nascimento_aluno) {
        this.nascimento_aluno = nascimento_aluno;
    }

    public void setCadastro_aluno(Date cadastro_aluno) {
        this.cadastro_aluno = cadastro_aluno;
    }

}
