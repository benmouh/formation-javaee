
package traiing.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Printer {

    @Inject
    @Informal // si on comment informal on aura la bonne correction 
    Prime prime;
    
    private int num;
    private String result;
    
    public String checkPrime() {
    	
    	return this.result = prime.isPrime(num);
    }
    
    public String getResult() {
        return result;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
