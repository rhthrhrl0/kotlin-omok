fun Stone(x: Int, y: Int, color: Color = Color.WHITE) = Stone(Point(x, y), color)
fun BasedBoard(vararg stones: Stone) = object : BasedBoard(stones.toList()) {
    override val isFinished: Boolean
        get() = false

    override val isWin: Color
        get() = Color.BLACK

    override fun isPossiblePut(point: Point): Boolean {
        return true
    }

    override fun putStone(stone: Stone): Board {
        return this
    }
}
