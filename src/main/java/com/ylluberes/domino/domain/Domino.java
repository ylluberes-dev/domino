package com.ylluberes.domino.domain;

import java.util.HashMap;
import java.util.Map;

public enum Domino {

    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6);
    private int dotSize;
    Domino(int dotSize) {
        this.dotSize = dotSize;
    }
    private static Map<Integer, Domino> dotDominoPair  = new HashMap<>();

    static {
        dotDominoPair.put(ZERO.dotSize,ZERO);
        dotDominoPair.put(ONE.dotSize,ONE);
        dotDominoPair.put(TWO.dotSize,TWO);
        dotDominoPair.put(THREE.dotSize,THREE);
        dotDominoPair.put(FOUR.dotSize,FOUR);
        dotDominoPair.put(FIVE.dotSize,FIVE);
        dotDominoPair.put(SIX.dotSize,SIX);
    }

    public static Domino getDot (int dotSize) {
        return dotDominoPair.get(dotSize);
    }
}
