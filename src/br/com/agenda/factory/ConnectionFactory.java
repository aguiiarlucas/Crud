package br.com.agenda.factory;

import br.com.agenda.model.Contato;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "lukinha02";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";

    public static Connection createConnectionToMySQL() throws Exception {


        return DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
    }

    public static void main(String[] args) throws Exception {
        Connection con = createConnectionToMySQL();
        if (con != null) System.out.println("Conexão  com sucesso");



    }
}

