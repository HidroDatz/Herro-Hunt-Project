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
public class Ogre extends Monster {
    boolean hasScales;

    public Ogre(String name, String habitat, int health, ArrayList<Weapon> weapons, boolean hasScales) {
        super(name, habitat, health, weapons);
        this.hasScales = hasScales;
    }
}

