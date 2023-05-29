package telefonia.planos;

import telefonia.clientes.Cliente;

/**
 *
 * @author polar
 */
public class PlanoACobrar extends Plano {

    public PlanoACobrar(String tipo, Cliente cliente) {
        super(tipo, cliente);
    }

    public PlanoACobrar(String tipo, Cliente cliente, int franquia) {
        super(tipo, cliente, franquia);
    }
}
