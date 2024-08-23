package testMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {
    @Test
        // @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "vinic") o teste acontece somene se o usuario foi vinic
        // @DisabledIfEnvironmentVariable(named = "USERNAME",matches = "root")
        // @EnabledOnOs(OS.LINUX)
        // @EnabledOnOs({OS.LINUX, OS.WINDOWS})
        // @EnabledOnJre(JRE.JAVA_18)
        // @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_18)
    void validarAlgoSomenteNousuarioWillian() { //presume que meu nuck seja vinicius para executar o codigo a baixo
        Assertions.assertEquals(10, 5 + 5);
    }
}
