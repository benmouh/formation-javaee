
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package formation.interceptor.ejb;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.interceptor.Interceptors;

/**
 *
 * @author ian
 */
@Stateless
@Named
public class HelloBean {

    protected String name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    @Interceptors(HelloInterceptor.class)
    public void setName(String name) {
        this.name = name;
    }

}
