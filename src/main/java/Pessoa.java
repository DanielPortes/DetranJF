public class Pessoa
{
    private String nome;
    private int idade;
    private String situacaoCivil;
    private long cpf;

    public String getNome ()
    {
        return nome;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public int getIdade ()
    {
        return idade;
    }

    public void setIdade (int idade)
    {
        this.idade = idade;
    }

    public String getSituacaoCivil ()
    {
        return situacaoCivil;
    }

    public void setSituacaoCivil (String situacaoCivil)
    {
        this.situacaoCivil = situacaoCivil;
    }

    public long getCpf ()
    {
        return cpf;
    }

    public void setCpf (int cpf)
    {
        this.cpf = cpf;
    }
}
