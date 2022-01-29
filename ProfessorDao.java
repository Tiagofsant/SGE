
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Professor;

/**
 *
 * @author Tiago F. Santos
 */
public class ProfessorDao {

    public void inserir(Professor prof) {
        Connection con = new Conexao().Lerconexao();
        String Query = "INSERT INTO sge.professor (nome_professor, sobrenome_professor, rg_professor, "
                + "cpf_professor, endereco_professor, telefone_professor, email_professor, nascimento_professor"
                + ", cadastro_professor) VALUES(?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setString(1, prof.getNome_professor());
            stmt.setString(2, prof.getSobrenome_professor());
            stmt.setDouble(3, prof.getRg_professor());
            stmt.setDouble(4, prof.getCpf_professor());
            stmt.setString(5, prof.getEndereco_professor());
            stmt.setDouble(6, prof.getTelefone_professor());
            stmt.setString(7, prof.getEmail_professor());
            stmt.setDate(8, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(prof.getNascimento_professor())));
            stmt.setDate(9, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(prof.getCadastro_professor())));

            stmt.execute();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Professor(a) cadastrado com sucesso!");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }
    // ========================== CONSULTAR ====================================

    public Professor consultar(Professor prof) {
        Connection con = new Conexao().Lerconexao();
        String Query = "select * from professor where idProfessor=?;";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setInt(1, prof.getIdProfessor());
            ResultSet rs = stmt.executeQuery();
            
            Professor profe = new Professor();
            
            while (rs.next()) {
                profe.setNome_professor(rs.getString("nome_professor"));
                profe.setSobrenome_professor(rs.getString("sobrenome_professor"));
                profe.setRg_professor(rs.getInt("rg_professor"));
                profe.setCpf_professor(rs.getDouble("cpf_professor"));
                profe.setEndereco_professor(rs.getString("endereco_professor"));
                profe.setTelefone_professor(rs.getDouble("telefone_professor"));
                profe.setEmail_professor(rs.getString("email_professor"));
                profe.setNascimento_professor(rs.getDate("nascimento_professor"));
                profe.setCadastro_professor(rs.getDate("cadastro_professor"));

            }
            stmt.executeQuery();
            rs.close();
            stmt.close();
            con.close();

            return prof;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

  /*  public List<Professor> consultarTodos() {
        Connection con = new Conexao().Lerconexao();
        String Query = "select * from professor";
        List<Professor> listProf = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement(Query);

            ResultSet rs = stmt.executeQuery();
            Professor prof = new Professor();
            while (rs.next()) {
                prof.setNome_professor(rs.getString("nome_professor"));
                prof.setSobrenome_professor(rs.getString("sobrenome_professor"));
                prof.setRg_professor(rs.getInt("rg_professor"));
                prof.setCpf_professor(rs.getDouble("cpf_professor"));
                prof.setEndereco_professor(rs.getString("endereco_professor"));
                prof.setTelefone_professor(rs.getDouble("telefone_professor"));
                prof.setEmail_professor(rs.getString("email_professor"));
                prof.setNascimento_professor(rs.getDate("nascimento_professor"));
                prof.setCadastro_professor(rs.getDate("cadastro_professor"));

                listProf.add(prof);
            }
            rs.close();
            stmt.close();
            con.close();

            return listProf;

        } catch (SQLException e) {
            throw new RuntimeException(e);
       
    }*/

     // ========================== ALTERAR =====================================
    public void alterar(Professor prof) {
        Connection con = new Conexao().Lerconexao();
        String sql = "update professor set nome_professor=?, sobrenome_professor=?, rg_professor=?, "
                + "cpf_professor=?, endereco_professor=?, telefone_professor=?, email_professor=?, nascimento_professor=?"
                + ", cadastro_professor=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, prof.getNome_professor());
            stmt.setString(2, prof.getSobrenome_professor());
            stmt.setDouble(3, prof.getRg_professor());
            stmt.setDouble(4, prof.getCpf_professor());
            stmt.setString(5, prof.getEndereco_professor());
            stmt.setDouble(6, prof.getTelefone_professor());
            stmt.setString(7, prof.getEmail_professor());
            stmt.setDate(8, prof.getNascimento_professor());
            stmt.setDate(9, prof.getCadastro_professor());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
  // ========================== DELETAR ========================================
    public void deletar(Professor prof) {
        try {
            Connection con = new Conexao().Lerconexao();
            PreparedStatement stmt = con.prepareStatement("delete" + "from professor where idProfessor=?");
            stmt.setInt(1, prof.getIdProfessor());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
