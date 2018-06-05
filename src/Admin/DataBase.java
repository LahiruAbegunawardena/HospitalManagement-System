/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;
import java.sql.*;

/**
 *
 * @author Sampath
 */
public class DataBase {
    
    public static Statement getStatement(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_sysdb","root","");
            Statement stat = con.createStatement();
            return stat;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
