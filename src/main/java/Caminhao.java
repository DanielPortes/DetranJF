public class Caminhao extends Veiculo
{
    private float limiteCarga;

    public Caminhao (float limiteCarga, long codigoChassi)
    {
        this.limiteCarga = limiteCarga;
        this.setCodigoChassi(codigoChassi);
    }

    public Caminhao ()
    {
    }

    public float getLimiteCarga ()
    {
        return limiteCarga;
    }

    public void setLimiteCarga (float limiteCarga)
    {
        this.limiteCarga = limiteCarga;
    }

    public float calcularIPVA ()
    {
        return (this.getAno() * 2);
    }

    public String retornaTodosDadosVeiculo ()
    {
        return "tipo do veiculo: Caminhao"
                + "Chassi:" + this.getCodigoChassi() + " "
                + " Total de multas:" + this.getTotalMulta() + " "
                + "Nome propietario:" + this.getProprietario().getNome() + " "
                + "limite de carga: " + this.limiteCarga;
    }
}
