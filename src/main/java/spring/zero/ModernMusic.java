// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.zero;

import org.springframework.stereotype.Component;

@Component
public class ModernMusic implements Music{
    @Override
    public String getSong() { return "Minimal"; }
    @Override public String getAuthor() { return "Eljei"; }
}
