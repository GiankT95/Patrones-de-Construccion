/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbuilder;

import java.util.ArrayList;

/**
 *
 * @author Fuller 101
 */
public abstract class Documentacion {
    
    public String tipo;
    public ArrayList<Documentacion> listaDocumentos = new ArrayList();
    
    public abstract void agregaDocumento(Documentacion doc);
    public abstract void imprimir();

    public ArrayList<Documentacion> getListaDocumentos() {
        return listaDocumentos;
    }

    public void setListaDocumentos(ArrayList<Documentacion> listaDocumentos) {
        this.listaDocumentos = listaDocumentos;
    }
    
    
    
}
