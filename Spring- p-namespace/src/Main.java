import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
public static void main(String[] args) {
	//Resource rs=new ClassPathResource("spring.xml");
	/*
	 * ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
	 * Author a=(Author)ap.getBean("osho"); System.out.println(a);
	 */
	Resource rs=new ClassPathResource("spring.xml");
	BeanFactory bf=new XmlBeanFactory(rs);
	
	Author a=(Author)bf.getBean("osho");
	System.out.println(a);
}
}
