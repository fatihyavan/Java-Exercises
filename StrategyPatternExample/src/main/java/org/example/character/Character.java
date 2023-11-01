package org.example.character;

import org.example.War.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void performWeapon(){
        weaponBehavior.useWeapon();
    }
}
