/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.nio.file.FileSystems;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Thomas
 */
public class PageBuilder {
    protected ArrayList<String> content;
    private final String CONTENTQUERY;
    private final String PAGE_TEMP_LOC;


    public PageBuilder(String pageTemplateLocation){
        content=new ArrayList<>();
        CONTENTQUERY="";//sql query using website and page
        setUpContentList();
        PAGE_TEMP_LOC=pageTemplateLocation;
    }

    
    public String build(){
        return null;
    }
    /*
    *finds content strings for this page and inserts them
    *in order into the content ArrayList
    *@author Thomas Carr
    */
    private void setUpContentList(){
        DBManager db=new DBManager();
        ResultSet rs=null;
        try{
           rs= db.query(CONTENTQUERY);
        }catch(Exception e){
            e.printStackTrace();
            //error message page content not found
        }
        if(rs!=null){
            //process result adding content to content arraylist
        }
    }

    private void getTemplateContent(){
        Path path = FileSystems.getDefault().getPath("logs", "access.log");
        //Files.readAllLines(path,//NEED TO ADD A CHARSET OBJECT);
    }
}