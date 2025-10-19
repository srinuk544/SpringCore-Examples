import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		   System.out.println("Am before proceed() method");        
	        Object ob = mi.proceed();
	        System.out.println("Am after proceed() method");
	        return ob;
	}

}
