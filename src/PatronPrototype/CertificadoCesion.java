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
public class CertificadoCesion extends Documento{

    @Override
    public void imprime() {
        
        System.out.println(this.toString() +"\n"+ this.cuerpo);
    }

    @Override
    public String toString() {
        return "Certificado de Cesion";
    }

    
    
}
