public class Carro extends Veiculo
{

    private int totalPassageiro;

    public Carro (int totalPassageiro, long codigoChassi)
    {
        this.totalPassageiro = totalPassageiro;
        this.setCodigoChassi(codigoChassi);
    }

    Carro ()
    {
    }

    public int getTotalPassageiro ()
    {
        return totalPassageiro;
    }

    public void setTotalPassageiro (int totalPassageiro)
    {
        this.totalPassageiro = totalPassageiro;
    }

    public float calcularIPVA ()
    {
        return (this.getAno());
    }

    public String retornaTodosDadosVeiculo ()
    {
        return "tipo do veiculo: Carro" + " "
                + "Chassi:" + this.getCodigoChassi() + " "
                + " Total de multas: " + this.getTotalMulta() + " "
                + "Nome propietario: " + this.getProprietario().getNome() + " "
                + "limite de passageiros: " + this.totalPassageiro;
    }


}
