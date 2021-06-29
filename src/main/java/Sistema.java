import java.util.ArrayList;
import java.util.List;

public class Sistema
{
    private List<Veiculo> veiculosCadastradosSistema = new ArrayList<>();

    public static String emiteSituacaoVeiculo (Veiculo veiculo)
    {
        return "Chassi:" + veiculo.getCodigoChassi() + " "
                + " Total de multas:" + veiculo.getTotalMulta() + " "
                + "Nome propietario:" + veiculo.getProprietario().getNome();
    }

    private void atualizaListaVeiculos (Veiculo veiculo)
    {
        veiculosCadastradosSistema.add(veiculo);
    }

    public String registrarVeiculo (String placa, Proprietario proprietario, Veiculo veiculo)
    {
        veiculo.setPlaca(placa);
        veiculo.setProprietario(proprietario);

        this.atualizaListaVeiculos(veiculo);
        return "veiculo registrado!";
    }

    public float calcularArrecadacao ()
    {
        float totalArrecadado = 0.0f;
        for (Veiculo veiculo : this.veiculosCadastradosSistema)
        {
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

    public static String consultaCargaLimite(Caminhao caminhao){
        return "A carga limite do caminhao e:" + caminhao.getLimiteCarga();
    }

    public static String consultaSituacao(Veiculo veiculo){
        return "A situação do veículo e:" + veiculo.getSituacao();
    }
}



