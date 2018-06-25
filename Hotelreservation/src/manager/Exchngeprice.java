/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

import supervisor.*;
import com.mysql.jdbc.Connection;
import database.DBconnect;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sharan
 */
public class Exchngeprice extends Changeroompricegetset{
    public void changeroomprice(){
     
        
        Connection connect= null;
ResultSet rst=null;
Statement st=null;

     
     connect=DBconnect.connect(); 
     
     
     
     try{

            
            st= connect.createStatement();
            String sql="UPDATE single_rooms SET Price="+newprice+" WHERE room_no='"+selectroom+"'";
            st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null, "updated!");
        
        
        }
        catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }                                   
    
}
