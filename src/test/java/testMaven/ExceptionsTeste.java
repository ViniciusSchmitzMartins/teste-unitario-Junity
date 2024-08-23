package testMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta conta1 = new Conta("123456",0);
        Conta conta2 = new Conta("567891",200);

        TransferenciaEntreContas tranferencia = new TransferenciaEntreContas();

//        Assertions.assertThrows(IllegalArgumentException.class, () -> tranferencia.transfere(conta1,conta2,-1));  // verifica se lança excecao
        Assertions.assertDoesNotThrow(() -> tranferencia.transfere(conta1,conta2,-1)); // verifica se não ira lançar excecao
    }

}
