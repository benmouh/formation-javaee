
package traiing.cdi;

import javax.enterprise.context.Dependent;

@Dependent
public class Prime {
    
	public String isPrime(int num) {
    	
		String res = "";
		 int i,m=0,flag=0;      
		  m=num/2;      
		  if(num==0||num==1){  
		   res = num + " IS NOT PRIME !";      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(num%i==0){      
		     res = num + " IS NOT PRIME !";    
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { res = num + "IS PIRME !"; }  
		  }
		  return res;
    }
    
}
