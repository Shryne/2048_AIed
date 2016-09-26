package game_logic_layer

/**
 * Created by Seven on 24.09.2016.
 */
interface Game {
    val score: Int
    val highestField: Int
    val moveAmount: Int
    val columns: View<View<Int>>
    val rows: View<View<Int>>

    fun progress(move: Move): Long
    fun getPossibleMoves(): Array<Move>
    fun isApplicable(move: Move): Boolean
}