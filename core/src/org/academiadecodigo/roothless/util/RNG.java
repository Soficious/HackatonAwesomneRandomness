package org.academiadecodigo.roothless.util;

/**
 * Created by codecadet on 31/03/17.
 */
public class RNG {

    public static int movePityCounter() {
        return (int) (Math.random() * (7 - 2) + 2);
    }
}
