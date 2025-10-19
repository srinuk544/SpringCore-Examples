import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rs=new ClassPathResource("sp.xml");
		BeanFactory bf=new XmlBeanFactory(rs);
		
		Employee e=(Employee)bf.getBean("id1");
	e.show();

	}

}
