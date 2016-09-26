package game_logic_layer

import java.util.*

fun main(args: Array<String>) {
    val con = ArrayList<Int>()
    con.forEach {  }
}

/**
 * Created by Seven on 24.09.2016.
 */
class Game44 : Game {
    override var score = 0
        private set
    override var highestField = 0
        private set
    override var moveAmount = 0
        private set
    override val columns: View<View<Int>>
        get() = throw UnsupportedOperationException()
    override val rows: View<View<Int>>
        get() = throw UnsupportedOperationException()

    override fun progress(move: Move): Long {
        throw UnsupportedOperationException()
    }

    override fun getPossibleMoves(): Array<Move> {
        throw UnsupportedOperationException()
    }

    override fun isApplicable(move: Move): Boolean {

    }
}

interface  MapArray<T> {
    fun forEach(elem: T): Unit
}

/*
class ColoumnContainer: MapArray<Column> {
    fun forEach(elem: T) =

}*/

class Column