/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * this class is going to manage all the database functions
 * @author as11
 */
public class DBManager {
    private  Connection con; // makes call to dbConnection
       
    private Connection getConnection(){
        return con==null? ConnectionManager.getInstance().getConnection():con;
    }
     public void Insert(User set) throws SQLException {
            con =getConnection();
            try {
                 String sql = "INSERT INTO REGISTER(FNAME,LNAME,EMAIL,PASSWORD) VALUES(?,?,?,?)";
                 PreparedStatement prepared_statement = con.prepareStatement(sql);
                 //prepared_statement.setInt(1,10);
                 prepared_statement.setString(1,set.getFname());
                 prepared_statement.setString(2,set.getLname());
                 prepared_statement.setString(3,set.getEmail());
                 prepared_statement.setString(4,set.getPassword());
                 prepared_statement.executeUpdate();

                 con.close(); //closing the connection
             }
            catch (SQLException ex) {
                Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    /**
     *
     * @param get
     * @return
     * @throws SQLException
     */
    public  int checkUser(User get) throws SQLException{
                con = getConnection();
                String sql ="SELECT * FROM REGISTER WHERE EMAIL='"+get.getEmail()+"' AND PASSWORD='"+get.getPassword()+"'";
                PreparedStatement prepared_statement = con.prepareStatement(sql);
                //prepared_statement.setString(1,get.getEmail());
                //prepared_statement.setString(2,get.getPassword());
                ResultSet result_set = prepared_statement.executeQuery(sql);
                //this wasn't working because execute query was being run on the original sql, signed Thomas'
                int count = 0;
                while(result_set.next()){
                    count = result_set.getInt(1);
                }
                con.close(); 
                return count;
            }   
      
      public ResultSet query(String sql)throws SQLException{
        con = getConnection();
        ResultSet retval = con.prepareStatement(sql).executeQuery();
        con.close();
        return retval;
      }
      
      /*
      * returns 0 if no rows affected or the number of affected rows
      */
      public int update(String sql)throws SQLException{
          con=getConnection();
          int retval = con.prepareStatement(sql).executeUpdate();
          con.close();
          return retval;
      }
    }

