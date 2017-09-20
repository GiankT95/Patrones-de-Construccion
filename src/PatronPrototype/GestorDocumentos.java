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
public class GestorDocumentos {
    
    private static GestorDocumentos instance = null;
    
    public static GestorDocumentos instance (){
        
        if(instance == null){
            instance = new GestorDocumentos();
        }
        
        return instance;
    }
    
    public DocumentacionBlanco documentacionCompra(){   
        
        OrdenDePedido op = new OrdenDePedido();
        SolicitudMatriculacion sm = new SolicitudMatriculacion();
        CertificadoCesion cc = new CertificadoCesion();
        
        DocumentacionBlanco docBlanco= new DocumentacionBlanco();
        
        docBlanco.incluye(op);
        docBlanco.incluye(sm);
        docBlanco.incluye(cc);
        
        return docBlanco;
    }
    
    public DocumentacionBlanco documentacionGarantia(){   
        
        SolicitudGarantia sg = new SolicitudGarantia();
        
        DocumentacionBlanco docBlanco= new DocumentacionBlanco();
        
        docBlanco.incluye(sg);
        
        return docBlanco;
    }
    
    public DocumentacionBlanco documentacionDevolucion(){
        
        SolicitudDevolucion sd = new SolicitudDevolucion();
        
        DocumentacionBlanco docBlanco= new DocumentacionBlanco();
        
        docBlanco.incluye(sd);
        
        return docBlanco;        
    }
    
}
