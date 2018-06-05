/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sampath
 */
public class slctDoct_con {
    public String passID(String id){
        String nic = id, Rank="", dctID="", dctName="", empID="";
        boolean chck = true;
        try {
            Statement stat = Admin.DataBase.getStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM Employee WHERE nic_no='"+nic+"'");
            
            if(rs.next()){
                Rank=rs.getString("career");
                empID = rs.getString("emp_id");
            }else{
                JOptionPane.showMessageDialog(null, "No employee with this NIC no..", "Error..",JOptionPane.INFORMATION_MESSAGE);
                chck=false;
            }
            
            if(chck && Rank.equals("Doctor")){
                ResultSet rs1 = stat.executeQuery("SELECT * FROM Doctor WHERE emp_id='"+empID+"'");
                if(rs1.next()){
                    dctID = rs1.getString("doct_id");  
                    dctName = rs1.getString("doct_fname")+"_"+rs1.getString("doct_lname");
                }
            }else{
                JOptionPane.showMessageDialog(null, "You are not a Doctor..", "Error..",JOptionPane.INFORMATION_MESSAGE);
                chck=false;
            }         
                     
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(chck){
            return dctID+" "+dctName;
        }else{
            return "0 0";            
        }
        
    }
    
}
