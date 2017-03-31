package org.academiadecodigo.roothless.gameworld;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import org.academiadecodigo.roothless.gameObjects.Enemy;
import org.academiadecodigo.roothless.gameObjects.Player;
import org.academiadecodigo.roothless.loader.AssetLoader;

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
    private Enemy enemy;
    private boolean isEnemyAlive = true;

    public GameRenderer(GameWorld world, OrthographicCamera camera) {
        this.world = world;
        batcher = new SpriteBatch();
        this.cam = camera;
        batcher.setProjectionMatrix(camera.combined);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(camera.combined);
        AssetLoader.load();
        initGameObjects();
        initAssets();

    }

    private void initAssets() {
        playerTexture = AssetLoader.front1;
        player.setTextureRegion(playerTexture);
    }

    public void initGameObjects() {
        //map = world.getMap;
        player = world.getPlayer();
        enemy = world.getEnemy();

    }

    public void drawPlayer() {
        batcher.begin();
        batcher.draw(playerTexture, player.getPosX(), player.getPosY());
        batcher.end();
    }


    public void drawEnemies() {

    }

}
