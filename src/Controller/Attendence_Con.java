/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author Sampath
 */

public class Attendence_Con {
        
    public void setAttendence(String nic_Var, String attTime){
        try {
            Statement stat = Admin.DataBase.getStatement();
            String empID = "";  boolean chck = false;
            int a_hr=0,a_min=0, lv_min=0, lv_hr=0;
                    
            ResultSet rs1 = stat.executeQuery("SELECT emp_id FROM Employee WHERE nic_no='"+nic_Var+"'");
            if(rs1.next()){
                empID = rs1.getString(1);
                chck = true;
            }else{
                JOptionPane.showMessageDialog(null, "NIC of employee is wrong.. \n can't mark attendence..", "Error...",JOptionPane.INFORMATION_MESSAGE);
            }
            if(chck){
                DateFormat dfm1 = new SimpleDateFormat("yyyy-MM-dd");
                DateFormat dfm2 = new SimpleDateFormat("MMM");
                
                Calendar cal = Calendar.getInstance();
                String dy1 = dfm1.format(cal.getTime());
                String mnt = dfm2.format(cal.getTime());
                                    
                String att1[]=new String[2]; 
                
                String att=attTime;
                att1 = att.split(" ");
                
                a_hr=Integer.valueOf(att1[0]);
                a_min=Integer.valueOf(att1[1]);                                           
                                
                stat.executeUpdate("INSERT INTO Daily_report(emp_id, due_date, in_time, month_name) "
                    + "VALUES('"+empID+"','"+dy1+"','"+attTime+"','"+mnt+"')");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setLeave(String nic_var, String lvTime){
        try {
            Statement stat = Admin.DataBase.getStatement();
            String empID = "", rptID="";  
            boolean chck = false;
            int a_hr=0,a_min=0, lv_min=0, lv_hr=0;
                    
            ResultSet rs1 = stat.executeQuery("SELECT emp_id FROM Employee WHERE nic_no='"+nic_var+"'");
            if(rs1.next()){
                empID = rs1.getString(1);
                chck = true;
            }else{
                JOptionPane.showMessageDialog(null, "NIC of employee is wrong.. \n can't mark leave..", "Error...",JOptionPane.INFORMATION_MESSAGE);
            }
            if(chck){
                DateFormat dfm1 = new SimpleDateFormat("yyyy-MM-dd");
                                
                Calendar cal = Calendar.getInstance();
                String dy1 = dfm1.format(cal.getTime());
                
                String lv1[] = new String[2];
                String att1[] = new String[2];
                    
                try {
                    ResultSet rs2 = stat.executeQuery("SELECT * FROM Daily_report WHERE emp_id='"+empID+"' AND due_date='"+dy1+"'");
                    boolean chck2=false;
                    
                    if(rs2.next()){
                        rptID = rs2.getString("report_id");
                        att1 = (rs2.getString("in_time")).split(" ");
                        chck2 = true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Attendence hasn't marked on today.. \n can't mark leave..", "Error...",JOptionPane.INFORMATION_MESSAGE);
                    }
                    if(chck2){                        
                        a_hr = Integer.valueOf(att1[0]);
                        a_min = Integer.valueOf(att1[1]);                        
                    }
                    
                    String lv = lvTime;
                    lv1 = lv.split(" ");
                    lv_hr=Integer.valueOf(lv1[0]);
                    lv_min=Integer.valueOf(lv1[1]);
                    
                } catch (Exception e1) {
                    e1.printStackTrace();
                }                                            
                                                
                String timeGap = this.getTimeGap(a_min, a_hr, lv_min, lv_hr);
                
                stat.executeUpdate("UPDATE Daily_report "
                        +          "SET out_time='"+lvTime+"', time_period='"+timeGap+"' "
                        +          "WHERE report_id='"+rptID+"'");                
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    public String getTimeGap(int a_min, int a_hr, int lv_min, int lv_hr){
        int gap_hr=0, gap_min=0; 
        String gap="";
                                                        
        if(lv_min>=a_min){
            gap_min=lv_min-a_min;
        }else{
            gap_min=60+lv_min-a_min;
            lv_hr-=1;
        }
        gap_hr = lv_hr-a_hr;
               
        if(gap_min>9){
            gap = Integer.toString(gap_hr)+" hours "+Integer.toString(gap_min)+" mins";
        }else{
            gap = Integer.toString(gap_hr)+" hours 0"+Integer.toString(gap_min)+" mins";
        }
        
        return gap;
    }      
    
    public static void main(String[] args) {
        
    }
    
}