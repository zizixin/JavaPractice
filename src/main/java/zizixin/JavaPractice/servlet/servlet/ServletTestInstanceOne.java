package zizixin.JavaPractice.servlet.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "servlet1", urlPatterns = {"/s1/*"}, loadOnStartup = 1)
public class ServletTestInstanceOne extends HttpServlet {
    private String msg;

    public ServletTestInstanceOne() {
        System.out.println("servlet1 init on load on startup");
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	if(req.getCookies()!=null){
    		for(Cookie cookie:req.getCookies()){
        		
        		this.logInfo(cookie.getName());
        		this.logInfo(cookie.getValue());
        	};
    	}
    	req.getSession();
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	super.service(req, resp);
    	
    	
    }
    
    public void logInfo(Object obj){
    	System.out.println(obj.toString());
    }
    
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    	System.out.println("do Get method is invoke");
    }
}
