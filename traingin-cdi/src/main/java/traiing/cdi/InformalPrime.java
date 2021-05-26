
package traiing.cdi;

import javax.enterprise.context.Dependent;

@Informal
@Dependent
public class InformalPrime extends Prime {
    
    @Override
    public String isPrime(int num) {
    	
         return num + " IS PRIME !";  
    }
}
