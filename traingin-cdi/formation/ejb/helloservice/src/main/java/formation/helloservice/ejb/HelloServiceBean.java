
package formation.helloservice.ejb;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * HelloServiceBean is a web service endpoint implemented as a stateless
 * session bean.
 */

@Stateless
@WebService
public class HelloServiceBean {
    private final String message = "Hello, EJB WS";
    
    public void HelloServiceBean() {}
    
    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }
}
