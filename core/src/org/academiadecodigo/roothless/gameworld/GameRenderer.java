package org.academiadecodigo.roothless.gameworld;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import org.academiadecodigo.roothless.gameObjects.Enemy;
import org.academiadecodigo.roothless.gameObjects.Player;
import org.academiadecodigo.roothless.input.InputListener;
import org.academiadecodigo.roothless.loader.AssetLoader;
import org.academiadecodigo.roothless.screen.GameScreen;

import java.util.ArrayList;

/**
 * Created by codecadet on 31/03/17.
 */
public class GameRenderer {

    private ShapeRenderer shapeRenderer;
    private OrthographicCamera cam;

    private Player player;
    private Animation playerAnimation;
    private Animation enemyAnimation1, enemyAnimation2;
    private TextureRegion map;
    private TextureRegion playerTexture, enemy1, enemy2;
    private GameWorld world; //our Game
    private SpriteBatch batcher;
    private ArrayList<Enemy> enemyList;
    private boolean isEnemyAlive = true;

    public GameRenderer(GameWorld world, OrthographicCamera camera, ArrayList<Enemy> enemies) {
        this.world = world;
        batcher = new SpriteBatch();
        this.cam = camera;
//        batcher.setProjectionMatrix(camera.combined);
        enemyList = enemies;
        System.out.println(enemies);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(camera.combined);
        AssetLoader.load();

    }

    public void initAssets() {
        playerTexture = AssetLoader.front1;
        player.setTextureRegion(playerTexture);
    }

    public void initGameObjects() {
        //map = world.getMap;
        player = world.getPlayer();
        //enemy = world.getEnemy();

    }

    public void drawPlayer() {
        batcher.begin();
        batcher.draw(player.getTextureRegion(), player.getPosX(), player.getPosY());
        batcher.draw(AssetLoader.hearts5, 0, 550);
       // batcher.setProjectionMatrix(cam.combined);
        batcher.end();
    }


    public void drawEnemies() {
        batcher.begin();
        System.out.println(enemyList.size());
        for (Enemy e : enemyList) {
            System.out.println("tou ca");
            batcher.draw(e.getTextureRegion(),
                    e.getX(),
                    e.getY());
            //batcher.setProjectionMatrix(cam.combined);
        }
        batcher.end();
    }

    public void drawMenu() {
        batcher.begin();
        batcher.draw(AssetLoader.menu, 0, 0);
        batcher.end();
    }

    public void drawCredits() {
        batcher.begin();
        batcher.draw(AssetLoader.credits, 0, 0);
        batcher.end();
    }
}

