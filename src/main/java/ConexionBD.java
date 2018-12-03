import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConexionBD {

    Connection cn;
    Statement st;

    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/campeonatoBD","root","");
            System.out.println("Se hizo la conexion existosa");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }return cn;
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
