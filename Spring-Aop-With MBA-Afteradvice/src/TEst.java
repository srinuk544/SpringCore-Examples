import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TEst {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(res);

		MyInterFace mm = (MyInterFace) bf.getBean("id3");
		mm.m1();
		mm.m2();
	}

}
