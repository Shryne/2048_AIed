package game_logic_layer

import java.util.*

class Game44 : Game {
    override var score = 0
        private set
    override var highestField = 0
        private set
    override var moveAmount = 0
        private set
    override val columns: ArrayList<ArrayList<Int>>
        get() = throw UnsupportedOperationException()
    override val rows: ArrayList<ArrayList<Int>>
        get() = throw UnsupportedOperationException()

    override fun progress(move: Move): Long {
        if (move.isVertical) {
            for (x in columns.indices) {
                for (y in columns[x]) {
                    if (columns[x][y] != 0) {

                    }
                }
            }
        } else {

        }
    }

    override fun getPossibleMoves(): Array<Move> {
        throw UnsupportedOperationException()
    }

    override fun isApplicable(move: Move): Boolean {
        return false;
    }
}