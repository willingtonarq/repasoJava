/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tresenraya.modelo;

/**
 *
 * @author wilax
 */
public class Jugador {
    
    private Character ficha;
    
    private Boolean turno;
    
    
    public Jugador(Character ficha, Boolean turno){
        this.ficha = ficha;
        this.turno = turno;
    }

    /**
     * @return the ficha
     */
    public Character getFicha() {
        return ficha;
    }

    /**
     * @param ficha the ficha to set
     */
    public void setFicha(Character ficha) {
        this.ficha = ficha;
    }

    /**
     * @return the turno
     */
    public Boolean getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(Boolean turno) {
        this.turno = turno;
    }
    
}
