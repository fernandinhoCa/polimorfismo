/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author fernando.capeletti
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  Calculadora calc = new Calculadora();
        System.out.println(calc.somar(2, 6, 10));
      */
      
      Gato gato = new Gato();
      Cachorro cachorro = new Cachorro();
      Pato pato = new Pato();
      
      gato.comunicar();
      cachorro.comunicar();
      pato.comunicar();
    }
    
}
