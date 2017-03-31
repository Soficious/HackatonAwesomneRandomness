package org.academiadecodigo.roothless.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import org.academiadecodigo.roothless.gameworld.GameRenderer;
import org.academiadecodigo.roothless.gameworld.GameWorld;
import org.academiadecodigo.roothless.input.InputListener;
import org.academiadecodigo.roothless.loader.AssetLoader;

/**
 * Created by codecadet on 30/03/17.
 */
public class GameScreen implements Screen {

    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera camera;
    private GameWorld world;
    private GameRenderer gameRenderer;


    public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screebHeigth = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeigth = screebHeigth / (screenWidth / gameWidth);
        camera = new OrthographicCamera();

        int midPointY = (int) (gameHeigth / 2);

        world = new GameWorld();

        Gdx.input.setInputProcessor(new InputListener(world.getPlayer()));

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
