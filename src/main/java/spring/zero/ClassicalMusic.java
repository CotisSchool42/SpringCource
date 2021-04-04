// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.zero;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassicalMusic implements Music, Author{
    @Override
    public String getSong() { return "I Love U"; }
    @Override
    public String getAuthor() { return "Liza"; }
    @Override
    public String getDate() { return "26.05.1999"; }
}
