import kotlin.random.Random

/**
 * Clase abstracta que representa una arma de fuego genérica.
 *
 * @property nombre El nombre del arma.
 * @property municionARestar La cantidad de munición a restar al disparar.
 * @property tipoDeMunicion El tipo de munición utilizada por el arma.
 * @property municion La cantidad actual de munición.
 */
abstract class ArmaDeFuego(
    private var nombre: String,
    private var municionARestar: Int = 0,
    private var tipoDeMunicion: String,
    private var municion: Int
) {
    /**
     * Propiedad abstracta que representa el daño causado por el arma.
     */
    abstract val danio: Int

    /**
     * Propiedad abstracta que representa el radio de alcance del arma.
     */
    abstract val radio: Radio

    /**
     * Cantidad de munición extra que puede tener el arma.
     */
    companion object{
        var cantidadMunicionExtra: Int = Random.nextInt(5, 15)
    }

    /**
     * Función que simula un disparo con el arma, restando la munición necesaria.
     * Si no hay suficiente munición, intenta recargar antes de mostrar un mensaje de falta de munición.
     */
    fun disparar() {
        if (municion >= municionARestar) {
            this.municion = municion - municionARestar
        } else if (this.municion < municionARestar) {
            recargar()
            if (municion >= municionARestar) {
                this.municion = municion - municionARestar
            } else println("No hay suficiente munición para disparar.")
        }
    }

    /**
     * Función que simula la recarga del arma, utilizando munición extra si es suficiente.
     * Muestra mensajes relacionados con el proceso de recarga.
     */
    fun recargar() {
        if (cantidadMunicionExtra >= (2 * municionARestar)) {
            this.municion += (2 * municionARestar)
            cantidadMunicionExtra -= (2 * municionARestar)
            println("$nombre se ha recargado, munición restante: $municion")
        } else {
            if (cantidadMunicionExtra < (2 * municionARestar)) {
                if (cantidadMunicionExtra > municionARestar) {
                    this.municion += municionARestar
                    cantidadMunicionExtra -= municionARestar
                    println("$nombre se ha recargado, munición restante: $municion")
                } else println("No hay suficiente munición extra para recargar.")
            }
        }
    }

    /**
     * Función que muestra la información del arma, incluyendo nombre, munición, tipo de munición, daño y radio.
     */
    fun mostrarInfo() {
        println("Nombre: $nombre, Munición: $municion, Tipo de munición: $tipoDeMunicion, Daño: $danio, Radio: $radio")
    }
}
