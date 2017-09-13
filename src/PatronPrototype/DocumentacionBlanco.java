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
public class DocumentacionBlanco extends Documentacion{
    
    public DocumentacionBlanco(){
        
        this.listaDocumentos = new ArrayList();
    }
    
    public void incluye (Documento doc){
        getListaDocumentos().add(doc);
    }
    
    public void excluye (Documento doc){
        getListaDocumentos().remove(doc);
    }
    
}
