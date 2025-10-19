import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("spring.xml");

		BeanFactory bb = new XmlBeanFactory(res);

		Organization c = (Organization) bb.getBean("id");
		c.Display();
	}
}
