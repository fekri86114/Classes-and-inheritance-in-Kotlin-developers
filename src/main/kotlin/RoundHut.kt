import kotlin.math.PI
import kotlin.math.sqrt

/**
 * Dwelling with a circular floorspace
 *
 * @param residents Current number of residents
 * @param radius Radius
 */
open class RoundHut(residents: Int, private val radius: Double): Dwelling(residents) {
    override val buildingMaterial: String = "Straw"
    override val capacity: Int = 4

    /**
     * Calculates floor area for a round dwelling.
     *
     * @return floor area
     */
    override fun floorArea(): Double {
        return PI * radius * radius
    }

    /**
     *  Calculates the max length for a square carpet
     *  that fits the circular floor.
     *
     * @return length of square carpet
     */
    fun calculateMaxCarpetLength(): Double {
        return sqrt(2.0) * radius
    }
}