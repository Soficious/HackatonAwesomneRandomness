package org.academiadecodigo.roothless.gameworld;

import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
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
    private TiledMap map;
    private boolean isCollinding = false;

    public GameWorld() {
        currentState = GameState.READY;
        player = new Player(125, 80);
        map = new TmxMapLoader().load("tiles/AwesomeMap.tmx");

    }


    public boolean collide() {


        MapObjects mapObjects = map.getLayers().get(1).getObjects();

        for (RectangleMapObject rectangleObject : mapObjects.getByType(RectangleMapObject.class)) {
            Rectangle r = rectangleObject.getRectangle();
            if (Intersector.overlaps(r, player.getRectangle())) {
                return isCollinding = true;
            } else {
                return isCollinding = false;
            }

        }
        return isCollinding = false;
    }

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

}
