package org.academiadecodigo.roothless.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import org.academiadecodigo.roothless.gameObjects.Player;
import org.academiadecodigo.roothless.input.InputListener;

/**
 * Created by codecadet on 30/03/17.
 */
public class GameScreen implements Screen {

    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera camera;
    private Player player;


/*    public GameScreen() {

        Gdx.input.setInputProcessor(new InputListener());
    }*/

    /*float screenWidth = Gdx.graphics.getWidth();
    float screenHeigth = Gdx.graphics.getHeight();*/

  /*  int mindPointY = (int) (screenHeigth/2);
    int mindPointX = (int) (screenWidth/2);
*/


    @Override
    public void show() {
        map = new TmxMapLoader().load( "tiles/AwesomeMap.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);
        camera = new OrthographicCamera();

    }

    @Override
    public void render(float delta) {
        game.up;
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        renderer.setView(camera);
        renderer.render();


        renderer.getBatch().begin();
        player.draw(renderer.getBatch());
        renderer.getBatch().end();
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
