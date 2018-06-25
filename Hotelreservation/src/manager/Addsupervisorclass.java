/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

import com.mysql.jdbc.Connection;
import database.DBconnect;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sharan
 */
public class Addsupervisorclass {
    
private String supID;
    private String supname;
    private String suppass;
    private String supconfirmpass;
    private String suptype;

    public String getSuptype() {
        return suptype;
    }

    public void setSuptype(String suptype) {
        this.suptype = suptype;
    }
    

    public String getSupID() {
        return supID;
    }

    public void setSupID(String supID) {
        this.supID = supID;
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname;
    }

    public String getSuppass() {
        return suppass;
    }

    public void setSuppass(String suppass) {
        this.suppass = suppass;
    }

    public String getSupconfirmpass() {
        return supconfirmpass;
    }

    public void setSupconfirmpass(String supconfirmpass) {
        this.supconfirmpass = supconfirmpass;
    }
    
    
    public void addSupervisor(){
     
        
        Connection connect= null;

     ResultSet rst=null;
     Statement pst=null;

     
     connect=DBconnect.connect();
     
     
      //if( suppass.equals(supconfirmpass)&&(!"".equals(suppass))){
        try {
   
String sql = "insert into adminlg (username,pass,name,type) values('"+supID+"','"+supname+"','"+suppass+"','"+suptype+"')";  
// dataop > table name in your database
// id,username,password,age,email > field name in your tables.
pst = connect.createStatement();
        
if(pst.executeUpdate(sql)==1){
    JOptionPane.showMessageDialog(null, "Succes!"); 

}

        
          
        
        } catch (Exception ex) {
         JOptionPane.showMessageDialog(null, ex);
        }}}
