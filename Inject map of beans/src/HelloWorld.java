import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
 public static void main(String args[]) {
  ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });

  Countries countries = context.getBean("countryCodes", Countries.class);

  Set<Integer> countryCodes = countries.getCountriesMap().keySet();

  for (Integer countryCode : countryCodes) {
   System.out.println(countryCode + " : " + countries.getCountriesMap().get(countryCode));
  }

  ((ClassPathXmlApplicationContext) context).close();
 }
}