package telefonia.planos;

import telefonia.clientes.Cliente;

/**
 *
 * @author polar
 */
public class PlanoPosPago extends PlanoACobrar {

    public PlanoPosPago(String tipo, Cliente cliente) {
        super(tipo, cliente);
    }

    @Override
    public String ligar(int creditos) {
        franquia += creditos;
        return "Ligação realizada com sucesso.";
    }

    @Override
    public String toString() {
        String info = "";
        info += "Tipo de Plano: " + this.tipo + "\n";
        info += "Número: " + this.numero + "\n";
        info += "Nome: " + this.cliente.getNome() + "\n";
        info += "Sexo: " + this.cliente.getSexo() + "\n";
        info += "Crédito: " + this.franquia + " minuto(s) gastos em ligações" + "\n";
        info += "---------------------------------------------------------------------\n";

        return info;
    }

}
