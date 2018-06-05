/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Sampath
 */
public class Payment_con {

    public void setPay(String pNIC, String value) {
        String pid="";
        
        DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        String dy1 = dfm.format(cal.getTime());
        
        try {
            Statement stat = Admin.DataBase.getStatement();
            ResultSet rs1 = stat.executeQuery("SELECT patient_id FROM Patient WHERE nic_no='"+pNIC+"'");
            if(rs1.next()){
                pid = rs1.getString(1);
            }else{
                JOptionPane.showMessageDialog(null, "Patient's nic no is invalid..", "Validation Error..",JOptionPane.INFORMATION_MESSAGE);                
            }
            stat.executeUpdate("INSERT INTO Payment(patient_id, payment_val, check_paid, date) "
                    + "VALUES('"+pid+"', '"+value+"', 'Paid', '"+dy1+"')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
