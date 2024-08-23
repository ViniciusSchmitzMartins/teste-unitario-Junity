package testMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTeste {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {10, 20 ,30 ,40, 50};
        int[] segundoLancamento = {1, 20, 30, 40, 50};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetoNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.now());

        Assertions.assertNotNull(pessoa);



    }


}
