package org.academiadecodigo.roothless.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import org.academiadecodigo.roothless.gameObjects.Player;
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

        int midPointY = (int) (gameHeigth / 2);

        world = new GameWorld();
        //renderer = new GameRenderer(world);

        Gdx.input.setInputProcessor(new InputListener());

    }


    @Override
    public void show() {
        map = new TmxMapLoader().load( "tiles/AwesomeMap.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);
        camera = new OrthographicCamera();

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        AssetLoader.load();
        renderer.setView(camera);
        renderer.render();
        gameRenderer.drawPlayer();
    }

    @Override
    public void resize(int width, int height) {
        camera.viewportWidth = width;
        camera.viewportHeight = height;
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
        map.dispose();
        renderer.dispose();
    }

    @Override
    public void dispose() {

    }
}
