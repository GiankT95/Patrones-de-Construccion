/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronPrototype;

/**
 *
 * @author Fuller 101
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {

        DocumentacionCliente docCliente = new DocumentacionCliente();

        docCliente.crea("Informacion de la compra del cliente.\n", GestorDocumentos.instance().documentacionCompra());
        docCliente.imprime();

        docCliente = new DocumentacionCliente();
        docCliente.crea("Informacion de la garantia del cliente.\n", GestorDocumentos.instance().documentacionDevolucion());
        docCliente.imprime();
    }
}
