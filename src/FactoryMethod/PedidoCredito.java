/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Asus
 */
public class PedidoCredito extends Pedido{

    public PedidoCredito(double montoPedido){
        this.montoPedido = montoPedido;
    }
    
    @Override
    public boolean valida(Cliente cliente) {
        boolean valida = false;
        
        if(cliente.getSaldo()>=this.montoPedido){
            valida = true;
        }
        
        else{
            System.out.println("Su pedido a credito no pudo ser validado.");
        }
        
        return valida;
    }

    @Override
    public void paga() {
        System.out.println("Su pedido ha sido pagado a credito exitosamente.");
    }
    
}
