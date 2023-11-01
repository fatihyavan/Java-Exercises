package org.example.character;

import org.example.War.KnifeBehavior;
import org.example.War.WeaponBehavior;

public class Queen extends Character{
    WeaponBehavior weaponBehavior;

    public Queen(){
        weaponBehavior = new KnifeBehavior();
    }
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
