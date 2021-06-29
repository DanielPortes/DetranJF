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


}
