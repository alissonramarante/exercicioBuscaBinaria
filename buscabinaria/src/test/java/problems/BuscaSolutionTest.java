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
        int[] array = {3,7,9,12,12,12,12,18,19,22,25,28,30,30,33,33,40,40,40};
        assertEquals(-1,busca.ultimaOcorrencia(null, 3));
        assertEquals(-1,busca.buscaIndexOf(array, 2));
        assertEquals(-1,busca.buscaIndexOf(array, 20));
        //assertEquals(6,busca.buscaIndexOf(array, 12));
        //assertEquals(13,busca.buscaIndexOf(array, 30));
        assertEquals(19,busca.buscaIndexOf(array, 40));
        assertEquals(0,busca.buscaIndexOf(array, 3));           
    }
}
