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
public abstract class Documentacion {

    protected ArrayList<Documento> listaDocumentos;

    public ArrayList<Documento> getListaDocumentos() {
        return listaDocumentos;
    }

    public void imprime() {

        for (Documento doc : this.listaDocumentos) {
            doc.imprime();
        }
    }
}
