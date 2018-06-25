/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supervisor;

import com.mysql.jdbc.Connection;
import database.DBconnect;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sharan
 */
public class Addreceptionistclass {
    
    
    private String id;
    private String fname;
    private String lname;
    private String add;
    private String cno;
    private String nic;
    private String gender;
    private String createpw;
    private String confrimpw;
     private String availble;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getSex() {
        return gender;
    }

    public void setSex(String sex) {
        this.gender =gender;
    }

    public String getCreatepw() {
        return createpw;
    }

    public void setCreatepw(String createpw) {
        this.createpw = createpw;
    }

    public String getConfrimpw() {
        return confrimpw;
    }

    public void setConfrimpw(String confrimpw) {
        this.confrimpw = confrimpw;
    }

    public String getAvailble() {
        return availble;
    }

    public void setAvailble(String availble) {
        this.availble = availble;
    }
    
    
      

    
    public void addReceptionist(){
     
        
        Connection connect= null;
ResultSet rst=null;
Statement pst=null;

     
     connect=DBconnect.connect();
     
    
         int dbb =   JOptionPane.showConfirmDialog (null, "Would You Like Add receptionist?","Warning",JOptionPane.YES_NO_OPTION);
     if(dbb == JOptionPane.YES_OPTION) 
          if( createpw.equals(confrimpw)&&(!"".equals(createpw))){
      try {
   
String sql = "insert into login (userId,Password,fname,lname,addrs,telno,nic,sex) "
        + "values('"+id+"','"+createpw+"','"+fname+"','"+lname+"','"+add+"','"+cno+"','"+nic+"','"+gender+"')";  

pst = connect.createStatement();

if(pst.executeUpdate(sql)==1){
    JOptionPane.showMessageDialog(null, "Succes!"); 

}

        
          
        
        } catch (Exception ex) {
         JOptionPane.showMessageDialog(null, ex);
    }
       
    }
    
}
}
    

