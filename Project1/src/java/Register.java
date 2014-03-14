
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Register {
    
    public static boolean addWebsite(String websiteName){
        DBManager  db = new DBManager();
        // INSERT INTO charity_sites (url) values(websitename);
        try{
            db.update("INSERT INTO charity_sites (url) values("+websiteName+")"
                    + ";");
            return true;
        }catch(SQLException e){
            
        }
        return false;
    }
    public static boolean addWebAdmin(User user){
       boolean success=false;
       DBManager  db = new DBManager();
      // INSERT INTO id_center(username, guest, registered_user, administrator, website_admin) values ( username, 0, 0, 0, 1);
//SELECT g_ID FROM id_center WHERE username = username;
//INSERT INTO website_admin (g_ID, w_ID, username, firstname, lastname, password, email) values (g_ID, w_ID, username, fname,
      //add the user createing his global id
       String regInsert="INSERT INTO id_center(username, guest,"
               + " registered_user, administrator, website_admin) values ( "
               +user.getUname()+", 0, 0, 0, 1);";
        try{
         int result =  db.update(regInsert);
         if(result != 0){
             //if succesfu; get the global ID
            ResultSet rs= db.query("SELECT g_ID FROM id_center WHERE username = "
                    + ""+user.getUname()+";");
                    if(rs.first()){
                        int g_id=rs.getInt("g_ID");
                        user.setId(g_id);
                        //get website_id
            ResultSet resset= db.query("SELECT w_ID from charity_sites"
                    + " WHERE url="+user.getCharityName()+";");
                        if(resset.first()){
                           int w_ID= resset.getInt("w_ID");
                       int complete= db.update("INSERT INTO website_admin "
                                + "(g_ID, w_ID, username,firstname, "
                                + "lastname, password, email) "
                                + "values ("+g_id+","+ w_ID+","
                                + user.getUname()+"," +user.getFname()+","
                                + user.getLname()+","+user.getPassword()+","
                                +user.getEmail()+");");
                       success=complete==1;//value expected from db.update()
                        }
                    }
         }
       }catch(SQLException e){
           
       }
        return success;
    }
}
