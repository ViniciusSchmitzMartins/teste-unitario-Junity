package testMaven;

import org.junit.jupiter.api.*;


//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class) executa os testem em forma alfabetica
//@TestMethodOrder(MethodOrderer.Random.class) executa aleotariamente os testes
@TestMethodOrder(MethodOrderer.DisplayName.class) // renomeamos o teste e é executado de fomra alfabetica
public class EscolhendoAOrdemTeste {

    //@Order(4) //orderAnnotation
    @DisplayName("A")
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    //@Order(3)//orderAnnotation
    @DisplayName("B")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    //@Order(2)//orderAnnotation
    @DisplayName("C")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    //@Order(1)//orderAnnotation
    @DisplayName("D")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }


}
