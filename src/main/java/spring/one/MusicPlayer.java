// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.one;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Аннотация для DI
@Setter
@Component
public class MusicPlayer {
    Music music;
//(1) private ClassicalMusic classicalMusic;
 //   public MusicPlayer(ClassicalMusic classicalMusic,  RockMusic rockMusic) { this.classicalMusic = classicalMusic; this.rockMusic=rockMusic;}
//(1) public MusicPlayer (ClassicalMusic classicalMusic) { this.classicalMusic = classicalMusic; }


 //   public void setClassicalMusic(ClassicalMusic classicalMusic) {
  //      this.classicalMusic = classicalMusic;
  //  }

 /* Autowired внедряет две зависимости через сеттер, создает два обьекта */
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    @Autowired
    public void setRockMusic(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }
    @Autowired
    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public String getSong(){
        return "Playing: " + rockMusic.getSong() + "\n" + "Playing: " + classicalMusic.getSong();
    }
//(1)    public void getSong(){ System.out.println("Playing: " + classicalMusic.getSong()); }
}
