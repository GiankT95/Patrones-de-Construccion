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
public class SolicitudMatriculacion extends Documento{

    @Override
    public String imprime() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Solicitud de Matriculacion";
    }

    
    
}
