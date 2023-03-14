class WhiteStones(list: List<Stone>) : Stones() {
    constructor(vararg stone: Stone) : this(stone.toList())

    override fun putStone(stone: Stone): Stones = WhiteStones(list + stone)

    override fun getColor(): Color = Color.WHITE
}
