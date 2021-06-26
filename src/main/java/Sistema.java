public class Sistema
{
    public static String emiteSituacaoVeiculo (Veiculo veiculo)
    {
        return "Chassi:" + veiculo.getCodigoChassi() + " "
                + " Total de multas:" + veiculo.getTotalMulta() + " "
                + "Nome propietario:" + veiculo.getProprietario().getNome();
    }

    public static void registrarVeiculo (String placa, Proprietario proprietario, Veiculo veiculo)
    {
        if (veiculo.getProprietario() != null)
        {
            System.out.println("veiculo ja registrado, use o metodo transferir veiculo");
        }
        else
        {
            veiculo.setPlaca(placa);
            veiculo.setProprietario(proprietario);
            System.out.println("veiculo registrado!");
        }
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



