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
public class Faerie extends Hero {
    int height;

    public Faerie(String name, int strength, int health, ArrayList<Weapon> weapons, int height) {
        super(name, strength, health, weapons);
        this.height = height;
    }

    @Override
    public String wieldWeapon(Weapon weapon) {
        return "Faerie cannot wield weapons";
    }
}
