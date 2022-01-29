
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Aluno;

/**
 *
 * @author Tiago F. Santos
 */
public class AlunoDao {
    // ========================== INSERIR =====================================

    public void inserir(Aluno alu) {
        Connection con = new Conexao().Lerconexao();
        String Query = "INSERT INTO sge.aluno (nome_aluno, sobrenome_aluno, rg_aluno, cpf_aluno, "
                + "endereco_aluno, telefone_aluno, email_aluno, nascimento_aluno, cadastro_aluno) "
                + " VALUES(?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setString(1, alu.getNome_aluno());
            stmt.setString(2, alu.getSobrenome_aluno());
            stmt.setDouble(3, alu.getRg_aluno());
            stmt.setDouble(4, alu.getCpf_aluno());
            stmt.setString(5, alu.getEndereco_aluno());
            stmt.setDouble(6, alu.getTelefone_aluno());
            stmt.setString(7, alu.getEmail_aluno());
            stmt.setDate(8, alu.getNascimento_aluno());
            stmt.setDate(9, alu.getCadastro_aluno());

            stmt.execute();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Aluno(a) cadastrado com sucesso!");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    // ========================== CONSULTAR ====================================
    public Aluno consultar(Aluno alu) {
        Connection con = new Conexao().Lerconexao();
        String Query = "select * from aluno where idAluno=?;";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setInt(1, alu.getIdAluno());
            ResultSet rs = stmt.executeQuery();
            
            Aluno alun = new Aluno();
           
            while (rs.next()) {
                alun.setNome_aluno(rs.getString("nome_aluno"));
                alun.setSobrenome_aluno(rs.getString("sobrenome_aluno"));
                alun.setRg_aluno(rs.getInt("rg_aluno"));
                alun.setCpf_aluno(rs.getDouble("cpf_aluno"));
                alun.setEndereco_aluno(rs.getString("endereco_aluno"));
                alun.setTelefone_aluno(rs.getDouble("telefone_aluno"));
                alun.setEmail_aluno(rs.getString("email_aluno"));
                alun.setNascimento_aluno(rs.getDate("nascimento_aluno"));
                alun.setCadastro_aluno(rs.getDate("cadastro_aluno"));
            }
           
            stmt.executeQuery();
            rs.close();
            stmt.close();
            con.close();
            
            return alun;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    // ========================== ALTERAR ======================================

    public void alterar(Aluno alun) {
        Connection con = new Conexao().Lerconexao();
        String sql = "update aluno set nome_aluno=?, sobrenome_aluno=?, rg_aluno=?,cpf_aluno=?, endereco_aluno=?, "
                + "telefone_aluno=?, email_aluno=?, nascimento_aluno=?,cadastro_aluno=?, where idAluno=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, alun.getNome_aluno());
            stmt.setString(2, alun.getSobrenome_aluno());
            stmt.setInt(3, alun.getRg_aluno());
            stmt.setDouble(4, alun.getCpf_aluno());
            stmt.setString(5, alun.getEndereco_aluno());
            stmt.setDouble(6, alun.getTelefone_aluno());
            stmt.setString(7, alun.getEmail_aluno());
            stmt.setDate(8, alun.getNascimento_aluno());
            stmt.setDate(9, alun.getCadastro_aluno());
            
            stmt.execute();
            stmt.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Aluno(a) alterado com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // ========================== DELETAR ======================================
    public void deletar(Aluno alun) {
        try {
            Connection con = new Conexao().Lerconexao();
            PreparedStatement stmt = con.prepareStatement("delete " + "from aluno where idAluno=?");
            stmt.setInt(1, alun.getIdAluno());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Aluno(a) deletado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
