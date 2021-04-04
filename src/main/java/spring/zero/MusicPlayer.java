// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.zero;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class MusicPlayer {
    private Music music;
    private Author author;
    private String defName;
    private int defVolume;
    private List<Music> list = new ArrayList<>();

    /*  Конструктор принимающий (внедрение) из Application.properties с помощью тега constr..arg зависимости */
    public MusicPlayer(Music music) { this.music = music; }
    /*  Пустой конструктор нужен для 6 пункта, чтобы внедрить лист Bean*/
    public MusicPlayer(){};
    /*  Setter (внедрение) из Application.properties, так как мы используем lombok, эту строчку сможно заккоментировать*/
    //   public void setMusic(Author author) { this.author = author; }


    public MusicPlayer(List<Music> list) { this.list = list; }

    public void playMusic() { System.out.println("Playing: " + music.getSong()); }
    public void whatAuthor() { System.out.println("Author: " + music.getAuthor()); }
    public void dateOfBirth() { System.out.println("Date of birth : " + author.getDate()); }
    public void getDefName() { System.out.println("Default name: " + defName); }
    public void getDefVolume() { System.out.println("Default name: " + defVolume); }
}