package pl.com.clockworkgnome.memento.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Pawel on 2017-03-20.
 */
public class Player {

    private static Random random = new Random(System.currentTimeMillis());

    private int hp;

    private Weapon activeWeapon;

    List<Weapon> weapons =  new ArrayList<>();

    Weapon glock = new Weapon("Glock", 200, 17);
    Weapon shogun = new Weapon("Shotgun", 100, 2);

    public Player() {
        this.hp = 100;

        this.weapons.add(glock);
        this.weapons.add(shogun);
        this.activeWeapon = glock;
    }

    public Player(int hp, Weapon activeWeapon, List<Weapon> weapons) {
        this.hp = hp;
        this.activeWeapon = activeWeapon;
        this.weapons = this.weapons;
    }

    public void shoot() {
        this.activeWeapon.shoot();
        this.hp=this.hp - (random.nextInt(5));
        this.printStatus();
    }

    public void printStatus() {
        System.out.println("HP: " + this.hp + " Jestes uzbrojony w " + this.activeWeapon.getName());
    }

    public void reload() {
        this.activeWeapon.reload();
    }

    public void changeToGlock() {
        this.activeWeapon = glock;
    }

    public void changeToShotgun() {
        this.activeWeapon = shogun;
    }

    public PlayerMemento createMemento() {
        return new PlayerMemento(hp,activeWeapon,weapons);
    }

    public static Player createPlayer(PlayerMemento memento) {
        return new Player(memento.getHp(),memento.getActiveWeapon(),memento.getWeapons());
    }
}
