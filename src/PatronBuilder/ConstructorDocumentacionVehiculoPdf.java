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
public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo{

    public ConstructorDocumentacionVehiculoPdf(){
        
    }
    
    @Override
    public void construyeSolicitudPedido() {
        System.out.println("Pedido en formato PDF");
    }

    @Override
    public void construyeSolicitudMatriculacion() {
        System.out.println("Matriculacion en formato PDF");
    }

    @Override
    public Documentacion crearDocumento() {
        
        this.construyeSolicitudPedido();
        this.construyeSolicitudMatriculacion();
        documento = new DocumentacionHtml("PDF");
        documento.agregaDocumento(documento);
        
        return documento;
    }
    
    
}
