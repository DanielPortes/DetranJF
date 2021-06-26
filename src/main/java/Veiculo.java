public abstract class Veiculo
{

    private String placa;
    private String modelo;
    private int ano;
    private Proprietario proprietario;
    private float potencia;
    private long codigoChassi;
    private String carroceria;
    private String local;
    private String cor;
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

    public String getModelo ()
    {
        return modelo;
    }

    public void setModelo (String modelo)
    {
        this.modelo = modelo;
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

    public float getPotencia ()
    {
        return potencia;
    }

    public void setPotencia (float potencia)
    {
        this.potencia = potencia;
    }

    public long getCodigoChassi ()
    {
        return codigoChassi;
    }

    public void setCodigoChassi (long codigoChassi)
    {
        this.codigoChassi = codigoChassi;
    }

    public String getCorroceria ()
    {
        return carroceria;
    }

    public void setCorroceria (String carroceria)
    {
        this.carroceria = carroceria;
    }

    public String getLocal ()
    {
        return local;
    }

    public void setLocal (String local)
    {
        this.local = local;
    }

    public String getCor ()
    {
        return cor;
    }

    public void setCor (String cor)
    {
        this.cor = cor;
    }
}
