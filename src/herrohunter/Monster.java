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
public abstract class Monster {
    String name;
    String habitat;
    int health;
    ArrayList<Weapon> weapons;

    public Monster(String name, String habitat, int health, ArrayList<Weapon> weapons) {
        this.name = name;
        this.habitat = habitat;
        this.health = health;
        this.weapons = weapons;
    }
}
