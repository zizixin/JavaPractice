package zizixin.JavaPractice.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {
	 
    public HelloServiceImpl() throws RemoteException {
    }
 
    @Override
    public String sayHi(String name) throws RemoteException {
        return String.format("Hello %s", name);
    }
}
