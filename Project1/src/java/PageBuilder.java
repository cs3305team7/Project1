/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileSystems;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
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
        return ContentMap;
    }
    /*
    *
    *@author Thomas Carr
    */
    private String getContent(String contentID){
        DBManager db=new DBManager();
        ResultSet rs=null;
        String query=String.format(CONTENTQUERY, "websitename",contentID);
         Reader reader;
        String Content="";
        char character[]=new char[20000];
        int numchars;
        try{
            rs=db.query(query);
            if(rs!=null){
               while(rs.next()){
                   reader= rs.getCharacterStream("header");
                   do{
                   numchars=reader.read(character, 0, 20000);
                       if(character.length>0){
                           Content+= new String(character);
                           character=new char[20000];
                       }
                   }while(numchars!=-1);
                }
            }
        }
        catch(SQLException | IOException e){
            //set Content = to error message
        }
        return Content;
    }
    
    private String getHeader(){
        DBManager db=new DBManager();
        ResultSet rs=null;
        Reader reader;
        String Header="";
        char character[]=new char[20000];
        int numchars;
        try{
            rs=db.query(HEADERQUERY);
            if(rs!=null){
               while(rs.next()){
                   reader= rs.getCharacterStream("header");
                   do{
                   numchars=reader.read(character, 0, 20000);
                       if(character.length>0){
                           Header+= new String(character);
                           character=new char[20000];
                       }
                   }while(numchars!=-1);
                }
            }
        }
        catch(SQLException | IOException e){
            //set Header = to error message
        }
        return Header;
    }
    
    private String getFooter(){
        DBManager db=new DBManager();
        ResultSet rs=null;
        Reader reader;
        String Footer="";
        char character[]=new char[20000];
        int numchars;
        try{
            rs=db.query(FOOTERQUERY);
            if(rs!=null){
               while(rs.next()){
                   reader= rs.getCharacterStream("footer");
                   do{
                   numchars=reader.read(character, 0, 20000);
                       if(character.length>0){
                           Footer+= new String(character);
                           character=new char[20000];
                       }
                   }while(numchars!=-1);
                }
            }
        }
        catch(SQLException | IOException e){
            //set Footer = to error message
        }
        return Footer;
    }
   

    private List<String> getSections(Page.Template template) {
        return Page.Template.getTemplateHeaders(template);
    }
}
