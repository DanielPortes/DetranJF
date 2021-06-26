public class Veiculo
{

    private String placa;
    private String modelo;
    private int ano;
    private Pessoa proprietario;
    private float potencia;
    private long codigoChassi;
    private String corroceria;
    private String local;
    private String cor;

    public Veiculo (long codigoChassi)
    {
        this.codigoChassi = codigoChassi;
    }
}
