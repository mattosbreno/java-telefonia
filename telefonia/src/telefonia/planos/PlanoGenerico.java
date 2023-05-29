package telefonia.planos;

import telefonia.clientes.Cliente;

/**
 *
 * @author polar
 */
public class PlanoGenerico extends Plano {

    public PlanoGenerico(String tipo, Cliente cliente) {
        super(tipo, cliente);
    }

    public PlanoGenerico(String tipo, Cliente cliente, int franquia) {
        super(tipo, cliente, franquia);
    }

    public String recarregar(int creditos) {
        franquia = franquia + creditos;
        return "Recarga de " + creditos + " minuto(s) realizada com sucesso.";
    }
}
