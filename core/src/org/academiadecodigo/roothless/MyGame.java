package org.academiadecodigo.roothless;

import com.badlogic.gdx.Game;
import org.academiadecodigo.roothless.screen.GameScreen;

public class MyGame extends Game {
	
	@Override
	public void create () {
		setScreen(new GameScreen());
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		super.dispose();
	}
}
