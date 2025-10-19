import org.apache.log4j.chainsaw.Main;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource rs=new ClassPathResource("spring.xml");
		BeanFactory bf=new XmlBeanFactory(rs);
		
		
		Author osho = bf.getBean("id1", Author.class);

		  System.out.println(osho);

}}
