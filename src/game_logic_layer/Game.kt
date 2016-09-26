package game_logic_layer

import java.util.*

interface Game {
    val score: Int
    val highestField: Int
    val moveAmount: Int
    val columns: ArrayList<ArrayList<Int>>
    val rows: ArrayList<ArrayList<Int>>

    fun progress(move: Move): Long
    fun getPossibleMoves(): Array<Move>
    fun isApplicable(move: Move): Boolean
}