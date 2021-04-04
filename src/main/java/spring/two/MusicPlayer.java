// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.two;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Setter
public class MusicPlayer {
    Music music1;
    Music music2;
    // Внедряем из musicPlayer.properties через Value, значение в поле defVolume,
    @Value("${musicPlayer.defVolume}")
    private int volume;
    @Value("${musicPlayer.defName}")
    private String defName;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Rand rand)  {
        switch (rand) {
            case ClASSICAL:
                System.out.println("Playing: " + music2.getSong() + "\n" + "Name: " + volume + "\nVolume: " + defName) ;
                break;
            case ROCK:
                System.out.println("Playing: " + music1.getSong());
                break;
            default:
                System.out.println("NO MUSIC");
        }
    }
}
