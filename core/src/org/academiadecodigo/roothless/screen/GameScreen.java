package org.academiadecodigo.roothless.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import org.academiadecodigo.roothless.Game;
import org.academiadecodigo.roothless.input.InputListener;

/**
 * Created by codecadet on 30/03/17.
 */
public class GameScreen implements Screen {

    private Game game;
    private GameRenderer gameRenderer;


    public GameScreen() {

        Gdx.input.setInputProcessor(new InputListener());
    }

    float screenWidth = Gdx.graphics.getWidth();
    float screenHeigth = Gdx.graphics.getHeight();

    int mindPointY = (int) (screenHeigth/2);
    int mindPointX = (int) (screenWidth/2);

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.up;
    }

    @Override
    public void resize(int width, int height) {

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

    }
}
