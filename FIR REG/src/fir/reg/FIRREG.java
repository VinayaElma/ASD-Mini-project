
package fir.reg;
import java.sql.*;
import javax.swing.*;
import java.awt.*;



public class FIRREG{
   
   static final String url="jdbc:mysql://localhost:3306/FIR";
   static final String user="root";
   static final String pass="root";
   
    public static void main(String[] args) {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn=DriverManager.getConnection(url,user,pass);
          new home().setVisible(true);
          
           System.out.println("Sucess");
       }catch(Exception e){System.out.println(e);}
    }
    
}
