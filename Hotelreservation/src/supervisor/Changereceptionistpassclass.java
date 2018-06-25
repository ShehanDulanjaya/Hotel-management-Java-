/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supervisor;

import com.mysql.jdbc.Connection;
import database.DBconnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import manager.Changereceptionistpass1;

/**
 *
 * @author Sharan
 */
public class Changereceptionistpassclass {
    
private String receptionistID;
    private String newpass;
     private String confirmpass;

    public String getReceptionistID() {
        return receptionistID;
    }

    public void setReceptionistID(String receptionistID) {
        this.receptionistID = receptionistID;
    }

    public String getNewpass() {
        return newpass;
    }

    public void setNewpass(String newpass) {
        this.newpass = newpass;
    }

    public String getConfirmpass() {
        return confirmpass;
    }

    public void setConfirmpass(String confirmpass) {
        this.confirmpass = confirmpass;
    }
     
    
    public void changeReceptionistpass(){
     
        
        Connection connect= null;
        ResultSet rst=null;
        Statement pst=null;

     
     connect=DBconnect.connect();
     
     if((!"".equals(confirmpass))&&(!"".equals(newpass))&&(!"".equals(receptionistID))){
            
                if(!confirmpass.equals(newpass))
    {
        JOptionPane.showMessageDialog(null, "Password not matched!");
   } else{
    
                     int dbb = JOptionPane.YES_NO_OPTION;
                JOptionPane.showConfirmDialog (null, "Would You Like to Change receptionist Password?","Warning",dbb);
     if(dbb == JOptionPane.YES_OPTION){ 
        
    try {
        String sql6="UPDATE login SET Password="+confirmpass+" WHERE userId='"+receptionistID+"'";
        pst = connect.prepareStatement(sql6);
        if(pst.executeUpdate(sql6)==1){
        
        JOptionPane.showMessageDialog(null, "Succes!");}
    }catch (SQLException ex) {
        Logger.getLogger(Changereceptionistpass1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
     


    
    }}}} 
