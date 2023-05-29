package telefonia;

import telefonia.clientes.Cliente;
import telefonia.planos.Plano;
import telefonia.planos.PlanoControle;
import telefonia.planos.PlanoPosPago;
import telefonia.planos.PlanoPrePago;

/**
 *
 * @author polar
 */
public class Main {

    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Batman", 'M');
        Cliente cl2 = new Cliente("Homem-Aranha", 'M');
        Cliente cl3 = new Cliente("Superman", 'M');

        PlanoPosPago pos1 = new PlanoPosPago("PosPago", cl1);
        PlanoPrePago pre1 = new PlanoPrePago("PrePago", cl2);
        PlanoControle ctrl1 = new PlanoControle("Controle", cl3, 35);

        System.out.println("\nPÓS\n");
        System.out.println(pos1.ligar(20));
        System.out.println(pos1.ligar(20));
        System.out.println(pos1.ligar(10));
        System.out.println(pos1.ligar(5));
        System.out.println(pos1.ligarACobrarPreControle(5, pre1));
        System.out.println(pos1.ligarACobrarPreControle(5, ctrl1));
        System.out.println("\nPRÉ\n");
        System.out.println(pre1.ligar(5));
        System.out.println(pre1.recarregar(30));
        System.out.println(pre1.ligar(5));
        System.out.println(pre1.ligarACobrarPreControle(5, ctrl1));
        System.out.println(pre1.ligarACobrarPos(15, pos1));
        System.out.println("\nCONTROLE\n");
        System.out.println(ctrl1.ligar(20));
        System.out.println(ctrl1.ligar(20));
        System.out.println(ctrl1.recarregar(15));
        System.out.println(ctrl1.ligar(20));
        System.out.println(ctrl1.ligarACobrarPos(2, pos1));
        System.out.println(pre1.ligarACobrarPreControle(5, pre1));

        System.out.println("\n---------------------------------------------------------------------\n");

        System.out.println(pos1.toString());
        System.out.println(pre1.toString());
        System.out.println(ctrl1.toString());
        System.out.println("Quantidade de contas abertas: " + Plano.quantidadeNumeros);
        System.out.println("\n---------------------------------------------------------------------\n");
    }

}
