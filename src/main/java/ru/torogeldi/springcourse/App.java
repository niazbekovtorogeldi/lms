package ru.torogeldi.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
    //   Js js= classPathXmlApplicationContext.getBean("js",Js.class);
      //  System.out.println(js);
//        Java java=classPathXmlApplicationContext.getBean("java",Java.class);
//        System.out.println(java);
        Course course =classPathXmlApplicationContext.getBean("course3",Course.class);
        System.out.println(course);
        course.getPrograming().getAllCourse();
        classPathXmlApplicationContext.close();

    }
}
