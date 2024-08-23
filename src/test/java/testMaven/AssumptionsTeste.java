package testMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
    @Test
    void validarAlgoSomenteNousuarioWillian() { //presume que meu nuck seja vinicius para executar o codigo a baixo
        Assumptions.assumeTrue("vinic".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5 + 5);
    }
}

