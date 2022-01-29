package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Fornecedor;

/**
 *
 * @author Tiago F. Santos
 */
public class FornecedorDao {

    public void inserir(Fornecedor forn) {
        Connection con = new Conexao().Lerconexao();
        String Query = "INSERT INTO sge.fornecedor (nome_fornecedor, endereco_fornecedor, telefone_fornecedor, "
                + "cpfcnpj_fornecedor, email_fornecedor, cadastro_fornecedor, entrega_fornecedor) VALUES(?,?,?,?,?,?,?);";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setString(1, forn.getNome_fornecedor());
            stmt.setString(2, forn.getEndereco_fornecedor());
            stmt.setDouble(3, forn.getTelefone_fornecedor());
            stmt.setDouble(4, forn.getCpfcnpj_fornecedor());
            stmt.setString(5, forn.getEmail_fornecedor());
            stmt.setDate(6, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(forn.getCadastro_fornecedor())));
            stmt.setDate(7, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(forn.getEntrega_fornecedor())));

            stmt.execute();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }
    // ========================== CONSULTAR ====================================

    public Fornecedor consultar(Fornecedor forn) {
        Connection con = new Conexao().Lerconexao();
        String Query = "select * from fornecedor where idFornecedor=?;";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setInt(1, forn.getIdFornecedor());
            ResultSet rs = stmt.executeQuery();
            
            Fornecedor forne = new Fornecedor();
            
            while (rs.next()) {
                forne.setNome_fornecedor(rs.getString("nome_fornecedor"));
                forne.setCpfcnpj_fornecedor(rs.getInt("cpfcnpj_fornecedor"));
                forne.setEndereco_fornecedor(rs.getString("endereco_fornecedor"));
                forne.setTelefone_fornecedor(rs.getDouble("telefone_fornecedor"));
                forne.setEmail_fornecedor(rs.getString("email_fornecedor"));
                forne.setCadastro_fornecedor(rs.getDate("cadastro_fornecedor"));
                forne.setEntrega_fornecedor(rs.getDate("entrega_fornecedor"));
            }

            stmt.executeQuery();
            rs.close();
            stmt.close();
            con.close();

            return forn;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
// ========================== ALTERAR ==========================================

    public void alterar(Fornecedor forn) {
        Connection con = new Conexao().Lerconexao();
        String sql = "update fornecedor set nome_fornecedor=?, cpfcnpj_fornecedor=?"
                + "endereco_fornecedor=?, telefone_fornecedor=?, email_fornecedor=?, cadastro_fornecedor=?"
                + "entrega_fornecedor=? where idFornecedor=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, forn.getNome_fornecedor());
            stmt.setDouble(2, forn.getCpfcnpj_fornecedor());
            stmt.setString(3, forn.getEndereco_fornecedor());
            stmt.setDouble(4, forn.getTelefone_fornecedor());
            stmt.setString(5, forn.getEmail_fornecedor());
            stmt.setDate(6, forn.getCadastro_fornecedor());
            stmt.setDate(7, forn.getEntrega_fornecedor());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Fornecedor(a) alterado com sucesso");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
// ========================== DELETAR ==========================================

    public void deletar(Fornecedor forn) {
        try {
            Connection con = new Conexao().Lerconexao();
            PreparedStatement stmt = con.prepareStatement("delete " + "from fornecedor where idFornecedor=?");
            stmt.setInt(1, forn.getIdFornecedor());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Fornecedor(a) deletado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
