/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author PORTOMASTER
 */
public class Caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
    System.out.println("Qual a cor da Caneta? " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
    }
    void rabiscar() {
    }
    
    void tampar() {

    }
    
    void destampar(){
    }
    }