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
public class Mage extends Hero {
    int age;

    public Mage(String name, int strength, int health, ArrayList<Weapon> weapons, int age) {
        super(name, strength, health, weapons);
        if (age < 1) {
            throw new IllegalArgumentException("Age must be greater than or equal to 1");
        }
        this.age = age;
    }

    @Override
    public String wieldWeapon(Weapon weapon) {
        if ("spell".equals(weapon.type)) {
            return "Mage is wielding " + weapon.name;
        } else {
            return "Mage cannot wield non-spell weapons";
        }
    }
}

