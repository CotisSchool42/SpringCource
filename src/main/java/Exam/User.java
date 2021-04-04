// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package Exam;

public class User {
    MusicPlayer musicPlayer;
    private static int id;

    public User(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void Init() {
        System.out.println("Init...");
    }
    public void Destroy() {
        System.out.println("Destroy...");
    }

    public void print () {
        System.out.println("Id = " + id);
        id++;
        musicPlayer.getMusic();
    }
}
