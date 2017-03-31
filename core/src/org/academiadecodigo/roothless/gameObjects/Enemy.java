package org.academiadecodigo.roothless.gameObjects;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import org.academiadecodigo.roothless.loader.AssetLoader;

/**
 * Created by codecadet on 31/03/17.
 */
public class Enemy {

    private int healthPoints;
    private int attack;
    private int posX;
    private int posY;
    private int width;
    private int height;
    private boolean isAlive;
    private TextureRegion textureRegion;

    public Enemy(int x, int y, TextureRegion textureRegion) {
        healthPoints = 1;
        attack = 1;
        this.posX = x;
        this.posY = y;
        isAlive = true;
        this.textureRegion = textureRegion;
    }

    public void enemyMovement() {
        double result = Math.random();

        if (result <= 0.25) {
            posY -= 32;
        } else if(result >= 0.26 && result <= 0.50) {
            posX += 32;
        } else if (result >= 0.51 && result <= 0.75) {
            posY += 32;
        } else {
            posX -= 32;
        }
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public boolean isAlive() {
        return isAlive;
    }


    public void dead() {
        isAlive = false;
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }

    public TextureRegion getTextureRegion() {
        return textureRegion;
    }

    public void setTextureRegion(TextureRegion textureRegion) {
        this.textureRegion = textureRegion;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
