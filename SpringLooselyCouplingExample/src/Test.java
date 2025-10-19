import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource rs = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(rs);

		Resource rs1 = new ClassPathResource("spring2.xml");
		BeanFactory bf1 = new XmlBeanFactory(rs1);

		Journey j = (Journey) bf1.getBean("id2");
		j.Startjourney();

	}
}
