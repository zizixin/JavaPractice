package zizixin.JavaPractice.chatTurbo;



import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


/**
 * @author zizixin
 *
 */
@WebServlet(name = "servlet1", urlPatterns = {"/s1/*"}, loadOnStartup = 1,
        initParams = {
                @WebInitParam(name = "msg", value="hello world")
        })
public class Servlet1 extends HttpServlet {
    private String msg;

    public Servlet1() {
        System.out.println("servlet1 init on load on startup");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        ServletConfig config = this.getServletConfig();//any servlet have a reference of ServletConfig ,this is see what is the actual instance it is
        ServletContext servletContext = config.getServletContext();
        String msg = config.getInitParameter("msg");
        System.out.println(config.getServletName());
        Enumeration<String> initParams = config.getInitParameterNames();
        while(initParams.hasMoreElements()){
        	System.out.println(initParams.nextElement());
        }
        this.msg = this.getInitParameter("msg");
        System.out.println(msg);
    }

    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	    	
    	//this.log user father class log
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