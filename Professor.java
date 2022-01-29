/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Tiago F. Santos
 */
public class Professor {

    private int idProfessor;
    private String nome_professor;
    private String sobrenome_professor;
    private int rg_professor;
    private double cpf_professor;
    private String endereco_professor;
    private double telefone_professor;
    private String email_professor;
    private Date nascimento_professor;
    private Date cadastro_professor;

    public Professor() {
    }

    public Professor(int idProfessor, String nome_professor, String sobrenome_professor, int rg_professor, double cpf_professor, String endereco_professor, double telefone_professor, String email_professor, Date nascimento_professor, Date cadastro_professor) {
        this.idProfessor = idProfessor;
        this.nome_professor = nome_professor;
        this.sobrenome_professor = sobrenome_professor;
        this.rg_professor = rg_professor;
        this.cpf_professor = cpf_professor;
        this.endereco_professor = endereco_professor;
        this.telefone_professor = telefone_professor;
        this.email_professor = email_professor;
        this.nascimento_professor = nascimento_professor;
        this.cadastro_professor = cadastro_professor;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public String getSobrenome_professor() {
        return sobrenome_professor;
    }

    public int getRg_professor() {
        return rg_professor;
    }

    public double getCpf_professor() {
        return cpf_professor;
    }

    public String getEndereco_professor() {
        return endereco_professor;
    }

    public double getTelefone_professor() {
        return telefone_professor;
    }

    public String getEmail_professor() {
        return email_professor;
    }

    public Date getNascimento_professor() {
        return nascimento_professor;
    }

    public Date getCadastro_professor() {
        return cadastro_professor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public void setSobrenome_professor(String sobrenome_professor) {
        this.sobrenome_professor = sobrenome_professor;
    }

    public void setRg_professor(int rg_professor) {
        this.rg_professor = rg_professor;
    }

    public void setCpf_professor(double cpf_professor) {
        this.cpf_professor = cpf_professor;
    }

    public void setEndereco_professor(String endereco_professor) {
        this.endereco_professor = endereco_professor;
    }

    public void setTelefone_professor(double telefone_professor) {
        this.telefone_professor = telefone_professor;
    }

    public void setEmail_professor(String email_professor) {
        this.email_professor = email_professor;
    }

    public void setNascimento_professor(Date nascimento_professor) {
        this.nascimento_professor = nascimento_professor;
    }

    public void setCadastro_professor(Date cadastro_professor) {
        this.cadastro_professor = cadastro_professor;
    }
}
