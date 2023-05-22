/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package springaop;

import static java.lang.System.out;
import logical.classes.LogicalClass;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author deshp
 */


public class SpringAOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ApplicationContext factory = new ClassPathXmlApplicationContext("/SpringXMLConfig.xml");
      
    LogicalClass a=factory.getBean("proxy",LogicalClass.class);  
    a.setBreadth(12);
    a.setLength(10);
//    out.println(a.toString());
    out.println(a.getArea());
    
    }
    
}
