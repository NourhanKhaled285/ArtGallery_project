/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tayba
 */
public  class DBconnect{

 public static Connection connect (){
  Connection con=null;
try{
   Class.forName("com.mysql.jdbo.Driver");
   con=DriverManager.getConnection("jdbo:mysql://localhost:3306/photoalbum?","root"," ");

}
catch (Exception e){
System.out.println("Enter.DBconnect.Connect()*");
JOptionPane.showConfirmDialog(null, e);
}
return con;
}
}

 class ArtGallery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

