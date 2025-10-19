import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		ClassPathResource cl = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(cl);

		University u = (University) bf.getBean("id");
		u.show();
	}

}
