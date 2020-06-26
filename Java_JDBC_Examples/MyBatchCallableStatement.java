package com.java2novice.jdbc;
 
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class MyBatchCallableStatement {
 
    public static void main(String a[]){
         
        Connection con = null;
        CallableStatement callSt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.
                getConnection("jdbc:oracle:thin:@<hostname>:<port num>:<DB name>"
                    ,"user","password");
            callSt = con.prepareCall("{call myprocedure(?,?)}");
            callSt.setInt(1,200);
            callSt.setDouble(2, 3000);
            callSt.addBatch();
            callSt.setInt(1,130);
            callSt.setDouble(2, 2000);
            callSt.addBatch();
            int[] updateCounts = callSt.executeBatch();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(callSt != null) callSt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
}