package telefonia.planos;

import telefonia.clientes.Cliente;

/**
 *
 * @author polar
 */
public abstract class Plano {

    protected String tipo;
    protected String numero;
    protected int franquia;
    protected Cliente cliente;
    protected int creditos;

    public static int quantidadeNumeros = 0;

    public Plano(String tipo, Cliente cliente) {
        this.tipo = tipo;
        this.cliente = cliente;

        quantidadeNumeros += 1;
        this.numero = String.valueOf(quantidadeNumeros);

    }

    public Plano(String tipo, Cliente cliente, int franquia) {
        this.tipo = tipo;
        this.cliente = cliente;
        this.franquia = franquia;

        quantidadeNumeros += 1;
        this.numero = String.valueOf(quantidadeNumeros);

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getFranquia() {
        return franquia;
    }

    public String ligar(int creditos) {
        if (this.franquia < creditos) {
            return "Você não tem minutos disponíveis para realizar essa chamada.";
        }
        this.franquia -= creditos;
        return "Ligação realizada com sucesso. Você possui " + this.franquia + " minuto(s) restantes.";
    }

    public String ligarACobrarPreControle(int creditos, PlanoGenerico destino) {
        if (destino.franquia < creditos) {
            return "Este número não pode receber ligações a cobrar no momento.";
        } else {
            destino.franquia -= creditos;
            return "Ligação a cobrar de " + creditos + " minuto(s) realizada com sucesso.";
        }
    }

    public String ligarACobrarPos(int creditos, PlanoACobrar destino) {
        if (destino.franquia == creditos) {
            return "Este número não pode receber ligações a cobrar no momento.";
        } else {
            destino.franquia += creditos;
            return "Ligação a cobrar de " + creditos + " minuto(s) realizada com sucesso.";
        }
    }

    @Override
    public String toString() {
        String info = "";
        info += "Tipo de Plano: " + this.tipo + "\n";
        info += "Número: " + this.numero + "\n";
        info += "Nome: " + this.cliente.getNome() + "\n";
        info += "Sexo: " + this.cliente.getSexo() + "\n";
        info += "Crédito: " + this.franquia + " minuto(s) restantes para realizar ligações" + "\n";
        info += "---------------------------------------------------------------------\n";

        return info;
    }

}
