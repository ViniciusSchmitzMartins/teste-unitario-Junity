package testMaven;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

import javax.swing.plaf.basic.BasicMenuBarUI;

import java.time.LocalDate;

import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;

public class ConsultarDadosDePessoaTest {

    @BeforeAll  // exwcução unica no inicio do teste e after no final
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach  // executa antes e depois de cada teste que existir na classe
    void insereDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("João", LocalDate.of(2022,1,1)));
    }

    @AfterEach
    void removerDadosDoTeste(){
        BancoDeDados.removerDados(new Pessoa("João", LocalDate.of(2022,1,1)));
    }

    @Test
    void validarDadosDeRetorno(){
        assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2(){
        assertNull(null);
    }

    @AfterAll
    static void fecharConexao(){
        BancoDeDados.finalizarConexao();
    }

}
