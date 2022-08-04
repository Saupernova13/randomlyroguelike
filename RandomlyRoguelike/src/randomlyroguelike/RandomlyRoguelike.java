//LoveURoo
//Sauraav Jayrajh
package randomlyroguelike;

//import java.util.concurrent.TimeUnit;
public class RandomlyRoguelike {

    public static GameWindow boot = new GameWindow();
    public static characterObject Player = new characterObject();
    public static characterObject Enemy_1 = new characterObject();

    public static void passHitLandedToForm() {
        Enemy_1.setCharHealth(gameFunctionality.hitLanded(Player.getCharComponent(), Enemy_1.getCharComponent(), Player.getCharName(), Enemy_1.getCharName(), Player.getCharHealth(), Enemy_1.getCharHealth()));

        System.out.println(Player.getCharName() + " has " + Player.getCharHealth() + " health left!");
        System.out.println(Enemy_1.getCharName() + " has " + Enemy_1.getCharHealth() + " health left!");
        gameFunctionality.flashCharacter(Enemy_1.getCharComponent());
    }

    public static void main(String[] args) {
        boot.show();
        Player.setCharName("Johnathan");
        Player.setCharHealth(gameFunctionality.genRandom());
        Player.setCharComponent(GameWindow.spritePanel_Player_0);

        Enemy_1.setCharName("Dio");
        Enemy_1.setCharHealth(gameFunctionality.genRandom());
        Enemy_1.setCharComponent(GameWindow.spritePanel_Enemy_0);
        System.out.println(Player.getCharName() + " has " + Player.getCharHealth() + " health!");
        System.out.println(Enemy_1.getCharName() + " has " + Enemy_1.getCharHealth() + " health!");
        gameFunctionality.flashCharacter(Enemy_1.getCharComponent());
//       gameFunctionality.hitLanded(Player.getCharComponent(), Enemy_1.getCharComponent(), Player.getCharName(), Enemy_1.getCharName() );
//       System.exit(0);
    }

}
