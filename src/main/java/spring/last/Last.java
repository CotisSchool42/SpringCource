// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.last;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Last {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
    }
}
