package telefonia.clientes;

/**
 *
 * @author polar
 */
public class Cliente {

    private String nome;
    private char sexo;

    public Cliente(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
