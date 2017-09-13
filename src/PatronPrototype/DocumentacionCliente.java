/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronPrototype;

import java.util.ArrayList;

/**
 *
 * @author Fuller 101
 */
public class DocumentacionCliente extends Documentacion{
    
    public DocumentacionCliente(){
        
        this.listaDocumentos = new ArrayList();
    }
    
    public void crea(String informacion, DocumentacionBlanco docBlanco) throws CloneNotSupportedException{
        
        for(Documento doc : docBlanco.getListaDocumentos()){
            
            Documento docClon = doc.duplicar();
            docClon.rellena(informacion); 
            this.listaDocumentos.add(docClon);
        }
            
    }
  
}
