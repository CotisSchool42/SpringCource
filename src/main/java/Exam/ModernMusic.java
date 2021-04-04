// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package Exam;

import java.util.ArrayList;
import java.util.List;

public class ModernMusic implements Music{
    private List<String> list = new ArrayList<>();

    @Override
    public List<String> getSong() {
        list.add("ZEF");
        list.add("Розовое Вино");
        list.add("Ecstasy");
        return list;
    }
}
