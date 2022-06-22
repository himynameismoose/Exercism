abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        int damage = 6;

        if (wizard.isVulnerable())
            damage = 10;

        return damage;
    }
}

class Wizard extends Fighter {

    int damage = 3;
    boolean isVulnerable = true;

    @Override
    boolean isVulnerable() {
        return isVulnerable;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return damage;
    }

    void prepareSpell() {
        damage = 12;
        isVulnerable = false;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
