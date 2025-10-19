import java.lang.reflect.Method;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class MyWelcomeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object args[], Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("im before advicee :" + m.getName());

	}

}
