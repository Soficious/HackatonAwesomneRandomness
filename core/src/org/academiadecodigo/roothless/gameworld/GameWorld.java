package org.academiadecodigo.roothless.gameworld;

import org.academiadecodigo.roothless.gameObjects.Enemy;
import org.academiadecodigo.roothless.gameObjects.Player;

/**
 * Created by codecadet on 31/03/17.
 */
public class GameWorld {

    private Player player;
    private Enemy enemy;
    private boolean isAlive = false;
    private GameState currentState;
    //private WorldMap map;




    public GameWorld() {
        currentState = GameState.READY;
        player = new Player(125, 80);

    }

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }


}
