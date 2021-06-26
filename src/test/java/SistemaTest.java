import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest
{

    @Test
    void emiteSituacaoVeiculo ()
    {
        Motocicleta motocicleta = new Motocicleta();
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Carlos");
        motocicleta.setSituacao("Irregular");
        motocicleta.setTotalMulta(1000);
        motocicleta.setProprietario(proprietario);
        assertEquals("Chassi:" + motocicleta.getCodigoChassi() + " " + " Total de multas:" + motocicleta.getTotalMulta() + " " + "Nome propietario:" + motocicleta.getProprietario().getNome(), Sistema.emiteSituacaoVeiculo(motocicleta));
    }


    @Test
    void transferirVeiculo ()
    {
        Veiculo carro = new Carro();
        Proprietario proprietarioAntigo = new Proprietario();
        carro.setProprietario(proprietarioAntigo);
        proprietarioAntigo.setNome("Carlos");
        Proprietario proprietarioNovo = new Proprietario();
        proprietarioNovo.setNome("Jonas");
        Sistema.transferirVeiculo(proprietarioNovo, carro);
        assertEquals(proprietarioNovo, carro.getProprietario());
    }

    @Test
    void testEmitirPlaca() {
        Carro carro = new Carro();
        carro.setPlaca("1010");
        assertEquals("A placa do veículo é:1010",Sistema.emitirPlaca(carro));
    }

    @Test
    void emitirNomeProprietario() {
        Caminhao caminhao = new Caminhao();
        Proprietario proprietario  = new Proprietario();
        proprietario.setNome("Joao");
        caminhao.setProprietario(proprietario);
        assertEquals("Joao",caminhao.getProprietario().getNome());

    }


}