import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource rs = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(rs);

		MyInterFace my = (MyInterFace) bf.getBean("id3");
		my.m1();
		my.m2();
	}

}
