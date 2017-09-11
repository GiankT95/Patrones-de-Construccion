/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbuilder;

/**
 *
 * @author Fuller 101
 */
public abstract class ConstructorDocumentacionVehiculo {
    
    public Documentacion documento;
    
    public abstract void construyeSolicitudPedido();
    public abstract void construyeSolicitudMatriculacion();
    public abstract Documentacion crearDocumento();
    
    public void resultado(){
        this.documento = this.crearDocumento();
    }
    
    public Documentacion getDocumento() {
        return documento;
    }

    public void setDocumento(Documentacion documento) {
        this.documento = documento;
    }
    
    
    
}
