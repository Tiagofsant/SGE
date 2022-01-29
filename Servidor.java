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
public class Servidor {

    private int idServidor;
    private String nome_servidor;
    private String sobrenome_servidor;
    private int rg_servidor;
    private double cpf_servidor;
    private String endereco_servidor;
    private double telefone_servidor;
    private String email_servidor;
    private Date nascimento_servidor;
    private String funcao_servidor;
    private Date cadastro_servidor;

    public Servidor() {
    }
   
    public int getIdServidor() {
        return idServidor;
    }

    public Servidor(int idServidor, String nome_servidor, String sobrenome_servidor, int rg_servidor, double cpf_servidor, String endereco_servidor, double telefone_servidor, String email_servidor, Date nascimento_servidor, String funcao_servidor, Date cadastro_servidor) {
        this.idServidor = idServidor;
        this.nome_servidor = nome_servidor;
        this.sobrenome_servidor = sobrenome_servidor;
        this.rg_servidor = rg_servidor;
        this.cpf_servidor = cpf_servidor;
        this.endereco_servidor = endereco_servidor;
        this.telefone_servidor = telefone_servidor;
        this.email_servidor = email_servidor;
        this.nascimento_servidor = nascimento_servidor;
        this.funcao_servidor = funcao_servidor;
        this.cadastro_servidor = cadastro_servidor;
    }

    public String getNome_servidor() {
        return nome_servidor;
    }

    public String getSobrenome_servidor() {
        return sobrenome_servidor;
    }

    public int getRg_servidor() {
        return rg_servidor;
    }

    public double getCpf_servidor() {
        return cpf_servidor;
    }

    public String getEndereco_servidor() {
        return endereco_servidor;
    }

    public double getTelefone_servidor() {
        return telefone_servidor;
    }

    public String getEmail_servidor() {
        return email_servidor;
    }

    public Date getNascimento_servidor() {
        return nascimento_servidor;
    }

    public String getFuncao_servidor() {
        return funcao_servidor;
    }

    public Date getCadastro_servidor() {
        return cadastro_servidor;
    }

    public void setIdServidor(int idServidor) {
        this.idServidor = idServidor;
    }

    public void setNome_servidor(String nome_servidor) {
        this.nome_servidor = nome_servidor;
    }

    public void setSobrenome_servidor(String sobrenome_servidor) {
        this.sobrenome_servidor = sobrenome_servidor;
    }

    public void setRg_servidor(int rg_servidor) {
        this.rg_servidor = rg_servidor;
    }

    public void setCpf_servidor(double cpf_servidor) {
        this.cpf_servidor = cpf_servidor;
    }

    public void setEndereco_servidor(String endereco_servidor) {
        this.endereco_servidor = endereco_servidor;
    }

    public void setTelefone_servidor(double telefone_servidor) {
        this.telefone_servidor = telefone_servidor;
    }

    public void setEmail_servidor(String email_servidor) {
        this.email_servidor = email_servidor;
    }

    public void setNascimento_servidor(Date nascimento_servidor) {
        this.nascimento_servidor = nascimento_servidor;
    }

    public void setFuncao_servidor(String funcao_servidor) {
        this.funcao_servidor = funcao_servidor;
    }

    public void setCadastro_servidor(Date cadastro_servidor) {
        this.cadastro_servidor = cadastro_servidor;
    }
}
