// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package Exam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class First {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextExam.xml" );
        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);
        user.print();
        user1.print();
        user.print();
        context.close();
    }
}
