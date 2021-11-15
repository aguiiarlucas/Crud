package br.com.agenda.dao;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {


    public void save (Contato contato) throws Exception {



        String sql =  "INSERT INTO contatos(nome,idade,datacadastro)" +
                " VALUES(?,?,?)";
        Connection conn = null;
        PreparedStatement   pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL() ;

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1,contato.getNome() );
            pstm.setInt(2,contato.getIdade());
            pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));

            pstm.executeUpdate();
        }catch (Exception e ){
            e.printStackTrace();
        }finally {
            try {
                if (pstm !=null)pstm.close();
                if (conn !=null) conn.close();
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
    }
}
