public class Motocicleta extends Veiculo
{

    public float calcularIPVA ()
    {
        return (this.getAno() / 2.0f);
    }

    public String retornaTodosDadosVeiculo ()
    {
        return "tipo do veiculo: motoclicleta" + " "
                + "Chassi:" + this.getCodigoChassi() + " "
                + " Total de multas:" + this.getTotalMulta() + " "
                + "Nome propietario:" + this.getProprietario().getNome();
    }

}
