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
        
        OrdenDePedido op = new OrdenDePedido();
        SolicitudMatriculacion sm = new SolicitudMatriculacion();
        CertificadoCesion cc = new CertificadoCesion();
        
        DocumentacionBlanco docBlanco= new DocumentacionBlanco();
        
        docBlanco.incluye(op);
        docBlanco.incluye(sm);
        docBlanco.incluye(cc);
        
        DocumentacionCliente docCliente= new DocumentacionCliente();
        
        docCliente.crea("Informacion del cliente.\n", docBlanco);
        docCliente.imprime();
        
        docBlanco.imprime();
    }
    
}
