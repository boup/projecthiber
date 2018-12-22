package entity;

import java.sql.*;


public class AccessDao {
    static Connection con;
    static PreparedStatement st;
    static ResultSet rs;
    static int re,nb=0;
    static {
        try {
            Class.forName("org.postgresql.Driver");// charger le pilote postgres
            /* connexion a la base apres chargement du pilot */
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbproject", "postgres", "");

        } catch (Exception e) {
            System.out.println( " has not been saved into RDF/XML;");
            System.out.println(e.getMessage());
        }
    }
}
