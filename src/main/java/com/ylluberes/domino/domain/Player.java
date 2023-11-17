package com.ylluberes.domino.domain;

import com.ylluberes.domino.core.Match;

import java.util.HashSet;
import java.util.Set;

public class Player implements Playable {
    private static final int  HAND_SET_SIZE = 7;

    private String nickName;
    private Set<Piece> handSet = new HashSet<>(HAND_SET_SIZE);

    private Match match;

    private boolean isHandSetFull () {
        return handSet.size() ==  HAND_SET_SIZE;
    }

    public void addDominoToHand (final Piece piece) {
        if(!isHandSetFull()) {
            handSet.add(piece);
        }
    }
}
