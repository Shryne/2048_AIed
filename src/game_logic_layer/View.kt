package game_logic_layer


class View<T>: Iterator<T> {
    val size = 0




    /*#####################################################
    overrides for Iterator interface
    #####################################################*/
    override fun next(): T {
        throw UnsupportedOperationException()
    }

    override fun hasNext(): Boolean {
        throw UnsupportedOperationException()
    }
}