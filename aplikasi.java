
import java.sql.*;
import java.util.Scanner;
public class aplikasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try(
            Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost/aplikasi",
                    "root", "");
           
           Statement stmt = conn.createStatement();
                )
        {
            // insert data mahasiswa
            insertdata mahasiswa = new insertdata();
            mahasiswa.insert();
            String insert = ("INSERT INTO mahasiswa VALUES ("+mahasiswa.nim+", '"+mahasiswa.tgl+"')");
            PreparedStatement ins = conn.prepareStatement(insert);
            ins.execute();
            
            
            
    }catch (SQLException ex){
        ex.printStackTrace();
    }
    }
}
