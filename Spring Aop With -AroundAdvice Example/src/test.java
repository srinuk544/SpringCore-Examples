import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {
public static void main(String[] args) {
	 Resource rs=new ClassPathResource("spring.xml");
	 BeanFactory bf=new XmlBeanFactory(rs);
	 
	 MyInterFace mm=(MyInterFace)bf.getBean("id3");
	 mm.m1();
}
}
