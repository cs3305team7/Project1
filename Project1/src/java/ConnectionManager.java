/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author as11
 */
public class ConnectionManager {
    private static ConnectionManager instance = null; 
    private final String Username = "sor4";
    private final String Password = "iikiighu";
    private final String connection_string = "cs1.ucc.ie/2015_sor4"; //cms_system is the database name AND mysql changed to derby
    
    private Connection con = null;
    
    //constructor for this class
    private ConnectionManager(){
        
    }
    
    public static ConnectionManager getInstance(){
        if(instance == null){
            instance = new ConnectionManager();
        }
        return instance;
    }
    
    private boolean openConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+connection_string, Username, Password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch(Exception ex){ex.printStackTrace();return false;}
        return true;
    }
    
    public Connection getConnection(){
        if(con == null){
            if(openConnection()){
                System.out.println("Connection Opened!");
                return con;
            } else {
                return null;
            }
        }
        return con;
    }
    
    public void close(){
        System.out.println("Connection Closing");
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            //Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        con = null;
    }
}
