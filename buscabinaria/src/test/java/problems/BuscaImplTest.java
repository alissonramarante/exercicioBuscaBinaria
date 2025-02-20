package problems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BuscaImplTest {
    
    private BuscaBinariaImpl busca;

    @Before
    public void setUp(){
        busca = new BuscaBinariaImpl();
    }

    @Test
    public void test00(){
        busca.buscaIndexOf(null, 0);
           
    }
}
