
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package formation.interceptor.ejb;

import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author ian
 */
public class HelloInterceptor {
    protected String greeting;
    private static final Logger logger = Logger.getLogger("interceptor.ejb.HelloInterceptor");

    public HelloInterceptor() {
    }

    @AroundInvoke
    public Object modifyGreeting(InvocationContext ctx) throws Exception {
        Object[] parameters = ctx.getParameters();
        String param = (String) parameters[0];
        param = param.toLowerCase();
        parameters[0] = param;
        ctx.setParameters(parameters);
        try {
            return ctx.proceed();
        } catch (Exception e) {
            logger.warning("Error calling ctx.proceed in modifyGreeting()");
            return null;
        }
    }

}
