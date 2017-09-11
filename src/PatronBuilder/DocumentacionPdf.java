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
public class DocumentacionPdf extends Documentacion{

    public DocumentacionPdf(String tipo){
        this.tipo = tipo;
    }
    
    @Override
    public void agregaDocumento(Documentacion doc) {
        this.listaDocumentos.add(doc);
        System.out.println("Documentacion pdf agregada");
    }

    @Override
    public void imprimir() {
        
    }
    
    
}
