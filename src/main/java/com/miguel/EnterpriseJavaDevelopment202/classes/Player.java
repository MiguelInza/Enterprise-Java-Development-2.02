package com.miguel.EnterpriseJavaDevelopment202.classes;
//Create a Player class for a video game. Track the player’s stats (health, strength, lives, etc). Create 3 subclasses Warrior, Elf, Wizard. Provide at least one specialized behavior for each.
public class Player {
    private static int health;
    private static int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
    }

    public void decrementLives() {
        lives--;
        health = 100; // restore health to original state
    }

    public void attack(Player player) {
        player.health -= strength;
    }

    public static class Warrior extends Player {
        public Warrior(int health, int strength, int lives) {
            super(health, strength, lives);
        }

        public void rage() {
            strength += 5;
        }
    }

    public static class Elf extends Player {
        public Elf(int health, int strength, int lives) {
            super(health, strength, lives);
        }

        public void dodge() {
            health += 5;
        }
    }

    public static class Wizard extends Player {
        public Wizard(int health, int strength, int lives) {
            super(health, strength, lives);
        }

        public void castSpell() {
            strength += 10;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
