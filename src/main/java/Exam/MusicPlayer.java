// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package Exam;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> list;
    Random r = new Random();

    // IO сущность не сама создает свои зависимости, а когда этой сущности поставляются зависимости из вне
    // DI внедрение зависимостей с помощью spring framefork
    public void setList(List<Music> list) {
        this.list = list;
    }
    public void getMusic() {
        System.out.println(
                "Playing class: " + list.get(r.nextInt(3)).getClass().getName() +
                        "\nPlaying music: " + list.get(r.nextInt(3)).getSong().get(r.nextInt(3)));
    }
}
