/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Sampath
 */
public class pst_TestCon {

    public void sbmtbtn(String nicNo, String servID, String docID, String docRep) {
        DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        String dy1 = dfm.format(cal.getTime());
        String patID = "", srvType = "";
        
        try {          
            Statement stat = Admin.DataBase.getStatement();
            
            ResultSet rs1 = stat.executeQuery("SELECT patient_id FROM Patient WHERE nic_no='"+nicNo+"'");            
            if(rs1.next()){
                patID = rs1.getString(1);
            }
            
            ResultSet rs2 = stat.executeQuery("SELECT serv_type FROM Service WHERE serve_id='"+servID+"'");
            if(rs2.next()){
                srvType = rs2.getString(1);
            }
            stat.executeUpdate("INSERT INTO Prescription(serve_id,doct_id,patient_id,date,type,description) "
                    + "VALUES('"+servID+"','"+docID+"','"+patID+"','"+dy1+"','"+srvType+"','"+docRep+"')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updtbtn(String nicNo, String servID, String docID, String docRep) {
        String prscID = "", servtype="";
        boolean check=true;
        try {          
            
            Statement stat = Admin.DataBase.getStatement();
            
            ResultSet rs1 = stat.executeQuery("SELECT pr.prescript_id "
                    + "FROM Patient p, Prescription pr, Service s "
                    + "WHERE p.nic_no='"+nicNo+"' AND p.patient_id=pr.patient_id AND s.serve_id=pr.serve_id");            
            if(rs1.next()){
                prscID = rs1.getString(1);                
            }else{
                check=false;
                JOptionPane.showMessageDialog(null, "Cannot update.. \n This prescription does not exist..", "Update Error..",JOptionPane.INFORMATION_MESSAGE);
            }
            ResultSet rs2 = stat.executeQuery("SELECT serv_type FROM Service WHERE serve_id='"+servID+"'");
            if(rs2.next()){
                servtype = rs2.getString(1);
            }else{
                check=false;
                JOptionPane.showMessageDialog(null, "Cannot update.. \n This service does not exist..", "Update Error..",JOptionPane.INFORMATION_MESSAGE);
            }
            
            if(check){
                stat.executeUpdate("UPDATE Prescription "
                    + "SET serve_id='"+servID+"',doct_id='"+docID+"', type='"+servtype+"', description='"+docRep+"' "
                        + "WHERE prescript_id='"+prscID+"'");
                JOptionPane.showMessageDialog(null, "Successfuly updated..", "Update..",JOptionPane.INFORMATION_MESSAGE);
            }
                        
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
