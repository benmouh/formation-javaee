
package formation.basic;

import javax.enterprise.context.Dependent;

@Dependent
public class Greeting {
    public String greet(String name) {
        return "Hello, " + name + ".";
    }
}
