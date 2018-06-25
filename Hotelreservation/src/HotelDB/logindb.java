/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HotelDB;

import database.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sharan
 */
public class logindb {
    
    public ResultSet confirmLogin(){
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rst = null;
        
        try{
            con = DBconnect.connect();
            String qry = "SELECT * from login";
            pst = con.prepareStatement(qry);
            rst = pst.executeQuery();
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
           
        }
      
        
        return rst;   
    }
}
