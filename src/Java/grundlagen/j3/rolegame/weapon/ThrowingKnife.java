package Java.grundlagen.j3.rolegame.weapon;


public class ThrowingKnife extends RangedWeapon {
    public ThrowingKnife(String weaponName, int weight, double attackValue) {
        super(weaponName, weight, attackValue);
    }

    public static void main(String[] args) {
        ThrowingKnife test = new ThrowingKnife("Throwing Knife", 3, 10);
    }
}
