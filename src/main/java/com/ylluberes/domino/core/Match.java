package com.ylluberes.domino.core;

import com.ylluberes.domino.domain.Domino;
import com.ylluberes.domino.domain.Piece;
import com.ylluberes.domino.domain.Player;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Match {

    private BoardGame boardGame;
    private List<Player> players;

    void starNewMatch () {

    }

    public Set<Piece> generatePieces () {
        final Set<Piece> gamePieces = new HashSet<>();
        for (int i = Piece.MIN_DOTS; i <= Piece.MAX_DOTS; i ++) {
            for (int j = i; j <= Piece.MAX_DOTS; j ++) {
                gamePieces.add(new Piece(Domino.getDot(i), Domino.getDot(j)));
            }
        }
        return gamePieces;
    }

    public void shufflePieces () {
        final Set<Piece> gamePieces = generatePieces();
        gamePieces.stream().forEach(piece -> {
            players.stream().forEach(player -> {
                player.addDominoToHand(piece);
            });
        });
    }

}
