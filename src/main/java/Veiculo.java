public abstract class Veiculo
{

    private String placa;
    private Proprietario proprietario;
    private int ano;
    private long codigoChassi;
    private String situacao;
    private float totalMulta;

    public String getSituacao ()
    {
        return situacao;
    }

    public void setSituacao (String situacao)
    {
        this.situacao = situacao;
    }

    public abstract float calcularIPVA ();

    public float getTotalMulta ()
    {
        return totalMulta;
    }

    public void setTotalMulta (float totalMulta)
    {
        this.totalMulta = totalMulta;
    }

    public String getPlaca ()
    {
        return placa;
    }

    public void setPlaca (String placa)
    {
        this.placa = placa;
    }


    public int getAno ()
    {
        return ano;
    }

    public void setAno (int ano)
    {
        this.ano = ano;
    }

    public Pessoa getProprietario ()
    {
        return proprietario;
    }

    public void setProprietario (Proprietario proprietario)
    {
        this.proprietario = proprietario;
    }

    public long getCodigoChassi ()
    {
        return codigoChassi;
    }

    public void setCodigoChassi (long codigoChassi)
    {
        this.codigoChassi = codigoChassi;
    }
}






