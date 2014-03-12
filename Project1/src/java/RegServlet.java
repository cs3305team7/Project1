/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author as11
 */
@WebServlet(name = "RegServlet", urlPatterns = {"/RegServlet"})
public class RegServlet extends HttpServlet {
    private String PATH ="C:/Users/Thomas/Documents/NetBeansProjects/Project1/Project1/build/web/";
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {   
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        HttpSession session = request.getSession(true);
        DBManager manager = new DBManager();
        String hidden_parameter = request.getParameter("pagename");
        if (hidden_parameter.equals("register")) {
        String fname=request.getParameter("txtFName");
        String lname=request.getParameter("txtLName");
        String email=request.getParameter("txtEmail");
        String password=request.getParameter("txtPassword");
       String charityName=request.getParameter("txtCharityName");
       String UserName=request.getParameter("txtUName");
        if(UserName!=null && fname!=null && lname!=null && email!=null &&
                password!=null && charityName!=null){
            //checkChartityName is Free
            //check email is free
            // check usename is free
            boolean allClear=false;
            DBManager dbman = new DBManager();
            try{
                dbman.query("");
            }catch(Exception e){
                session.setAttribute("Error",
                        XMLParser.ErrorRetriever.Error.DATABASE_CONNECTION);
                response.sendRedirect("register.jsp");
            }
            //ASSUME PREV IS TRUE
           if(allClear){   
                    File f= new File(PATH+charityName); 
                    session.setAttribute("FNAME", fname);
                    try{

                        if( f.mkdir()){
                            session.setAttribute("FNAME", fname);
                            File[] files=f.listFiles();
                           File theme1= new File("");
                          
                            Files.copy(theme1.toPath(),f.toPath());
                        }
                        else{
                            session.setAttribute("Error",
                            XMLParser.ErrorRetriever.Error.WEBDIR_NOT_MADE);
                            response.sendRedirect("register.jsp");
                        }
                    }catch(Exception e){
                        response.sendRedirect("register.jsp");
                    }

                User sets =  new User();

                sets.setFname(fname);
                sets.setLname(lname);
                sets.setEmail(email);
                sets.setPassword(password);
                try {
                    //manager.Insert(sets);
                    response.sendRedirect("welcome.jsp");
                }/* catch (SQLException ex) {
                   // Logger.getLogger(RegServlet.class.getName()).
                log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }*/catch(Exception ex){ex.printStackTrace();}
                    } //end of register if statement
                }
            }
            else if (hidden_parameter.equals("login")) {
                String email = request.getParameter("txtEmail");
                String password = request.getParameter("txtPassword");
                if ((email.equals("admin")) && (password.equals("admin"))){
                    response.sendRedirect("admin.jsp");
                }else{
                    User sets = new User();
                    sets.setEmail(email);
                    sets.setPassword(password);


                       try {
                            int checkUser = manager.checkUser(sets);
                            if(checkUser == 1){
                                response.sendRedirect("themes/theme1/index.jsp");
                            } else{
                                response.sendRedirect("login.jsp");
                            }
                     } catch (SQLException ex) {
                            // Logger.getLogger(RegServlet.class.getName())
                         //.log(Level.SEVERE, null, ex);
                           ex.printStackTrace();
                    }
                }
      
        } //end of log in if statement
    }//end of doPost
    
} //end of main Class
