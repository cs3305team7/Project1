/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author as11
 */
public class User {
    private String fname;
    private String lname;
    private String email;
    private String password;
    private String uname;
    private int id;
    private String charity;


    public User(){
        super();
    }
    public User(String uname,String fname,String lname,
            String email,String password,String Charity){
        this.uname=uname;
        this.fname=fname;
        this.email=email;
        this.lname=lname;
        this.password=password;
        this.charity=Charity;
    }
    public String getUname(){
        return uname;
    }
    public String getCharityName(){
        return charity;
    }
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
