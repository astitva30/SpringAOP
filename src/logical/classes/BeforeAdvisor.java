/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical.classes;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
import static java.lang.System.out;
import java.lang.reflect.Modifier;


/**
 *
 * @author deshp
 */
public class BeforeAdvisor implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] os, Object target) throws Throwable {
        out.println("Method will be called soon.............");
        out.println("method info:"+method.getName()+" "+Modifier.toString(method.getModifiers()));
        out.println("target Object:"+target);  
        out.println("target object class name: "+target.getClass().getSimpleName());
    }
    
}
