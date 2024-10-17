import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(100);
        boss.setProtection("Armour");
        System.out.println("Boss Info");
        System.out.println("Health: " + boss.getHealth() +
                " Damage: "+ boss.getDamage() + " Protection: " + boss.getProtection());



        Hero[] heroes = createHeroes();
        System.out.println("Heroes Info");
        for (Hero hero : createHeroes()) {
            System.out.println("Health: " + hero.getHealth() + " Damage:" + hero.getDamage() +
                    " SuperPower: " + hero.getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 30);
        Hero hero2 = new Hero(100,50, "fly" );
        Hero hero3 = new Hero(200, 70);

        return new Hero[]{hero1, hero2, hero3};
    }
}