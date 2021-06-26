import java.util.ArrayList;
import java.util.List;

public class Sistema
{
    private List<Veiculo> veiculos = new ArrayList<Veiculo>();

    public static String emiteSituacaoVeiculo (Veiculo veiculo)
    {
        return "Chassi:" + veiculo.getCodigoChassi() + " "
                + " Total de multas:" + veiculo.getTotalMulta() + " "
                + "Nome propietario:" + veiculo.getProprietario().getNome();
    }

    private void atualizaListaVeiculos (Veiculo veiculo)
    {
        veiculos.add(veiculo);
    }

    public String registrarVeiculo (String placa, Proprietario proprietario, Veiculo veiculo)
    {
        veiculo.setPlaca(placa);
        veiculo.setProprietario(proprietario);

        this.atualizaListaVeiculos(veiculo);
        return "veiculo registrado!";
    }

    public float calcularArrecadacao() {
        float totalArrecadado = 0.0f;
        for (Veiculo veiculo : this.veiculos) {
            totalArrecadado += veiculo.calcularIPVA();
        }
        return totalArrecadado;
    }


    public static void transferirVeiculo (Proprietario proprietario, Veiculo veiculo)
    {
        veiculo.setProprietario(proprietario);
    }

    public static String emitirPlaca (Veiculo veiculo)
    {
        return "A placa do veículo é:" + veiculo.getPlaca();
    }

    public static String emitirNomeProprietario (Veiculo veiculo)
    {
        return "O nome do proprietario é:" + veiculo.getProprietario().getNome();
    }

}



