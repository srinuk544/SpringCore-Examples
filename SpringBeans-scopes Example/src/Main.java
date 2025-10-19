import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		Resource rs = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(rs);

		Student st = (Student) bf.getBean("idd");
		st.setMessage("helo good after noon");
		st.getMessage();
		System.out.println("student:" + st);

		Student st1 = (Student) bf.getBean("idd");
		st.setMessage("helo ");
		st.getMessage();
		System.out.println("student:" + st1);

		System.out.println(st == st1);
	}

}
