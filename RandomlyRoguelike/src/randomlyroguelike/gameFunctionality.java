package randomlyroguelike;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JPanel;
import static randomlyroguelike.RandomlyRoguelike.boot;

public class gameFunctionality {

    public static int genRandom() {
        Random rand = new Random();
        int val = 0;
        val = rand.nextInt(255);
        return (val);
    }

    public static void makeDelay(int val) {
        try {
            Thread.sleep(val);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }

    public static void flashCharacter(JPanel intakeComponent) {

        for (int i = 0; i < gameFunctionality.genRandom(); i++) {
            Color cl = new Color(gameFunctionality.genRandom(), gameFunctionality.genRandom(), gameFunctionality.genRandom(), gameFunctionality.genRandom());
            makeDelay(10);
            intakeComponent.setBackground(cl);
            intakeComponent.setForeground(cl);
        }

    }

    public static int hitLanded(JPanel Effector, JPanel Affected, String EffectorName, String AffectedName, int EffectorHealth, int AffectedHealth) {
        String displayString = EffectorName + " hit " + AffectedName + "!";
        JOptionPane.showMessageDialog(null, displayString);
        AffectedHealth = AffectedHealth - 10;
        flashCharacter(Affected);
        return (AffectedHealth);
    }
}
