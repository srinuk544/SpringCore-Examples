import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });

	  System.out.println("Getting the bean of type A");
	  
	  A lazybean = context.getBean("lazyBean", A.class);

	  ((ClassPathXmlApplicationContext) context).close();
	 }
	}