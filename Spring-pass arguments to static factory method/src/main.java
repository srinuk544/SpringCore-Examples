import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class main {
	public static void main(String args[]) {
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });

		  Shape square = context.getBean("squareBean", Shape.class);
		  Shape rectangle = context.getBean("rectangleBean", Shape.class);
		  Shape circle = context.getBean("circleBean", Shape.class);

		  square.draw();
		  rectangle.draw();
		  circle.draw();

		  ((ClassPathXmlApplicationContext) context).close();
		 }
		}