package pl.com.clockworkgnome.memento.domain;

/**
 * Created by Pawel on 2017-03-20.
 */
public class Weapon {

    private String name;
    private int bulletsLeft;
    private int maxBullets;
    private int bulletsInClip;

    public Weapon(String name,int maxBullets, int bulletsInClip) {
        this.name = name;
        this.bulletsLeft = bulletsInClip;
        this.maxBullets = maxBullets;
        this.bulletsInClip = bulletsInClip;
    }

    public void shoot() {

        if(this.bulletsLeft>0) {
            this.bulletsLeft--;
            System.out.println("Strzelasz z " + this.name + ". Pozostalo w magazynku: " + this.bulletsLeft);

        } else {
            System.out.println("Musisz przeładować");
        }
    }

    public void reload() {
        this.bulletsLeft = this.bulletsInClip;
    }

    public String getName() {
        return name;
    }
}
