public class Hero {

    private int healthHero;
    private int damageHero;

    private String superpowerHero;

    public int getHealthHero() {
        return healthHero;
    }

    public int getDamageHero() {
        return damageHero;
    }

    public String getSuperpowerHero() {
        return superpowerHero;
    }

    public Hero(int healthHero, int damageHero, String superpowerHero) {
        this.healthHero = healthHero;
        this.damageHero = damageHero;
        this.superpowerHero = superpowerHero;
    }

    public Hero(int healthHero, int damageHero) {
        this.healthHero = healthHero;
        this.damageHero = damageHero;
    }



}



