
package model;

import java.sql.Date;

/**
 *
 * @author Tiago F. Santos
 */
public class Fornecedor {

    private int idFornecedor;
    private String nome_fornecedor;
    private String sobrenome_fornecedor;
    private double cpfcnpj_fornecedor;
    private String endereco_fornecedor;
    private Double telefone_fornecedor;
    private String email_fornecedor;
    private Date cadastro_fornecedor;
    private Date entrega_fornecedor;

    public Fornecedor() {
    }

    public Fornecedor(int idFornecedor, String nome_fornecedor, String sobrenome_fornecedor, double cpfcnpj_fornecedor, String endereco_fornecedor, Double telefone_fornecedor, String email_fornecedor, Date cadastro_fornecedor, Date entrega_fornecedor) {
        this.idFornecedor = idFornecedor;
        this.nome_fornecedor = nome_fornecedor;
        this.sobrenome_fornecedor = sobrenome_fornecedor;
        this.cpfcnpj_fornecedor = cpfcnpj_fornecedor;
        this.endereco_fornecedor = endereco_fornecedor;
        this.telefone_fornecedor = telefone_fornecedor;
        this.email_fornecedor = email_fornecedor;
        this.cadastro_fornecedor = cadastro_fornecedor;
        this.entrega_fornecedor = entrega_fornecedor;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public String getSobrenome_fornecedor() {
        return sobrenome_fornecedor;
    }

    public double getCpfcnpj_fornecedor() {
        return cpfcnpj_fornecedor;
    }

    public String getEndereco_fornecedor() {
        return endereco_fornecedor;
    }

    public Double getTelefone_fornecedor() {
        return telefone_fornecedor;
    }

    public String getEmail_fornecedor() {
        return email_fornecedor;
    }

    public Date getCadastro_fornecedor() {
        return cadastro_fornecedor;
    }

    public Date getEntrega_fornecedor() {
        return entrega_fornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public void setSobrenome_fornecedor(String sobrenome_fornecedor) {
        this.sobrenome_fornecedor = sobrenome_fornecedor;
    }

    public void setCpfcnpj_fornecedor(double cpfcnpj_fornecedor) {
        this.cpfcnpj_fornecedor = cpfcnpj_fornecedor;
    }

    public void setEndereco_fornecedor(String endereco_fornecedor) {
        this.endereco_fornecedor = endereco_fornecedor;
    }

    public void setTelefone_fornecedor(Double telefone_fornecedor) {
        this.telefone_fornecedor = telefone_fornecedor;
    }

    public void setEmail_fornecedor(String email_fornecedor) {
        this.email_fornecedor = email_fornecedor;
    }

    public void setCadastro_fornecedor(Date cadastro_fornecedor) {
        this.cadastro_fornecedor = cadastro_fornecedor;
    }

    public void setEntrega_fornecedor(Date entrega_fornecedor) {
        this.entrega_fornecedor = entrega_fornecedor;
    }
}