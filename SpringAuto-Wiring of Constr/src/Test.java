
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathResource cr = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(cr);

		Object o = bf.getBean("id1");
		College c = (College) o;
		c.show();
	}

}
