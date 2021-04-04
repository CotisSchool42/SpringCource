// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.two;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music{
    private final List<String> list = new ArrayList<>();
    Random r = new Random();

    @PostConstruct
    public void doMyInit() {
        System.out.println("Init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy");
    }

    @Override
    public String getSong() {
        list.add("Бах");
        list.add("Трах");
        list.add("Бетховен");
        int i = (int) (Math.random() * list.size());
        return list.get(i);
    }
}