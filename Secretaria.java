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
public class Secretaria {

    private int idSecretaria;
    private String nome_secretaria;
    private String sobrenome_secretaria;
    private int rg_secretaria;
    private Double cpf_secretaria;
    private String endereco_secretaria;
    private Double telefone_secretaria;
    private String email_secretaria;
    private Date nascimento_secretaria;
    private Date cadastro_secretaria;
    private int Produto_idProduto_secretaria;

    public Secretaria() {
    }

    public Secretaria(int idSecretaria, String nome_secretaria, String sobrenome_secretaria, int rg_secretaria, Double cpf_secretaria, String endereco_secretaria, Double telefone_secretaria, String email_secretaria, Date nascimento_secretaria, Date cadastro_secretaria, int Produto_idProduto_secretaria) {
        this.idSecretaria = idSecretaria;
        this.nome_secretaria = nome_secretaria;
        this.sobrenome_secretaria = sobrenome_secretaria;
        this.rg_secretaria = rg_secretaria;
        this.cpf_secretaria = cpf_secretaria;
        this.endereco_secretaria = endereco_secretaria;
        this.telefone_secretaria = telefone_secretaria;
        this.email_secretaria = email_secretaria;
        this.nascimento_secretaria = nascimento_secretaria;
        this.cadastro_secretaria = cadastro_secretaria;
        this.Produto_idProduto_secretaria = Produto_idProduto_secretaria;
    }

    public int getIdSecretaria() {
        return idSecretaria;
    }

    public String getNome_secretaria() {
        return nome_secretaria;
    }

    public String getSobrenome_secretaria() {
        return sobrenome_secretaria;
    }

    public int getRg_secretaria() {
        return rg_secretaria;
    }

    public Double getCpf_secretaria() {
        return cpf_secretaria;
    }

    public String getEndereco_secretaria() {
        return endereco_secretaria;
    }

    public Double getTelefone_secretaria() {
        return telefone_secretaria;
    }

    public String getEmail_secretaria() {
        return email_secretaria;
    }

    public Date getNascimento_secretaria() {
        return nascimento_secretaria;
    }

    public Date getCadastro_secretaria() {
        return cadastro_secretaria;
    }

    public int getProduto_idProduto_secretaria() {
        return Produto_idProduto_secretaria;
    }

    public void setIdSecretaria(int idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

    public void setNome_secretaria(String nome_secretaria) {
        this.nome_secretaria = nome_secretaria;
    }

    public void setSobrenome_secretaria(String sobrenome_secretaria) {
        this.sobrenome_secretaria = sobrenome_secretaria;
    }

    public void setRg_secretaria(int rg_secretaria) {
        this.rg_secretaria = rg_secretaria;
    }

    public void setCpf_secretaria(Double cpf_secretaria) {
        this.cpf_secretaria = cpf_secretaria;
    }

    public void setEndereco_secretaria(String endereco_secretaria) {
        this.endereco_secretaria = endereco_secretaria;
    }

    public void setTelefone_secretaria(Double telefone_secretaria) {
        this.telefone_secretaria = telefone_secretaria;
    }

    public void setEmail_secretaria(String email_secretaria) {
        this.email_secretaria = email_secretaria;
    }

    public void setNascimento_secretaria(Date nascimento_secretaria) {
        this.nascimento_secretaria = nascimento_secretaria;
    }

    public void setCadastro_secretaria(Date cadastro_secretaria) {
        this.cadastro_secretaria = cadastro_secretaria;
    }

    public void setProduto_idProduto_secretaria(int Produto_idProduto_secretaria) {
        this.Produto_idProduto_secretaria = Produto_idProduto_secretaria;
    }

}