/**
 * Program that implements classes for different kinds of dwellings.
 * Shows how to:
 * Create class hierarchy, variables and functions with inheritance,
 * abstract class, overriding, and private vs. public variables.
 */

fun main() {
    val squareCabin = SquareCabin(3, 50.0)
    val roundHut = RoundHut(5, 10.0)
    val roundTower = RoundTower(4, 15.5)

    with(squareCabin) {
        println("\nSquareCabin\n======")
        println("Capacity: ${squareCabin.capacity}")
        println("Material: ${squareCabin.buildingMaterial}")
        println("Has room? ${squareCabin.hasRoom()}")
        println("Floor area: ${floorArea()}")
    }
    with(roundHut) {
        println("\nRoundHut\n======")
        println("Capacity: ${roundHut.capacity}")
        println("Material: ${roundHut.buildingMaterial}")
        println("Floor area: ${floorArea()}")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Carpet Length: ${calculateMaxCarpetLength()}")
    }
    with(roundTower) {
        println("\nRoundTower\n======")
        println("Capacity: ${roundTower.capacity}")
        println("Material: ${roundTower.buildingMaterial}")
        println("Has room? ${roundTower.hasRoom()}")
        println("Floor area: ${floorArea()}")
    }
}