
package DataBaseAccess;

import java.sql.*;

public class Conexion {
    
    protected Connection connection;
    protected Statement statement, statementTwo;
    
    final private String serverName = "localhost";
    final private String portNumber = "3306";
    final private String dataBaseName = "hacking";
    final private String URL = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + dataBaseName;
    final private String userName = "root";
    final private String password = "1017209909Josue.";
    
    private String errorMessage;
    
    
    public Conexion(){
    
    }
    
    public String getURL(){
        return URL;
    }
    
    public Connection Connect(){
        connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(getURL(), userName, password);
            statement = connection.createStatement();
            statementTwo = connection.createStatement();
            System.out.println("Conectado");
        }catch(ClassNotFoundException | SQLException e){
            errorMessage = "Conexion no establecida";
            System.out.println(errorMessage);
            return null;
        }
        return connection;
    }
    
    public void Disconnect(){
        try{
            connection.close();
            statement.close();
            statementTwo.close();
        }catch(SQLException e){
            errorMessage = "Error mientras se cerraba la conexion a la base de datos";
            System.out.println(errorMessage);
        }
    }
    
    public Statement getStatement(){
        return this.statement;
    }
    
    public Statement getStatementTwo(){
        return this.statementTwo;
    }
    
}
