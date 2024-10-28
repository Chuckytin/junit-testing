# Pruebas con JUnit

Este proyecto contiene una serie de pruebas para la clase `Example`. Cada prueba verifica el comportamiento correcto de diferentes métodos de la clase. 

### Métodos en la clase `Example`

1. **`sumar(int a, int b)`**
   - Suma dos números enteros y devuelve el resultado.
   - **Prueba**: `assertEquals(expected, actual);` verifica que el resultado de la suma sea el esperado.

2. **`checkPositivo(int numero)`**
   - Lanza una `IllegalArgumentException` si el número es negativo. Si no, devuelve `true`.
   - **Prueba**: `assertThrows(expectedException.class, executable);` asegura que se lanza la excepción al pasar un número negativo.
   - **Prueba adicional**: `assertTrue(condition);` verifica que devuelve `true` para números positivos.

3. **`contarLetrasA(String cadena)`**
   - Cuenta cuántas veces aparece la letra 'a' en una cadena dada.
   - **Prueba**: `assertEquals(expected, actual);` verifica que el conteo de 'a' es correcto.

4. **`contieneElemento(List<String> lista, String elemento)`**
   - Devuelve `true` si la lista contiene el elemento especificado; de lo contrario, `false`.
   - **Prueba**: `assertTrue(condition);` y `assertFalse(condition);` evalúan la presencia o ausencia del elemento en la lista.

5. **`revertirCadena(String cadena)`**
   - Revierte la cadena dada y devuelve el resultado.
   - **Prueba**: `assertEquals(expected, actual);` verifica que la cadena ha sido revertida correctamente.

6. **`factorial(int numero)`**
   - Calcula el factorial del número dado. Lanza una excepción si el número es negativo.
   - **Prueba**: `assertEquals(expected, actual);` verifica el valor factorial.
   - **Prueba adicional**: `assertThrows(expectedException.class, executable);` asegura que lanza excepción con números negativos.

7. **`esPrimo(int numero)`**
   - Verifica si el número dado es primo o no.
   - **Prueba**: `assertTrue(condition);` y `assertFalse(condition);` validan si el número es o no primo.

8. **`mensajeConRetraso()`**
   - Simula un retraso y retorna un mensaje después de 5 segundos.
   - **Prueba**: `assertEquals(expected, actual);` verifica que el mensaje es correcto.
   - **Nota**: Considerar configurar un timeout en la prueba debido al retraso.

9. **`convertirAString(List<Integer> lista)`**
   - Convierte una lista de enteros en una lista de strings.
   - **Prueba**: `assertInstanceOf(expectedType, object);` asegura que el resultado es una lista de strings.
   - **Prueba adicional**: `assertNotNull(object);` asegura que el resultado no sea `null`.

10. **`calcularMedia(List<Integer> lista)`**
    - Calcula la media de una lista de enteros. Lanza una excepción si la lista es `null` o está vacía.
    - **Prueba**: `assertEquals(expected, actual);` verifica el cálculo correcto de la media.
    - **Prueba adicional**: `assertThrows(expectedException.class, executable);` asegura que lanza excepción con listas vacías o nulas.

11. **`convertirListaAString(List<String> lista)`**
    - Convierte una lista de strings a un solo string en mayúsculas, con los elementos separados por comas.
    - **Prueba**: `assertEquals(expected, actual);` valida que la conversión de lista a string sea correcta.

### Aserciones de JUnit utilizadas

1. **`assertEquals(expected, actual)`**: Compara un valor esperado con el actual y falla si son diferentes.
2. **`assertTrue(condition)`**: Evalúa una condición booleana que debe ser `true`.
3. **`assertFalse(condition)`**: Evalúa una condición booleana que debe ser `false`.
4. **`assertNotNull(object)`**: Asegura que un objeto no sea `null`.
5. **`assertInstanceOf(expectedType, object)`**: Verifica que el tipo de un objeto es el esperado.
6. **`assertThrows(expectedException.class, executable)`**: Verifica que una excepción específica es lanzada.

---

Este `README.md` cubre tanto los métodos como las aserciones usadas para probar su funcionalidad, proporcionando una guía clara para cualquiera que desee entender o extender las pruebas. ¡Gracias por revisar este proyecto de pruebas JUnit!
