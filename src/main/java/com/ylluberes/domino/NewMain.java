package com.ylluberes.domino;

import com.ylluberes.domino.core.Match;
import com.ylluberes.domino.domain.Piece;

import java.util.Set;

public class NewMain {

    public static void main(String[] args) {
        System.out.println("Running java app");

        Match match = new Match();
        Set<Piece> pieceSet = match.generatePieces();
        System.out.println();
    }
}
