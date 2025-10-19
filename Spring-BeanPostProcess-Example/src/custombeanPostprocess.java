import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class custombeanPostprocess implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		 System.out.println("Before Initializing Bean " + beanName + ", " + bean);
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		 System.out.println("Before Initializing Bean " + beanName + ", " + bean);
		return null;
	}

}
