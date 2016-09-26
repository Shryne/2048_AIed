package game_logic_layer

enum class Move(val isVertical: Boolean, val isHorzontal: Boolean = !isVertical) {
    UP(true),
    DOWN(true),
    LEFT(false),
    RIGHT(false);
}