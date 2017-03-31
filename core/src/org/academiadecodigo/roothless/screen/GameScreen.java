package org.academiadecodigo.roothless.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.sun.javafx.geom.RectangularShape;
import org.academiadecodigo.roothless.gameObjects.Player;
import org.academiadecodigo.roothless.gameworld.GameRenderer;
import org.academiadecodigo.roothless.gameworld.GameWorld;
import org.academiadecodigo.roothless.input.InputListener;
import org.academiadecodigo.roothless.loader.AssetLoader;


import java.util.Iterator;

/**
 * Created by codecadet on 30/03/17.
 */
public class GameScreen implements Screen {

    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera camera;
    private GameWorld world;
    private GameRenderer gameRenderer;
    private boolean isCollinding = false;

    private Box2DDebugRenderer b2dr;
    private BodyDef bdef = new BodyDef();



//    public boolean collide() {
//        int object = 1;
//        TiledMapTileLayer collision = (TiledMapTileLayer) map.getLayers().get(object);
//        MapObjects mapObjects = collision.getObjects();
//
//        for (RectangleMapObject rectangleObject : mapObjects.getByType(RectangleMapObject.class)) {
//            Rectangle r = rectangleObject.getRectangle();
//            if (Intersector.overlaps(r, world.getPlayer().getRectangle())) {
//                return isCollinding = true;
//            } else {
//                return isCollinding = false;
//            }
//
//        }
//        return isCollinding = false;
//    }

    public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeigth = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeigth = screenHeigth / (screenWidth / gameWidth);
//        map = new TmxMapLoader().load("tiles/AwesomeMap.tmx");
        camera = new OrthographicCamera();

        int midPointY = (int) (gameHeigth / 2);

        world = new GameWorld();
        Gdx.input.setInputProcessor(new InputListener(world.getPlayer()));

        World world1 = new World(new Vector2(0, 0), true);


    }


    @Override
    public void show() {
        gameRenderer = new GameRenderer(world, camera);
        map = new TmxMapLoader().load("tiles/AwesomeMap.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);
        camera.setToOrtho(false);
        AssetLoader.load();
        gameRenderer.initGameObjects();
        renderer.setView(camera);

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        renderer.render();
        gameRenderer.drawPlayer();
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
}
