abstract class BasedBoard(protected val placedStones: List<Stone>) : Board {

    override fun getPlacedStones(): List<Stone> = placedStones.toList()

    override fun getLatestPoint(color: Color): Point? {
        return placedStones.findLast { stone ->
            stone.color == color
        }?.point
    }
}
