/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herrohunter;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Warrior extends Hero {
    boolean hasTransport;

    public Warrior(String name, int strength, int health, ArrayList<Weapon> weapons, boolean hasTransport) {
        super(name, strength, health, weapons);
        this.hasTransport = hasTransport;
    }

    @Override
    public String wieldWeapon(Weapon weapon) {
        return "Warrior is wielding " + weapon.name;
    }
}
