/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tresenraya.modelo;

/**
 *
 * @author wilax
 */
public class Tablero {
    
    private Character posiciones [][];
    
    private Integer contador;

    /**
     * @return the posiciones
     */
    public Character[][] getPosiciones() {
        return posiciones;
    }

    /**
     * @param posiciones the posiciones to set
     */
    public void setPosiciones(Character[][] posiciones) {
        this.posiciones = posiciones;
    }

    /**
     * @return the contador
     */
    public Integer getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(Integer contador) {
        this.contador = contador;
    }
            
    
}
