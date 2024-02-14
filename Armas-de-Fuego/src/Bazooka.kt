import kotlin.random.Random

/**
 * Clase que representa un bazooka, que es un tipo específico de arma de fuego.
 *
 * @param municion La cantidad inicial de munición para el bazooka.
 */
class Bazooka(municion: Int) : ArmaDeFuego(import kotlin.random.Random

        /**
         * Clase que representa un bazooka, que es un tipo específico de arma de fuego.
         *
         * @param municion La cantidad inicial de munición para el bazooka.
         */
        class Bazooka(municion: Int) : ArmaDeFuego(
            nombre = "Bazooka",
            municionARestar = 3,
            tipoDeMunicion = "RPG",
            municion = 10
        ) {
            /**
             * Propiedad que representa el daño causado por el bazooka.
             * El valor se elige de forma aleatoria entre 10 y 29.
             */
            override val danio = Random.nextInt(10, 30)

            /**
             * Propiedad que representa el radio de alcance del bazooka.
             */
            override val radio = Radio.Enorme
        }

        nombre = "Bazooka",
    municion = 10,
    tipoDeMunicion = "RPG",
    municionARestar = 3
) {
    /**
     * Propiedad que representa el daño causado por el bazooka.
     * El valor se elige de forma aleatoria entre 10 y 29.
     */
    override val danio = Random.nextInt(10, 30)

    /**
     * Propiedad que representa el radio de alcance del bazooka.
     */
    override val radio = Radio.Enorme
}
