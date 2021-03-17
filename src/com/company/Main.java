package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior war = new Warrior();
        Medic medi = new Medic();
        Magic magical = new Magic();
        HavingSuperAbility[] heroes = {war, medi, magical};
        for (int i = 0; i <1 ; i++) {
            heroes[0].applySuperAbility(" CRITICAL DAMAGE");
            heroes[1].applySuperAbility(" лечить");
            heroes[2].applySuperAbility(" MAGICAL");
        }
    }
}
