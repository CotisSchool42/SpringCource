// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.two;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private final List<String> list = new ArrayList<>();

    @Override
    public String getSong() {
        list.add("Новый автомат");
        list.add("Эта сука шанель");
        list.add("Гуччи ЛУИ");
        int i = (int) (Math.random() * list.size());
        return list.get(i);
    }
}
