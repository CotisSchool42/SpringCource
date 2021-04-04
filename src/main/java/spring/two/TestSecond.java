// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.two;

import com.sun.xml.internal.ws.server.MonitorRootService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  TestSecond {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(Rand.ROCK);
        context.close();
    }
}
