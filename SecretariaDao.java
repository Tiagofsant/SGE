package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Secretaria;

/**
 *
 * @author Tiago F. Santos
 */
public class SecretariaDao {

    public void inserir(Secretaria sec) {
        Connection con = new Conexao().Lerconexao();
        String Query = "INSERT INTO sge.secretaria (nome_secretaria, sobrenome_secretaria, rg_secretaria, "
                + "cpf_secretaria, endereco_secretaria, telefone_secretaria, email_secretaria, "
                + "nascimento_secretaria, cadastro_secretaria) "
                + "VALUES(?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setString(1, sec.getNome_secretaria());
            stmt.setString(2, sec.getSobrenome_secretaria());
            stmt.setInt(3, sec.getRg_secretaria());
            stmt.setDouble(4, sec.getCpf_secretaria());
            stmt.setString(5, sec.getEndereco_secretaria());
            stmt.setDouble(6, sec.getTelefone_secretaria());
            stmt.setString(7, sec.getEmail_secretaria());
            stmt.setDate(8, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(sec.getNascimento_secretaria())));
            stmt.setDate(9, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(sec.getCadastro_secretaria())));

            stmt.execute();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Secretariado cadastrado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ploblemas no momento do Cadastro");
            throw new RuntimeException(ex);
        }

    }
    // ========================== CONSULTAR ====================================

    public Secretaria consultar(Secretaria sex) {
        Connection con = new Conexao().Lerconexao();
        String Query = "select * from secretaria where idSecretaria=?;";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setInt(1, sex.getIdSecretaria());
            ResultSet rs = stmt.executeQuery();
            Secretaria sec = new Secretaria();
            while (rs.next()) {
                sec.setNome_secretaria(rs.getString("nome_secretaria"));
                sec.setSobrenome_secretaria(rs.getString("sobrenome_secretaria"));
                sec.setRg_secretaria(rs.getInt("rg_secretaria"));
                sec.setCpf_secretaria(rs.getDouble("cpf_secretaria"));
                sec.setEndereco_secretaria(rs.getString("endereco_secretaria"));
                sec.setTelefone_secretaria(rs.getDouble("telefone_secretaria"));
                sec.setEmail_secretaria(rs.getString("email_secretaria"));
                sec.setNascimento_secretaria(rs.getDate("nascimento_secretaria"));
                sec.setCadastro_secretaria(rs.getDate("cadastro_secretaria"));

            }
            stmt.execute();
            rs.close();
            stmt.close();
            con.close();

            return sec;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterar(Secretaria sec) {
        Connection con = new Conexao().Lerconexao();
        String sql = "update secretaria set nome_secretaria=?, sobrenome_secretaria=?, rg_secretaria=?, "
                + "cpf_secretaria=?, endereco_secretaria=?, telefone_secretaria=?, "
                + "email_secretaria=?, nascimento_secretaria=?, cadastro_secretaria=? where idSecretaria=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, sec.getNome_secretaria());
            stmt.setString(2, sec.getSobrenome_secretaria());
            stmt.setInt(3, sec.getRg_secretaria());
            stmt.setDouble(4, sec.getCpf_secretaria());
            stmt.setString(5, sec.getEndereco_secretaria());
            stmt.setDouble(6, sec.getTelefone_secretaria());
            stmt.setString(7, sec.getEmail_secretaria());
            stmt.setDate(8, sec.getNascimento_secretaria());
            stmt.setDate(9, sec.getCadastro_secretaria());

            stmt.execute();
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Secretariado alterado com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void deletar(Secretaria sec) {
        try {
            Connection con = new Conexao().Lerconexao();
            PreparedStatement stmt = con.prepareStatement("delete " + "from secretaria where idSecretaria=?");
            stmt.setInt(1, sec.getIdSecretaria());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
