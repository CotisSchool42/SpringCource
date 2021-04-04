// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
package spring.zero;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RockMusic implements Music, Author {
    /* Factory-method */
    /* Scope singleton дает одну ссылку на этот обьект */
    private RockMusic(){};
    public static RockMusic getRockMusic() { return new RockMusic(); }

    /* Init и Destroy методы. Дополнительно */
    public void init() { System.out.println("Init-method is working..."); }
    public void destroy() { System.out.println("Destroy-method is working..."); }

    @Override
    public String getSong() { return "Rammstein"; }
    @Override
    public String getAuthor() { return "Till Lindeman"; }
    @Override
    public String getDate() { return "26.05.1999"; }
}
