package pl.com.clockworkgnome.memento.domain;

import java.util.List;

public class PlayerMemento {

    private final int hp;
    private final Weapon activeWeapon;
    private final List<Weapon> weapons;

    public PlayerMemento(int hp, Weapon activeWeapon, List<Weapon> weapons) {
        this.hp = hp;
        this.activeWeapon = activeWeapon;
        this.weapons = weapons;
    }

    int getHp() {
        return hp;
    }

    Weapon getActiveWeapon() {
        return activeWeapon;
    }

    List<Weapon> getWeapons() {
        return weapons;
    }
}
