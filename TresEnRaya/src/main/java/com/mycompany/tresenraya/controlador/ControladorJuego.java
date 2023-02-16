/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tresenraya.controlador;

import com.mycompany.tresenraya.modelo.Jugador;
import com.mycompany.tresenraya.modelo.Tablero;

/**
 *
 * @author wilax
 */
public class ControladorJuego {
    
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;
            
    
    public void InicializarJuego(){
        jugador1 = new Jugador('O', Boolean.TRUE);
        jugador2 = new Jugador('X', Boolean.FALSE);
        tablero = new Tablero();
        getTablero().setPosiciones(new Character[3][3]);
        getTablero().setContador(0);
    }
    
    public Character verificarGanador(Tablero tablero){
        if(tablero.getContador() >= 5){
            for (int i = 0; i <= 2; i++) {
                if(tablero.getPosiciones()[i][i] == 
                        tablero.getPosiciones()[i][i+1] && 
                        tablero.getPosiciones()[i][i] ==
                        tablero.getPosiciones()[i][i+2]){
                    return tablero.getPosiciones()[i][i];
                } 
            }
            
            for (int i = 0; i <= 2; i++) {
                if(tablero.getPosiciones()[i][i] == 
                        tablero.getPosiciones()[i+1][i] && 
                        tablero.getPosiciones()[i][i] ==
                        tablero.getPosiciones()[i+2][i]){
                    return tablero.getPosiciones()[i][i];
                } 
            }
            
            if(tablero.getPosiciones()[0][0] == tablero.getPosiciones()[1][1] &&
                    tablero.getPosiciones()[0][0] == tablero.getPosiciones()[2][2]){
                return tablero.getPosiciones()[0][0];
            }
            
            if(tablero.getPosiciones()[2][0] == tablero.getPosiciones()[1][1] &&
                    tablero.getPosiciones()[2][0] == tablero.getPosiciones()[0][2]){
                return tablero.getPosiciones()[2][0];
            }
        }
        return null;
    }
    
    public Boolean verificarEmpate(Tablero tablero){
        if(tablero.getContador() == 9 && verificarGanador(tablero) == null){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /**
     * @return the jugador1
     */
    public Jugador getJugador1() {
        return jugador1;
    }

    /**
     * @return the jugador2
     */
    public Jugador getJugador2() {
        return jugador2;
    }

    /**
     * @return the tablero
     */
    public Tablero getTablero() {
        return tablero;
    }
        
}
