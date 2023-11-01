package org.example.character;

import org.example.War.AxeBehavior;
import org.example.War.WeaponBehavior;

public class Troll extends Character{
    WeaponBehavior weaponBehavior;

    public Troll(){
        weaponBehavior = new AxeBehavior();
    }
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
