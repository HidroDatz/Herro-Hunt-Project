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
public class Troll extends Monster {
    int height;

    public Troll(String name, String habitat, int health, ArrayList<Weapon> weapons, int height) {
        super(name, habitat, health, weapons);
        this.height = height;
    }
}