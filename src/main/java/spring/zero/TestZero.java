// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.zero;

import com.sun.xml.internal.ws.server.MonitorRootService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestZero {
    public static void main(String[] args) {
/*(1) (Без spring)
        MusicPlayer musicPlayer = new MusicPlayer(new ClassicalMusic());  // Без spring
        musicPlayer.playMusic(); */

        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext(
                "applicationContext.xml");

/*(2) (Без Dependency Injection)
        Music music = context.getBean("musicBean", Music.class);
               //new ClassicalMusic();                   // Вместо context... Можно так, но это неправильно
        MusicPlayer musicPlayer = new MusicPlayer(music); */

/*(3) (С DI внедряем в MusicPlayer музыку черех конструктор, а также простые значения)
      MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.whatAuthor();
        musicPlayer.getDefName();
        musicPlayer.getDefVolume();  */

/*(4) (С DI внедряем в MusicPlayer музыку черех setter)
        MusicPlayer musicPlayer = context.getBean("datePlayer", Mu  sicPlayer.class);
        musicPlayer.dateOfBirth(); */

/*(5) (Внедряем одновременно конструктор под интерфейс Music, сеттер под интерфейс Author, также простые значения)
       MusicPlayer musicPlayer = context.getBean("allInAll", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.whatAuthor();
        musicPlayer.getDefName();
        musicPlayer.getDefVolume();
        musicPlayer.dateOfBirth(); */

/*( 6) (Внедряем одновременно несколько классов в лист и воспроизводим в них песенку) */
        MusicPlayer musicPlayer = context.getBean("list", MusicPlayer.class);
        int i = 0;
        for(Music music: musicPlayer.getList()) { System.out.println(i++ + " " + music.getSong()); }
        context.close();
    }
}
