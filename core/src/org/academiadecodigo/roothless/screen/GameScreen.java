package org.academiadecodigo.roothless.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.MapLayers;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import org.academiadecodigo.roothless.gameObjects.Enemy;
import org.academiadecodigo.roothless.gameObjects.Player;
import org.academiadecodigo.roothless.gameworld.GameRenderer;
import org.academiadecodigo.roothless.gameworld.GameState;
import org.academiadecodigo.roothless.gameworld.GameWorld;
import org.academiadecodigo.roothless.input.InputListener;
import org.academiadecodigo.roothless.loader.AssetLoader;

import java.util.ArrayList;

import static org.academiadecodigo.roothless.loader.AssetLoader.enemy1Sprite;

/**
 * Created by codecadet on 30/03/17.
 */
public class GameScreen implements Screen {

    private GameState state;
    private Player player;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera camera;
    private GameWorld world;
    private GameRenderer gameRenderer;
    private ArrayList<Enemy> enemies;
    public static Texture menu;


//    int objectLayerId = 5;
//    TiledMapTileLayer collisionObjectLayer = (TiledMapTileLayer)map.getLayers().get(objectLayerId);
//    MapObjects objects = collisionObjectLayer.getObjects();



    public GameScreen() {
        state = GameState.READY;
        float screenWidth = Gdx.graphics.getWidth();
        float screebHeigth = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeigth = screebHeigth / (screenWidth / gameWidth);
        camera = new OrthographicCamera();
        menu = AssetLoader.menu;
        enemies = new ArrayList<Enemy>();
        Enemy e = new Enemy(632, 230, AssetLoader.e1Right1);
        Enemy e1 = new Enemy(272, 90, AssetLoader.e1Right1);
        Enemy e2 = new Enemy(457, 345, AssetLoader.e1Right1);
        Enemy e3 = new Enemy(314, 554, AssetLoader.e1Right1);
        Enemy e4 = new Enemy(132, 398, AssetLoader.e1Right1);
        enemies.add(e);
        enemies.add(e1);
        enemies.add(e2);
        enemies.add(e3);
        enemies.add(e4);

        System.out.println(AssetLoader.e1Right1);
        System.out.println(e.getTextureRegion());


        int midPointY = (int) (gameHeigth / 2);

        world = new GameWorld();
        gameRenderer = new GameRenderer(world, camera, enemies);
        player = world.getPlayer();



        gameRenderer.initGameObjects();
        gameRenderer.initAssets();

        Gdx.input.setInputProcessor(new InputListener(world.getPlayer(), enemies, menu, this));

        //int objectLayerId = 1;
        //MapLayers collisionObjectLayer = map.getLayers();
        //MapObjects objects = collisionObjectLayer;
        //System.out.println(objects);

// there are several other types, Rectangle is probably the most common one
        /*for (RectangleMapObject rectangleObject : objects.getByType(RectangleMapObject.class)) {

            Rectangle rectangle = rectangleObject.getRectangle();
            if (Intersector.overlaps(rectangle, player.getRectangle()) {
                // collision happened
            }*/
        }


    @Override
    public void show() {
        map = new TmxMapLoader().load("tiles/AwesomeMap.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);
        camera.setToOrtho(false);
        AssetLoader.load();
        gameRenderer.initGameObjects();
        renderer.setView(camera);

//        // there are several other types, Rectangle is probably the most common one
//        for (RectangleMapObject rectangleObject : objects.getByType(RectangleMapObject.class)) {
//
//            Rectangle rectangle = rectangleObject.getRectangle();
//            if (Intersector.overlaps(rectangle, player.getHitbox())) {
//                // collision happened
//            }
//        }
//
//// there are several other types, Rectangle is probably the most common one
//        for (RectangleMapObject rectangleObject : objects.getByType(RectangleMapObject.class)) {
//
//            Rectangle rectangle = rectangleObject.getRectangle();
//            if (Intersector.overlaps(rectangle, player.getHitbox())) {
//                // collision happened
//            }
//        }
    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        switch(state) {
            case READY:
                gameRenderer.drawMenu();
                break;

            case RUNNING:
                renderer.render();
                gameRenderer.drawPlayer();
                gameRenderer.drawEnemies();
                break;

            case GAMEOVER:
                gameRenderer.drawCredits();
                break;

        }
    }

    @Override
    public void resize(int width, int height) {
        camera.viewportWidth = width * 2;
        camera.viewportHeight = height * 2;
        camera.update();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        map.dispose();
        renderer.dispose();
    }

    public void setState(GameState state) {
        this.state = state;
    }
}
