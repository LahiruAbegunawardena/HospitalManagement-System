/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Sampath
 */
public class ServiceReg_con {
    
    public void SubmitBtn(String service_nm, String wardID, String descr, String val, String type) {
        String srv_id="";
        try {
            Statement stat = Admin.DataBase.getStatement();
            stat.executeUpdate("INSERT INTO Service(service_name, ward_id,serv_type, description, value) "
                    +          "VALUES('"+service_nm+"', '"+wardID+"', '"+type+"', '"+descr+"', '"+val+"')");
            
            ResultSet rs = stat.executeQuery("SELECT serve_id FROM Service WHERE service_name='"+service_nm+"' AND ward_id='"+wardID+"'");
            while(rs.next()){
                srv_id = rs.getString(1);
            }
            
            if(type.equals("Test")){
                
                stat.executeUpdate("INSERT INTO Test(service_id, test_name, description) "
                    +          "VALUES('"+srv_id+"', '"+service_nm+"', '"+descr+"')");
                
            }else if(type.equals("Treatment")){
                
                stat.executeUpdate("INSERT INTO Treatment(service_id, treatment_name, description) "
                    +          "VALUES('"+srv_id+"', '"+service_nm+"', '"+descr+"')");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public boolean checkNum(String srvName) {
        boolean check=true;
        try {
            Statement stat = Admin.DataBase.getStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM Service WHERE service_name='"+srvName+"'");
            int count=0;            
            while(rs.next()){
                count++;
            }
            if(count==1){
                check=true;
            }else{
                check=false;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
        
    }

    public void UpdateBtn(String service_nm, String wardID, String descr, String val, String type, String serviceId) {
        try {
            Statement stat = Admin.DataBase.getStatement();
            stat.executeUpdate("UPDATE Service "
                    + "SET service_name='"+service_nm+"', ward_id='"+wardID+"', description='"+descr+"', value='"+val+"', serv_type='"+type+"' "
                    + "WHERE serve_id='"+serviceId+"'");
            
            if(type.equals("Test")){
                stat.executeUpdate("UPDATE Test "
                        + "SET test_name='"+service_nm+"', description='"+descr+"' "
                        + "WHERE service_id='"+serviceId+"'");
                
            }else if(type.equals("Treatment")){
                stat.executeUpdate("UPDATE Treatment "
                        + "SET treatment_name='"+service_nm+"', description='"+descr+"' "
                        + "WHERE service_id='"+serviceId+"'");
                
            }
            JOptionPane.showMessageDialog(null, "Successfully updated..", "Updation..",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void dltBtn(String serviceName) {
        try {
            
        } catch (Exception e) {
        }
    }

    public void dltBtn(String srvName, String wrdid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
