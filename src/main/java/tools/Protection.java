package tools;

public class Protection extends Tools {

    private int damageReduction;

    public Protection(String name, int damageReduction) {
        super(name);
        this.damageReduction = damageReduction;
    }

    public int getDamageReduction() {
        return this.damageReduction;
    }

}
