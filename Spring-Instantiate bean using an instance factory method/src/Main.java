import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
public static void main(String[] args) {
	Resource rs=new ClassPathResource("spring.xml");
	BeanFactory bf=new XmlBeanFactory(rs);
	
	
	 Shape shape = (Shape) bf.getBean("id2");
	  
	  shape.draw();
}
}
