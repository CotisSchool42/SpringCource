// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package Exam;

import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music{
    private List<String> list = new ArrayList<>();

    @Override
    public List<String> getSong() {
        list.add("Broken Smile");
        list.add("Cry Alone");
        list.add("When I Lie");
        return list;
    }
}
