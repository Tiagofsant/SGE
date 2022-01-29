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
public class Produto {
    
    private int idProduto;
    private String nome_produto;
    private int quantidade_produto;
    private double preco_produto;
    private Date data_cadastro;

    public Produto() {
    }

    public Produto(int idProduto, String nome_produto, int quantidade_produto, double preco_produto, Date data_cadastro) {
        this.idProduto = idProduto;
        this.nome_produto = nome_produto;
        this.quantidade_produto = quantidade_produto;
        this.preco_produto = preco_produto;
        this.data_cadastro = data_cadastro;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public int getQuantidade_produto() {
        return quantidade_produto;
    }

    public double getPreco_produto() {
        return preco_produto;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public void setQuantidade_produto(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

  
}
