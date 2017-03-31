
package org.academiadecodigo.roothless.util;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import org.academiadecodigo.roothless.gameObjects.Player;


/**
 * Created by codecadet on 31/03/17.
 */

//public class Cenas {
//
//
//    public Cenas(World world, TiledMap map) {
//
//
//        int object = 1;
//        TiledMapTileLayer collision = (TiledMapTileLayer) map.getLayers().get(object);
//        MapObjects mapObjects = collision.getObjects();
//
//        for (RectangleMapObject rectangleObject : mapObjects.getByType(RectangleMapObject.class)) {
//            Rectangle r = rectangleObject.getRectangle();
//            if (Intersector.overlaps(r, player.getRectangle)) {
//
//            }
//
//        }
//
//
//        BodyDef bdef = new BodyDef();
//        PolygonShape shape = new PolygonShape();
//        FixtureDef fdef = new FixtureDef();
//        Body body;
//        World world1 = new World(new Vector2(0, 0), true);
//
//        /*for(MapObject object : map.getLayers().get(1).getObjects().getByType(RectangleMapObject.class)){
//
//            *//*Rectangle rect = ((RectangleMapObject) object).getRectangle();
//            bdef.type = BodyDef.BodyType.StaticBody;
//            bdef.position.set((rect.getX() + rect.getWidth()/2), (rect.getY() + rect.getHeight()/2));
//            body = world1.createBody(bdef);
//            shape.setAsBox(rect.getWidth()/2, rect.getHeight()/2);
//            fdef.shape = shape;
//            body.createFixture(fdef);*//*
//
//
//        }*/
//
//
//
//    }
//}

