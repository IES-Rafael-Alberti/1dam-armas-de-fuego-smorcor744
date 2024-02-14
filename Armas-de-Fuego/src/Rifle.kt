import kotlin.random.Random

/**
 * Clase que representa un rifle, que es un tipo específico de arma de fuego.
 *
 * @param municion La cantidad inicial de munición para el rifle.
 */
class Rifle(municion: Int) : ArmaDeFuego(
    nombre = "Rifle",
    municion = 10,
    tipoDeMunicion = "60mm",
    municionARestar = 2
) {
    /**
     * Propiedad que representa el daño causado por el rifle.
     * El valor se elige de forma aleatoria entre 5 y 9.
     */
    override val danio: Int = Random.nextInt(5, 10)

    /**
     * Propiedad que representa el radio de alcance del rifle.
     */
    override val radio = Radio.Intermedio
}
