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
public class PedidoContado extends Pedido{

    public PedidoContado(double montoPedido){
        this.montoPedido = montoPedido;
    }
    
    @Override
    public boolean valida(Cliente cliente) {
        boolean valida = false;
        
        if(cliente.getSaldo()>=this.montoPedido){
            valida = true;
        }
        
        else{
            System.out.println("Su pedido a contado no pudo ser validado.");
        }
        
        return valida;
    }

    @Override
    public void paga() {
        System.out.println("Su pedido ha sido pagado a contado exitosamente.");
    }
    
}
