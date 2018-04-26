package SpringCore;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

      
         ApplicationContext context = new ClassPathXmlApplicationContext(
 				"springmodule.xml");
         
           Employee emp = (Employee)context.getBean("e");

        System.out.println( "Hello World!" +emp.getname());
    }
}
