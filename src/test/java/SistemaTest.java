import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
        assertEquals("Chassi:" + motocicleta.getCodigoChassi() + " " +
                    " Total de multas:" + motocicleta.getTotalMulta() + " " +
                    "Nome propietario:" + motocicleta.getProprietario().getNome(), Sistema.emiteSituacaoVeiculo(motocicleta));
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
    void testEmitirPlaca ()
    {
        Carro carro = new Carro();
        carro.setPlaca("1010");
        assertEquals("A placa do veículo é:1010", Sistema.emitirPlaca(carro));
    }

    @Test
    void emitirNomeProprietario ()
    {
        Caminhao caminhao = new Caminhao();
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Joao");
        caminhao.setProprietario(proprietario);
        assertEquals("O nome do proprietario é:" + caminhao.getProprietario().getNome(), Sistema.emitirNomeProprietario(caminhao));
    }

    @Test
    void calcularArrecadacao() {
        Sistema sistema = new Sistema();
        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();
        Motocicleta moto = new Motocicleta();
        carro.setAno(200);
        moto.setAno(400);
        caminhao.setAno(100);
        Proprietario proprietario = new Proprietario();
        sistema.registrarVeiculo("101", proprietario, carro);
        sistema.registrarVeiculo("102", proprietario, caminhao);
        sistema.registrarVeiculo("103", proprietario, moto);
        assertEquals(600.0f, sistema.calcularArrecadacao());
    }

    @Test
    void registrarVeiculo() {
        Sistema sistema = new Sistema();
        Carro carro = new Carro();
        Proprietario proprietario = new Proprietario();
        carro.setPlaca("1010");
        carro.setProprietario(proprietario);
        assertEquals("veiculo registrado!",sistema.registrarVeiculo(carro.getPlaca(),proprietario,carro));

    }
}