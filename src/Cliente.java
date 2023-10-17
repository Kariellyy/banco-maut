import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Endereco endereco;
    List<Conta> contas = new ArrayList();

    public Cliente(String nome, String cpf, Date dataNascimento, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public Date getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento){

    }

}
