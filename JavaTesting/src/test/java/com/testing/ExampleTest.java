package com.testing;

//static para mayor comodidad y no llamar tantos Assertions.assertXXX
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

/*
assertEquals(); //evalua un valor esperado con uno actual

assertTrue(); //evalua un valor boolean y espera siempre True

assertFalse(); //evalua un valor boolean y espera siempre False

assertNotNull(); //valida que el objeto respuesta no sea null

assertInstanceOf(); //evalua el tipo de objeto que tengo

assertThrows(); //valida excepciones, asegura el error que se espera
 */

public class ExampleTest {

    /*
    private Example example; // Campo de instancia

    @BeforeEach
    public void init() {
        example = new Example(); // Inicialización antes de cada prueba
    }
    */

    @Test
    public void testSumar() {
        //Given
        Example example = new Example();
        int numA = 3;
        int numB = 5;

        //When
        int resultado = example.sumar(numA, numB);

        //Then
        assertNotNull(resultado);
        assertEquals(8 , resultado);
        assertInstanceOf(Integer.class, resultado);
    }

    @Test
    public void testCheckPositivo() {
        //Given
        Example example = new Example();
        int numA = 4;

        //When
        boolean resultado = example.checkPositivo(numA);

        //Then
        assertTrue(resultado);
    }

    @Test
    public void testCheckPositivoError() {
        //Given
        Example example = new Example();
        int numNegativo = -5;

        //When

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(numNegativo);
        });
    }

    @Test
    public void testContarLetrasA() {
        //Given
        Example example = new Example();
        String cadena = "Probando una cadena.";

        //When
        int resultado = example.contarLetrasA(cadena);

        //Then
        assertNotNull(resultado);
        assertEquals(4, resultado);
    }

    @Test
    public void testContieneElemento() {
        //Given
        Example example = new Example();
        List<String> lista = List.of("España", "México", "Alemania", "China");
        String pais = "Alemania";

        //When
        boolean resultado = example.contieneElemento(lista, pais);

        //Then
        assertTrue(resultado);
    }

    @Test
    public void testRevertirCadena() {
        // Given
        Example example = new Example();
        String cadena = "coche";

        // When
        String resultado = example.revertirCadena(cadena);

        //Then
        assertEquals("ehcoc", resultado);
    }

    @Test
    public void testFactorial() {
        //Given
        Example example = new Example();
        int numero = 6; //1x2x3x4x5x6

        //When
        long resultado = example.factorial(numero);

        //Then
        assertEquals(720, resultado);
    }

    @Test
    public void testFactorialError() {
        //Given
        Example example = new Example();
        int numero = -6;

        //When - Then
        assertThrows(IllegalArgumentException.class, () -> example.factorial(numero));
    }

    @Test
    public void testEsPrimo() {
        //Given
        Example example = new Example();
        int numero = 3;

        //When
        boolean resultado = example.esPrimo(numero);

        //Then
        assertTrue(resultado);
    }

    @Test
    public void testEsPrimoMayorQueCuatro() {
        //Given
        Example example = new Example();
        int numero = 9;

        //When
        boolean resultado = example.esPrimo(numero);

        //Then
        assertFalse(resultado);
    }

    @Test
    public void testEsPrimoMenorIgualQueUno() {
        //Given
        Example example = new Example();
        int numero = -3;

        //When
        boolean resultado = example.esPrimo(numero);

        //Then
        assertFalse(resultado);
    }

    @Test
    public void testNoEsPrimo() {
        //Given
        Example example = new Example();
        int numero = 8;

        //When
        boolean resultado = example.esPrimo(numero);

        //Then
        assertFalse(resultado);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        //Given
        Example example = new Example();

        //When
        String resultado = example.mensajeConRetraso();

        //Then
        assertEquals("Listo después de retraso", resultado);
    }

    @Test
    public void testConvertirAString() {
        //Given
        Example example = new Example();
        List<Integer> listaDeEnteros = List.of(1, 2, 3, 4);

        //When
        List<String> resultado = example.convertirAString(listaDeEnteros);

        //Then
        assertEquals(List.of("1", "2", "3", "4"), resultado);
    }

    @Test
    public void testCalcularMedia() {
        //Given
        Example example = new Example();
        List<Integer> lista = List.of(1, 2, 3, 4);

        //When
        double resultado = example.calcularMedia(lista);

        //Then
        assertEquals(2.5, resultado);
    }

    @Test
    public void testCalcularMediaError() {
        //Given
        Example example = new Example();
        List<Integer> lista = List.of(1, 2, 3, 4);

        //When
        double resultado = example.calcularMedia(lista);

        //Then
        assertEquals(2.5, resultado);
    }

    @Test
    public void testCalcularMediaNull() {
        //Given
        Example example = new Example();
        List<Integer> lista = null;

        //When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(lista);
        });
    }

    @Test
    public void testCalcularMediaVacia() {
        //Given
        Example example = new Example();
        List<Integer> lista = List.of();

        //When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(lista);
        });
    }

    @Test
    public void testConvertirListaAString() {
        //Given
        Example example = new Example();
        List<String> lista = List.of("1", "2", "3", "4");

        //When
        String resultado = example.convertirListaAString(lista);

        //Then
        assertInstanceOf(String.class, resultado);
    }

}
