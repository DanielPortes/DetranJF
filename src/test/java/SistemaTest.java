/*
GRUPO:
        MATHEUS PEDRO ZANCANELLA BARBOZA 202035005
        DANIEL FAGUNDES PORTES FERNANDES 201965574C
*/

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest
{

    @Test
    void emiteSituacaoVeiculoMotocicleta ()
    {
        Motocicleta motocicleta = new Motocicleta();
        Proprietario proprietario = new Proprietario();

        proprietario.setNome("Carlinhos");
        motocicleta.setSituacao("Irregular");
        motocicleta.setTotalMulta(1000.0f);
        motocicleta.setProprietario(proprietario);

        assertEquals("tipo do veiculo: motoclicleta" + " "
                + "Chassi:" + motocicleta.getCodigoChassi() + " "
                + " Total de multas:" + motocicleta.getTotalMulta() + " "
                + "Nome propietario:" + motocicleta.getProprietario().getNome(), Sistema.emiteSituacaoVeiculo(motocicleta));
    }

    @Test
    void emiteSituacaoVeiculoCarro ()
    {
        Carro carro = new Carro();
        Proprietario proprietario = new Proprietario();

        proprietario.setNome("Joaozinho");
        carro.setSituacao("Regular");
        carro.setTotalMulta(0.0f);
        carro.setProprietario(proprietario);

        assertEquals("tipo do veiculo: Carro" + " "
                + "Chassi:" + carro.getCodigoChassi() + " "
                + " Total de multas: " + carro.getTotalMulta() + " "
                + "Nome propietario: " + carro.getProprietario().getNome() + " "
                + "limite de passageiros: " + carro.getTotalPassageiro(), Sistema.emiteSituacaoVeiculo(carro));
    }

    @Test
    void emiteSituacaoVeiculoCaminhao ()
    {
        Caminhao caminhao = new Caminhao();
        Proprietario proprietario = new Proprietario();

        proprietario.setNome("Carlos");
        caminhao.setSituacao("Irregular");
        caminhao.setTotalMulta(1000);
        caminhao.setProprietario(proprietario);

        assertEquals("tipo do veiculo: Caminhao"
                + "Chassi:" + caminhao.getCodigoChassi() + " "
                + " Total de multas:" + caminhao.getTotalMulta() + " "
                + "Nome propietario:" + caminhao.getProprietario().getNome() + " "
                + "limite de carga: " + caminhao.getLimiteCarga(), Sistema.emiteSituacaoVeiculo(caminhao));
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
    void calcularArrecadacao ()
    {
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
    void registrarVeiculo ()
    {
        Sistema sistema = new Sistema();
        Carro carro = new Carro();
        Proprietario proprietario = new Proprietario();
        carro.setPlaca("1010");
        carro.setProprietario(proprietario);
        assertEquals("veiculo registrado!", sistema.registrarVeiculo(carro.getPlaca(), proprietario, carro));
    }

    @Test
    void consultaCargaLimite ()
    {
        Caminhao caminhao = new Caminhao(123, 1234567);
        caminhao.setLimiteCarga(345);
        assertEquals("A carga limite do caminhao e:" + caminhao.getLimiteCarga(), Sistema.consultaCargaLimite(caminhao));
    }

    @Test
    void consultaSituacao ()
    {
        Carro carro = new Carro(6, 1234);
        carro.setSituacao("Irregular");
        assertEquals("A situação do veículo e:" + carro.getSituacao(), Sistema.consultaSituacao(carro));
    }

    @Test
    void deveRetornarSituacaoVeiculo ()
    {
        Carro carro = new Carro(3, 1010);
        carro.setTotalPassageiro(5);
        carro.setSituacao("Irregular");
        carro.setTotalMulta(100);
        assertEquals("Irregular", carro.getSituacao());
    }

    @Test
    void consultaTotalPassageiros ()
    {
        Carro carro = new Carro(5, 1234);
        assertEquals("O total de passageiros desse veículo e:" + carro.getTotalPassageiro(), Sistema.consultaTotalPassageiros(carro));

    }

}