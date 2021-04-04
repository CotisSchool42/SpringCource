// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.one;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAP12Binding;
import com.sun.xml.internal.ws.client.MonitorRootClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class   TestFirst {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext1.xml");

/*(1)   (Без Dependency Injection c анотацией Component (других аннотаций мы тут не используем))
        Music music =  context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.getSong(); */

/*(2)   (Dependency Injection c анотацией Autowired. Spring сканирует все классы с component и создает бины этих классов)
        Spring сканирует бины и проверяет подходит ли хоть один под Autowired. Если подходит, внедряет как зависимость
        Подбирает подходящие бины по их типу (класс или интерфейс). Можно использовать на полях, сеттерах, конструкторах
        Autowired внедряет зависимость даже в приватное поле без конструктора или сеттера. Чтобы внедрять используем
        рефлексию (Reflection API)
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.getSong();*/
/*(3)   (Создаются бины двух классов component и внедряются в MusicPlayer)
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.getSong();
        context.close(); */

/*(4)   Создаются бины двух классов component и внедряются в MusicPlayer, далее создается bean component Computer и
        в него передается созданная зависимость MusicPlayer, далее мы выводим получившееся используя toString в Computer*/
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println( computer);
        context.close();
    }
}
