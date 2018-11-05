/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author T-107
 */
public class Banco {
    public static void main(String[] args) {
        //Primero creamos una tarjeta credito
     TarjetadeCredito tcredito= new TarjetadeCredito();
     tcredito.setNumero(1234);
     tcredito.setNombre("Banamex");
     tcredito.setTipo("Credito");
     tcredito.setSaldo(100);
     
     TarjetaAhorro tahorro=new TarjetaAhorro();
     tahorro.setNumero(4321);
     tahorro.setNombre("Bancomer");
     tahorro.setTipo("Ahorro");
     tahorro.setSaldo(100);
     
     TarjetaNomina tnomina=new TarjetaNomina();
     tnomina.setNumero(789);
     tnomina.setNombre("HSBC");
     tnomina.setTipo("Nomina");
     tnomina.setSaldo(100);
     
     //Generar el codigo de deposito
     //Vamos a hacerlo de la forma mas basica
     
     //Tarjeta de nomina
     //tnomina.pagar(150);
     
     //tarjeta de ahorro
     //tahorro.pagar(150);
     
     //Tarjeta de credito
    // tcredito.pagar(150);
     
     //generar un arreglo de tarjeta
     Tarjeta tarjetas[]=new Tarjeta[3];
     tarjetas[0]=tnomina;
     tarjetas[1]=tcredito;
     tarjetas[2]=tahorro;
     
     //Iteramos el arreglo
     for(Tarjeta t:tarjetas){
         t.pagar(150);
         System.out.println("Saldo es "+t.getSaldo()+" tipo "+t.getTipo());
         
     }
     
     
        
        
    }
}
