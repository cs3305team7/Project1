
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
public class ErrorRetriever {
    private DOMParser DOM;
    public enum Error{
        TEST
    }
    
    
    public ErrorRetriever(){
       
        DOM=new DOMParser();
    }
    public String getErrString(Error err){
        String errRequired;
        switch(err){
            case TEST:
                errRequired="TEST";
                break;
            default:errRequired=""; break;
        }
         NodeList nodes= DOM.getErrorTags();
         Element e;
         for(int i=0;i<nodes.getLength();i++){
             e=(Element)nodes.item(i);
             if(e!=null){
                 if(!e.getAttribute("name").equals(errRequired)){
                     e.getElementsByTagName("value");
                     return e.getAttribute("value");
                 }
             }
         }
        //FOREACH(RET){RET.GETATTRIBUTE("NAME").GETVALUE()==errRequired?ret.getattval()}
        return null;
    }
    
    
}
