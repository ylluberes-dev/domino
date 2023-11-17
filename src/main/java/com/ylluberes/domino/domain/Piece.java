package com.ylluberes.domino.domain;

public class Piece {

    public static final int MIN_DOTS = 0;

    public static final int MAX_DOTS = 6;

    private Domino firstFace;

    private Domino secondFace;

    public Piece (final Domino firstFace, final Domino secondFace) {
       this.firstFace = firstFace;
       this.secondFace = secondFace;
    }

}
