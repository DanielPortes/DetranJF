public abstract class Sistema
{
    public static void emiteSituacaoVeiculo (Veiculo veiculo)
    {
        System.out.println("Codigo chassi: " + veiculo.getCodigoChassi());
        System.out.println("Montante de multas: " + veiculo.getTotalMulta());
        System.out.println("proprietario: " + veiculo.getProprietario());
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

    public abstract float CalcularIPVA ();

    public static void transferirVeiculo (Proprietario proprietario, Veiculo veiculo)
    {

        veiculo.setProprietario(proprietario);
    }

    public static void emitirPlaca (Veiculo veiculo)
    {

        System.out.println("A placa do veículo é:" + veiculo.getPlaca());

    }

    public static void emitirNomeProprietario (Veiculo veiculo)

    {
        System.out.println("O nome do proprietario é:" + veiculo.getProprietario());
    }

}



