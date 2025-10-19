import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource rs = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(rs);

		Author a = bf.getBean("id1", Author.class);
		System.out.println("author1 = " + a);
		Author ab = bf.getBean("id1", Author.class);
		System.out.println("author1 = " + ab);
		
		System.out.println(a==ab);
	}

}
