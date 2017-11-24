package chatTurbo;



import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author zizixin
 *
 */
@WebServlet(name = "servletChat", urlPatterns = {"/Chat/*"}, loadOnStartup = 1,
        initParams = {
                @WebInitParam(name = "msg", value="hello world")
        })
public class ChatServlet extends HttpServlet {
	
	
	Logger servletLogger = LoggerFactory.getLogger(ChatServlet.class);
	
	
	public SocketServerProcess socketServerProcess;
	
	public HashMap<String,User> sessionIDContainer;
	
    private String msg;

    public ChatServlet() throws IOException {
        servletLogger.info("chat servlet get ChatServlet Construct method by servlet 3.0");
        this.socketServerProcess = new SocketServerProcess(10086);
        socketServerProcess.init();
        System.out.print("construct method for debug");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        servletLogger.info("invoke chatServlet init method");
        System.out.print("init method for debug");
    }

    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	servletLogger.info("invoke chatServlet service method");
    	super.service(req, resp);
    	System.out.print("service method for debug");
    	String sessionId = req.getSession().getId();
    	if(sessionIDContainer.containsKey(sessionId)){
    		String message = (String) req.getAttribute("message");
    		System.out.println(req.getAttribute("message"));
    	}
    	
    	
    	
    }
    

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    	servletLogger.info("invoke chatServlet doget method");
    	System.out.print("doGet method for debug");
    	System.out.print(req.getProtocol());
    	//super.doGet(req, resp);
    	resp.getOutputStream().write(new byte[]{'1','2'});
    	
    	
    }
}