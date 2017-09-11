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
public abstract class Documento implements Cloneable{
    
    public Documento duplicar() throws CloneNotSupportedException{
        
        Documento documentoClon = (Documento) this.clone();
        
        return documentoClon;
    }
    
    public void rellena (String info){
        System.out.println(imprime() +"\n"+ info);
    }
    
    public abstract String imprime();
    
}
