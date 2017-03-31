package org.academiadecodigo.roothless.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.academiadecodigo.roothless.MyGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "dsfsdfsdf";
		config.width = 800;
		config.height = 576;
		new LwjglApplication(new MyGame(), config);
	}
}
