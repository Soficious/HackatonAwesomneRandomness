package org.academiadecodigo.roothless.loader;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by codecadet on 30/03/17.
 */

public class AssetLoader {
    public static Texture playerSprite, enemy1Sprite;
    public static TextureRegion front1, front2, right1, right2, left1, left2, back1, back2,
            atkFront1, atkFront2, atkRight1, atkRight2, atkLeft1, atkLeft2, atkBack1, atkBack2;
    public static TextureRegion e1Front1, e1Front2, e1Right1, e1Right2, e1Left1, e1Left2, e1Back1, e1Back2,
            e1AtkFront1, e1AtkFront2, e1AtkRight1, e1AtkRight2, e1AtkLeft1, e1AtkLeft2, e1AtkBack1, e1AtkBack2;
    //public static BitmapFont font;
    //public static BitmapFont shadow;
    public static Sound plyrAtk, plyrHit, plyrDeath, bgMusic, e1Atk, e1Death, footsteps;
    public static Preferences prefs;

    public static void load() {
        plyrDeath =Gdx.audio.newSound(Gdx.files.internal("sounds/playerDeath.mp3"));
        plyrHit =Gdx.audio.newSound(Gdx.files.internal("sounds/playerHit.mp3"));
        plyrAtk = Gdx.audio.newSound(Gdx.files.internal("sounds/playerAtack.mp3"));
        footsteps = Gdx.audio.newSound(Gdx.files.internal("sounds/footsteps.wav"));
        e1Atk = Gdx.audio.newSound(Gdx.files.internal("sounds/monsterAtack.wav"));
        e1Death =Gdx.audio.newSound(Gdx.files.internal("sounds/mosterDeath.mp3"));


        playerSprite = new Texture(Gdx.files.internal("playerSprite.png"));
        enemy1Sprite = new Texture(Gdx.files.internal("enemy1Sprite.png"));

        //player texture regions
        front1 = new TextureRegion(playerSprite, 0, 0, 32, 32);
        front2 = new TextureRegion(playerSprite, 32, 0, 32, 32);
        right1 = new TextureRegion(playerSprite, 64, 0, 32, 32);
        right2 = new TextureRegion(playerSprite, 96, 0, 32, 32);
        left1 = new TextureRegion(playerSprite, 128, 0, 32, 32);
        left2 = new TextureRegion(playerSprite, 160, 0, 32, 32);
        back1 = new TextureRegion(playerSprite, 192, 0, 32, 32);
        back2 = new TextureRegion(playerSprite, 224, 0, 32, 32);
        atkFront1 = new TextureRegion(playerSprite, 0, 32, 32, 32);
        atkFront2 = new TextureRegion(playerSprite, 32, 32, 32, 32);
        atkRight1 = new TextureRegion(playerSprite, 64, 32, 32, 32);
        atkRight2 = new TextureRegion(playerSprite, 96, 32, 32, 32);
        atkLeft1 = new TextureRegion(playerSprite, 128, 32, 32, 32);
        atkLeft2 = new TextureRegion(playerSprite, 160, 32, 32, 32);
        atkBack1 = new TextureRegion(playerSprite, 192, 32, 32, 32);
        atkBack2 = new TextureRegion(playerSprite, 224, 32, 32, 32);

        //enemy texture regions
        e1Front1 = new TextureRegion(enemy1Sprite, 0, 0, 32, 32);
        e1Front2 = new TextureRegion(enemy1Sprite, 32, 0, 32, 32);
        e1Right1 = new TextureRegion(enemy1Sprite, 64, 0, 32, 32);
        e1Right2 = new TextureRegion(enemy1Sprite, 96, 0, 32, 32);
        e1Left1 = new TextureRegion(enemy1Sprite, 128, 0, 32, 32);
        e1Left2 = new TextureRegion(enemy1Sprite, 160, 32, 32, 32);
        e1Back1 = new TextureRegion(enemy1Sprite, 192, 32, 32, 32);
        e1Back2 = new TextureRegion(enemy1Sprite, 224, 32, 32, 32);
        /*logoTexture = new Texture(Gdx.files.internal("data/logo.png"));
        logoTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

        logo = new TextureRegion(logoTexture, 0, 0, 512, 114);

        texture = new Texture(Gdx.files.internal("data/texture.png"));
        texture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        bg = new TextureRegion(texture, 0, 0, 136, 43);
        bg.flip(false, true);

        grass = new TextureRegion(texture, 0, 43, 143, 11);
        grass.flip(false, true);

        birdDown = new TextureRegion(texture, 136, 0, 17, 12);
        birdDown.flip(false, true);

        bird = new TextureRegion(texture, 153, 0, 17, 12);
        bird.flip(false, true);

        birdUp = new TextureRegion(texture, 170, 0, 17, 12);
        birdUp.flip(false, true);

        TextureRegion[] birds = {birdDown, bird, birdUp};

        skullUp = new TextureRegion(texture, 192, 0, 24, 14);
        // Create by flipping existing skullUp
        skullDown = new TextureRegion(skullUp);
        skullDown.flip(false, true);

        bar = new TextureRegion(texture, 136, 16, 22, 3);
        bar.flip(false, true);

        dead = Gdx.audio.newSound(Gdx.files.internal("data/dead.wav"));
        flap = Gdx.audio.newSound(Gdx.files.internal("data/flap.wav"));
        coin = Gdx.audio.newSound(Gdx.files.internal("data/coin.wav"));

        font = new BitmapFont(Gdx.files.internal("data/text.fnt"));
        font.getData().setScale(.25f, -.25f);
        shadow = new BitmapFont(Gdx.files.internal("data/shadow.fnt"));
        shadow.getData().setScale(.25f, -.25f);
        prefs = Gdx.app.getPreferences("ZombieBird");
        if (!prefs.contains("highScore")) {
            prefs.putInteger("highScore", 0);
        }*/
    }

    public static void dispose() {
        // We must dispose of the texture when we are finished.
        texture.dispose();
        dead.dispose();
        flap.dispose();
        coin.dispose();
        font.dispose();
        shadow.dispose();
    }

    public static void setHighScore(int val) {
        prefs.putInteger("highScore", val);
        prefs.flush();
    }

    public static int getHighScore() {
        return prefs.getInteger("highScore");
    }
}
