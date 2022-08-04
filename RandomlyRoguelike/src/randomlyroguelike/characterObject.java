package randomlyroguelike;
import javax.swing.JPanel;
import java.util.ArrayList;

public class characterObject {

    private String charName;
    private int charHealth;
    private JPanel charComponent;
    public static ArrayList<String> charMoveList = new ArrayList<>();

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getCharHealth() {
        return charHealth;
    }

    public void setCharHealth(int charHealth) {
        this.charHealth = charHealth;
    }

    public JPanel getCharComponent() {
        return charComponent;
    }

    public void setCharComponent(JPanel charComponent) {
        this.charComponent = charComponent;
    }

}
