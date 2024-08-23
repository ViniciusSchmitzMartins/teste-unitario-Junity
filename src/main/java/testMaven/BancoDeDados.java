package testMaven;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        // fez algo
        LOGGER.info("Iniciando conexao");
    }

    public static void finalizarConexao(){
        // fez algo
        LOGGER.info("Finalizou conexao");
    }

    public static void inserirDados(Pessoa pessoa){
        LOGGER.info("Inserindo dados");
    }

    public static void removerDados(Pessoa pessoa){
        LOGGER.info("Removendo dados");
    }

}
