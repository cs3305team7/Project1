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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class PageBuilder {
    protected ArrayList<String> content;
    private final String CONTENTQUERY,HEADERQUERY,FOOTERQUERY;
    private final Page.Template PAGE_TEMP;
    private HashMap<String,String> ContentMap;

    public PageBuilder(Page.Template pageTemplate){
        content=new ArrayList<>();
        CONTENTQUERY="select content from content where website =%1$ and "
                + "sectionID=%2$";//sql query using website and page to get footer
        HEADERQUERY="";//sql query using website and page to get header
        FOOTERQUERY="";
        PAGE_TEMP=pageTemplate;
        ContentMap=new HashMap<String,String>();
    }

    /**
     * create a map of all sections and the content they are linked to
     * @return returns a map of sections and their content for insertion into 
     * html 
     */
    public HashMap<String,String> build(){
        ContentMap.put("HEADER", getHeader());
        //add code to put each section id + it's content
        //into the map
        List<String> sections = getSections(PAGE_TEMP);
        for (String sect : sections) {
            ContentMap.put(sect,getContent(sect));
        }
        //get editable sectiosn strings from page class/from template
        ContentMap.put("FOOTER",getFooter());
        return null;
    }
    /*
    *
    *@author Thomas Carr
    */
    private String getContent(String contentID){
        DBManager db=new DBManager();
        ResultSet rs=null;
        String query=String.format(CONTENTQUERY, "websitename",contentID);
        try{
           rs= db.query(query);
        }catch(Exception e){
            e.printStackTrace();
            //error message page content not found
        }
        if(rs!=null){
            //process result adding content to content arraylist
        }
        return "";
    }
    
    private String getHeader(){
        DBManager db=new DBManager();
        ResultSet rs=null;
        try{
            rs=db.query(HEADERQUERY);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    private String getFooter(){
        DBManager db=new DBManager();
        ResultSet rs=null;
        try{
            rs=db.query(FOOTERQUERY);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
   

    private List<String> getSections(Page.Template template) {
        return Page.Template.getTemplateHeaders(template);
    }
}
