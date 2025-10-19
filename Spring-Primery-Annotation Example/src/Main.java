import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {

	ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");

		//Student author1 = context.getBean(Student.class);
		//Student author2 = context.getBean(Student.class);
		Student author3 = ap.getBean(Student.class);

		//System.out.println(author1);
		//System.out.println(author2);
		author3.show();

		
	}
}