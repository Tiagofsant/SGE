package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Servidor;

/**
 *
 * @author Tiago F. Santos
 */
public class ServidorDao {

    public void inserir(Servidor ser) {
        Connection con = new Conexao().Lerconexao();
        String Query = "INSERT INTO sge.servidor (nome_servidor, sobrenome_servidor, rg_servidor, cpf_servidor, "
                + "endereco_servidor, telefone_servidor, email_servidor, nascimento_servidor, "
                + "funcao_servidor, cadastro_servidor) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setString(1, ser.getNome_servidor());
            stmt.setString(2, ser.getSobrenome_servidor());
            stmt.setInt(3, ser.getRg_servidor());
            stmt.setDouble(4, ser.getCpf_servidor());
            stmt.setString(5, ser.getEndereco_servidor());
            stmt.setDouble(6, ser.getTelefone_servidor());
            stmt.setString(7, ser.getEmail_servidor());
            stmt.setDate(8, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(ser.getNascimento_servidor())));
            stmt.setString(9, ser.getFuncao_servidor());
            stmt.setDate(10, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(ser.getCadastro_servidor())));

            stmt.execute();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Servidor cadastrado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ploblemas no momento do Cadastro");
            throw new RuntimeException(ex);
        }

    }
    // ========================== CONSULTAR ====================================

    public Servidor consultar(Servidor ser) {
        Connection con = new Conexao().Lerconexao();
        String Query = "select * from servidor where idServidor=?;";
        try {
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setInt(1, ser.getIdServidor());
            ResultSet rs = stmt.executeQuery();
            Servidor serv = new Servidor();
            while (rs.next()) {
                serv.setNome_servidor(rs.getString("nome_servidor"));
                serv.setSobrenome_servidor(rs.getString("sobrenome_servidor"));
                serv.setRg_servidor(rs.getInt("rg_servidor"));
                serv.setCpf_servidor(rs.getDouble("cpf_servidor"));
                serv.setEndereco_servidor(rs.getString("endereco_servidor"));
                serv.setTelefone_servidor(rs.getDouble("telefone_servidor"));
                serv.setEmail_servidor(rs.getString("email_servidor"));
                serv.setCadastro_servidor(rs.getDate("cadastro_servidor"));
                serv.setNascimento_servidor(rs.getDate("nascimento_servidor"));
                serv.setFuncao_servidor(rs.getString("funcao_servidor"));
            }
            stmt.executeQuery();
            rs.close();
            stmt.close();
            con.close();

            return serv;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterar(Servidor serv) {
        Connection con = new Conexao().Lerconexao();
        String sql = "update servidor set (nome_servidor=?, sobrenome_servidor=?, rg_servidor=?, cpf_servidor=?, "
                + "endereco_servidor=?, telefone_servidor=?, email_servidor=?, nascimento_servidor=?, "
                + "funcao_servidor=?, cadastro_servidor=?) "
                + "where idServidor=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, serv.getNome_servidor());
            stmt.setString(2, serv.getSobrenome_servidor());
            stmt.setInt(3, serv.getRg_servidor());
            stmt.setDouble(4, serv.getCpf_servidor());
            stmt.setString(5, serv.getEndereco_servidor());
            stmt.setDouble(6, serv.getTelefone_servidor());
            stmt.setString(7, serv.getEmail_servidor());
            stmt.setDate(8, serv.getNascimento_servidor());
            stmt.setString(9, serv.getFuncao_servidor());
            stmt.setDate(10, serv.getCadastro_servidor());

            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Servidor cadastrado com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void deletar(Servidor serv) {
        try {
            Connection con = new Conexao().Lerconexao();
            PreparedStatement stmt = con.prepareStatement("delete " + "from servidor where idServidor=?");
            stmt.setInt(1, serv.getIdServidor());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
