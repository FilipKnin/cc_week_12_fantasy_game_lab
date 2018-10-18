package tools;

public class HealingTool extends Tools {

    private int damageRestored;

    public HealingTool(String name, int damageRestored) {
        super(name);
        this.damageRestored = damageRestored;
    }

    public int getDamageRestored() {
        return this.damageRestored;
    }

}
