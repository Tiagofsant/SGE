package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author Tiago F. Santos
 */
public class ProdutoDao {

    public void inserir(Produto prod) {
        Connection con = new Conexao().Lerconexao();
        String Query = "INSERT INTO sge.produto (nome_produto, quantidade_produto, preco_produto, data_cadastro) VALUES(?,?,?,?);";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setString(1, prod.getNome_produto());
            stmt.setInt(2, prod.getQuantidade_produto());
            stmt.setDouble(3, prod.getPreco_produto());
            stmt.setDate(4, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(prod.getData_cadastro())));

            stmt.execute();
            stmt.close();
            con.close();
            System.out.println("Inserido");
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    // ========================== CONSULTAR ====================================
    public Produto consultar(Produto pro) {
        Connection con = new Conexao().Lerconexao();
        String Query = "select * from produto where idProduto=?;";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setInt(1, pro.getIdProduto());
            ResultSet rs = stmt.executeQuery();
            Produto prod = new Produto();
            while (rs.next()) {
                prod.setNome_produto(rs.getString("nome_produto"));
                prod.setQuantidade_produto(rs.getInt("quantidade_produto"));
                prod.setPreco_produto(rs.getFloat("preco_produto"));
                prod.setData_cadastro(rs.getDate("data_cadastro"));

            }
            stmt.executeQuery();
            rs.close();
            stmt.close();
            con.close();
            
            return prod;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterar(Produto prod) {
        Connection con = new Conexao().Lerconexao();
        String sql = "update produto set nome_produto=?, quantidade_produto=?, preco_produto=?, data_cadastro=?"
                + "where idProduto=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, prod.getNome_produto());
            stmt.setInt(2, prod.getQuantidade_produto());
            stmt.setDouble(3, prod.getPreco_produto());
            stmt.setDate(4, prod.getData_cadastro());
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void remove(Produto prod) {
        try {
            Connection con = new Conexao().Lerconexao();
            PreparedStatement stmt = con.prepareStatement("delete " + "from produto where idProduto=?");
            stmt.setInt(1, prod.getIdProduto());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
