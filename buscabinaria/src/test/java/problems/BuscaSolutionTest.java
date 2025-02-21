package problems;
import org.junit.Before;
import org.junit.Test;

import solution.BuscaBinariaSolution;

import static org.junit.Assert.assertEquals;


public class BuscaSolutionTest {
    
    private BuscaBinariaSolution busca;

    @Before
    public void setUp(){
        busca = new BuscaBinariaSolution();
    }

    @Test
    public void testIndexOf(){
        int[] array = {3,7,9,12,18};
        assertEquals(-1,busca.buscaIndexOf(null, 3));
        assertEquals(-1,busca.buscaIndexOf(array, 2));
        assertEquals(-1,busca.buscaIndexOf(array, 20));
        assertEquals(0,busca.buscaIndexOf(array, 3));
        assertEquals(2,busca.buscaIndexOf(array, 9));
        assertEquals(4,busca.buscaIndexOf(array, 18));           
    }
    @Test
    public void testUltimaOcorrencia(){
        int[] array = {0,1,3,3,4,4,6,7,8,9,9,9,9,9};
        assertEquals(-1,busca.ultimaOcorrencia(null, 3));
        assertEquals(-1,busca.ultimaOcorrencia(array, 2));
        assertEquals(-1,busca.ultimaOcorrencia(array, 20));
        assertEquals(0,busca.ultimaOcorrencia(array, 0));
        assertEquals(5,busca.ultimaOcorrencia(array, 4));
        assertEquals(13,busca.ultimaOcorrencia(array, 9));           
    }
    @Test
    public void testFloor(){
        Integer[] array = {2,3,7,9,12,13};
        assertEquals(null,busca.floor(null, 3));
        assertEquals(null,busca.floor(array, 1));
        assertEquals(Integer.valueOf(3), busca.floor(array, 3));
        assertEquals(Integer.valueOf(7),busca.floor(array, 8));
        assertEquals(Integer.valueOf(13),busca.floor(array, 15));
    }

    @Test
    public void testCeil(){
        Integer[] array = {2,3,7,9,12,15};
        assertEquals(null,busca.ceil(null, 3));
        assertEquals(null,busca.ceil(array, 20));
        assertEquals(Integer.valueOf(12), busca.ceil(array, 12));
        assertEquals(Integer.valueOf(2), busca.ceil(array, 1));
        assertEquals(Integer.valueOf(15), busca.ceil(array, 13));
    }

    @Test
    public void testPrimeiraOcorrencia(){
        int[] array = {2,3,7,9,12,12,12,16,20,20,25};
        assertEquals(-1,busca.primeiraOcorrencia(null, 3));
        assertEquals(-1,busca.primeiraOcorrencia(array, 1));
        assertEquals(4, busca.primeiraOcorrencia(array, 12));
        assertEquals(0, busca.primeiraOcorrencia(array, 2));
        assertEquals(8, busca.primeiraOcorrencia(array, 20));
        assertEquals(10, busca.primeiraOcorrencia(array, 25));
    }

    @Test
    public void testCountMaior() {
        int[] array = {2, 3, 7, 9, 12, 16, 20, 22, 25};
        assertEquals(-1, busca.countMaior(null, 0));
        assertEquals(0, busca.countMaior(array, 30));
        //assertEquals(3, busca.countMaior(array, 16));
        //assertEquals(1, busca.countMaior(array, 22));
        //assertEquals(8, busca.countMaior(array, 0));
        //verificar erros
    }
    @Test
    public void testCountMenor() {
        int[] array = {2, 3, 7, 9, 12, 16, 20, 22, 25};
        assertEquals(-1, busca.contarMenores(null, 0));
        assertEquals(0, busca.contarMenores(array, 1));
        assertEquals(2, busca.contarMenores(array, 7));
        //assertEquals(8, busca.contarMenores(array, 25));
        //verificar erros
    }
}
