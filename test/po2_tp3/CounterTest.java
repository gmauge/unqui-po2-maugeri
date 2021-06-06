package po2_tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

private Counter counter;    
    
    /**
     * Crea un escenario de test básico, que consiste en un contador 
     * con 10 enteros
     * 
     * @throws Exception
     */
    @BeforeEach
    public void setUp() throws Exception {
 
        //Se crea el contador
        counter = new Counter();
        
        //Se agregan los numeros. Solo 2 par y 8 impares
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(2);
        counter.addNumber(6);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }
 
    /**
     * Verifica la cantidad de pares
     */
    @Test
    public void testNumerosImpares() {
    	   	
        // Getting the even occurrences
        int amount = counter.cuantaImpares();
                
        // I check the amount is the expected one
        assertEquals(amount, 7);
    }
    
    /**
     * Verifica la cantidad de pares
     */
    @Test
    public void testNumerosPares() {
    	   	
        // Getting the even occurrences
        int amount = counter.contarPares ();
                
        // I check the amount is the expected one
        assertEquals(amount, 3);
    }

    /**
     * Verifica la cantidad de numtiplos de un mumero
     */
    @Test
    public void testCantidadDeNumerosDe() {
    	   	
        // Getting the even occurrences
        int amount = counter.cantidadDeMultiplosDe(2);
                
        // I check the amount is the expected one
        assertEquals(amount, 3);
    }

    
}