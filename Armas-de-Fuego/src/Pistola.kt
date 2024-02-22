import kotlin.random.Random

/**
 * Clase que representa una pistola, que es un tipo específico de arma de fuego.
 *
 * @param municion La cantidad inicial de munición para la pistola.
 */
class Pistola(municion: Int) : ArmaDeFuego(
    nombre = "Pistola",
    municionARestar = 1,
    tipoDeMunicion = "9mm",
    municion = 10
) {
    /**
     * Propiedad que representa el daño causado por la pistola.
     * El valor se elige de forma aleatoria entre 1 y 4.
     */
    override val danio: Int = Random.nextInt(1, 5)

    /**
     * Propiedad que representa el radio de alcance de la pistola.
     */
    override val radio = Radio.Corto
}
