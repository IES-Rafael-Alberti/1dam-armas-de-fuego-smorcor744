import kotlin.random.Random

/**
 * Función principal que demuestra el uso de las clases de armas de fuego.
 */
fun main() {
    // Crear instancias de cada arma
    val pistola = Pistola(10)
    val rifle = Rifle(10)
    val bazooka = Bazooka(10)

    // Contador para llevar el seguimiento de los disparos realizados
    var cont = 0

    // Crear lista de armas
    val armas = listOf(pistola, rifle, bazooka)

    // Mostrar mensaje de munición extra
    println("\nMunición extra = ${ArmaDeFuego.cantidadMunicionExtra}... para todas las armas de fuego.\n")

    // Crear mapa con 12 disparos aleatorios
    val mapa = (1..12).map { armas.random() to (1..3).random() }

    // Recorrer el mapa, disparar y mostrar información
    for ((arma, disparosRealizados) in mapa) {
        cont += 1
        println("\n*** Disparo: ${cont}")
        for (i in 1..disparosRealizados) {
            arma.disparar()
            arma.mostrarInfo()
        }
    }
    //Parte 2
    // Crear instancias de cada objeto
    val casa = Casa(10)
    val coche = Coche(10)
    val bocadillo = Bocadillo(19)
    // Contador para llevar el seguimiento de los disparos realizados
    var cont2 = 0

    // Crear lista de armas
    val armas2 = listOf(pistola, rifle, bazooka, casa, coche, bocadillo)

    // Mostrar mensaje de munición extra
    println("\nMunición extra = ${ArmaDeFuego.cantidadMunicionExtra}... para todas las armas de fuego y objetos.\n")

    // Crear mapa con 9 disparos aleatorios
    val mapa2 = (1..9).map { armas2.random() to (1..3).random() }

    // Recorrer el mapa, disparar y mostrar información
    for ((arma, disparosRealizados) in mapa2) {
        cont2 += 1
        println("\n*** Disparo: ${cont2}")
        for (i in 1..disparosRealizados) {
            arma.disparar()
            arma.mostrarInfo()
        }
    }
}
class Casa(municion: Int):ArmaDeFuego(
    nombre = "Casa",
    municionARestar = 3,
    tipoDeMunicion = "Confetti",
    municion = 10){
    /**
     * Propiedad que representa el daño causado por la pistola.
     * El valor se elige de forma aleatoria entre 1 y 4.
     */
    override val danio: Int = 0

    /**
     * Propiedad que representa el radio de alcance de la pistola.
     */
    override val radio = Radio.Reducido
}
class Coche(municion:Int):ArmaDeFuego(
    nombre = "Coche",
    municionARestar = 5,
    tipoDeMunicion = "Rafagas de luz larga",
    municion = 10){
    /**
     * Propiedad que representa el daño causado por la pistola.
     * El valor se elige de forma aleatoria entre 1 y 4.
     */
    override val danio: Int = 0

    /**
     * Propiedad que representa el radio de alcance de la pistola.
     */
    override val radio = Radio.Amplio
}
class Bocadillo(municion:Int):ArmaDeFuego(
    nombre = "Bocadillo",
    municionARestar = 4,
    tipoDeMunicion = "Olor a jamón",
    municion = 10){
    /**
     * Propiedad que representa el daño causado por la pistola.
     * El valor se elige de forma aleatoria entre 1 y 4.
     */
    override val danio: Int = 0

    /**
     * Propiedad que representa el radio de alcance de la pistola.
     */
    override val radio = Radio.Amplio
}