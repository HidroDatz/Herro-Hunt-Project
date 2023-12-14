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
public abstract class Hero implements Comparable<Hero>, Armable {
    String name;
    int strength;
    int health;
    ArrayList<Weapon> weapons;

    public Hero(String name, int strength, int health, ArrayList<Weapon> weapons) {
        if (strength < 1) {
            throw new IllegalArgumentException("Strength must be greater than or equal to 1");
        }
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.weapons = weapons;
    }

    @Override
    public int compareTo(Hero other) {
        return Integer.compare(this.strength, other.strength);
    }
}
