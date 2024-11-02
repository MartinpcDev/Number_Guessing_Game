# Number Guessing Game

Challenge basado en : [Number Guessing Game](https://roadmap.sh/projects/number-guessing-game)

Una aplicación de línea de comandos donde el usuario intenta adivinar un número seleccionado
aleatoriamente por el programa. El juego proporciona un número limitado de intentos según el nivel
de dificultad elegido.

## Características

* **Selección Aleatoria de Números**: El programa selecciona un número entre 1 y 100 al inicio de
  cada juego.
* **Niveles de Dificultad**: El usuario puede elegir entre tres niveles de dificultad, lo cual
  determina el número de intentos:
    * **Fácil**: Mayor cantidad de intentos.
    * **Medio**: Número intermedio de intentos.
    * **Difícil**: Menor cantidad de intentos.
* **Indicaciones**: Después de cada intento incorrecto, el programa informa si el número es mayor o
  menor al número ingresado.
* **Mensajes Finales**: Si el usuario acierta el número, el juego muestra un mensaje de
  felicitación. Si se agotan los intentos, el juego termina con un mensaje de fin.

## Cómo Jugar

1. **Iniciar el Juego**: Ejecuta el juego desde la línea de comandos para ver el mensaje de
   bienvenida y las reglas.
2. **Elegir Dificultad**: Selecciona el nivel de dificultad (fácil, medio, difícil) que determinará
   el número de intentos disponibles.
3. **Adivinar el Número**: Ingresa un número entre 1 y 100.
4. **Recibir Retroalimentación**:
    * Si el número ingresado es correcto, recibirás un mensaje de felicitación junto con el número
      de intentos usados.
    * Si es incorrecto, recibirás una pista de sí el número es mayor o menor.
5. **Fin del Juego**: El juego termina si aciertas el número o si se te acaban los intentos.