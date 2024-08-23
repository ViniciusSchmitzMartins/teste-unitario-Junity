package testMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdadae(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2003,12,15));
        Assertions.assertEquals(20,pessoa.getIdade());
    }

    @Test
    void validarMaiorIdade(){
        Pessoa jao = new Pessoa("Jão", LocalDate.of(2005,8,21));
        Assertions.assertTrue(jao.ehMaiorDeIdade());

        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2006,12,15));
        Assertions.assertFalse(pessoa.ehMaiorDeIdade());
    }
}
