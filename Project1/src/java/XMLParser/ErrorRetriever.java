
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package XMLParser;
//import org.w3c.dom;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


/**
 *
 * @author Thomas
 */
public class ErrorRetriever extends DOMParser{
    private DOMParser DOM;
    public final static String ERRORS_FILE="";
    public static enum Error{
        TEST,WEBDIR_NOT_MADE,DATABASE_CONNECTION;
        
        @Override
        public String toString(){
        
            switch(this){
            case TEST:
                return "TEST";
            case WEBDIR_NOT_MADE:
                return "DIR_NOT_MADE";
            case DATABASE_CONNECTION:
                    return "DATABASE_CONNECTION";
            default:
                 return "";
            }
        }
    }
    
    
    public ErrorRetriever() throws Exception{
       super(ERRORS_FILE);
        
    }
    public String getErrString(Error err){
        String errRequired=err.toString();
       
         NodeList nodes= getErrorTags();
         Element e;
         for(int i=0;i<nodes.getLength();i++){
             e=(Element)nodes.item(i);
             if(e!=null){
                 if(!e.getAttribute("name").equals(errRequired)){
                     //e.getElementsByTagName("value");
                     //add a value tag rather than an attribute
                     return e.getAttribute("value");
                 }
             }
         }
        //FOREACH(RET){RET.GETATTRIBUTE("NAME").GETVALUE()==errRequired?ret.getattval()}
        return null;
    }
    
    public NodeList getErrorTags(){
        NodeList p = doc.getElementsByTagName("error");
        
        for(int i=0;i<p.getLength();i++){
          NodeList p2 =  p.item(i).getChildNodes();
            for(int j=0;j<p2.getLength();j++){
                    if(p2.item(j).getNodeName().equals("name")){
                        
                    }
            }
        }
        return doc.getElementsByTagName("error");
        //return ;
    }
    
    public String getError(String ErrorName){
        NodeList p = doc.getElementsByTagName("error");
        boolean doneLoop1=false;
        NodeList p2=null;
        String retval=null;
        for(int i=0;i<p.getLength() && !doneLoop1;i++){
          p2 =  p.item(i).getChildNodes();
            for(int j=0;j<p2.getLength();j++){
                    if(p2.item(j).getNodeName().equals("name")){
                        if(p2.item(j).getNodeValue().equals(ErrorName)){
                            doneLoop1=true;
                        }
                    }
            }
        }
        if(p2!=null){
            for(int i=0;i<p2.getLength();i++){
                if(p2.item(i).getNodeName().equals("value")){
                    retval= p2.item(i).getNodeValue();
                    break;
                }
            }
        }
        return retval;
    }
    
}
