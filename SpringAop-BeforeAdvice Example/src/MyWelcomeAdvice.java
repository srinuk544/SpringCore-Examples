import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyWelcomeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] arg, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("i am before advicee:" + m.getName());

	}

}
