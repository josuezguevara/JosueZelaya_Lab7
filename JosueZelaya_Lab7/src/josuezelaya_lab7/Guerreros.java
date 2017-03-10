/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuezelaya_lab7;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Guerreros implements Serializable {

    private static final long SerialVersionUID = 888L;
    private String nombre;
    private String nickname;
    private double poder_ataque;
    private double poder_defensa;
    private double salud;
    private double puntos;

    public Guerreros() {
    }

    public Guerreros(String nombre, String nickname, double poder_ataque, double poder_defensa, double salud, double puntos) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.poder_ataque = poder_ataque;
        this.poder_defensa = poder_defensa;
        this.salud = salud;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getPoder_ataque() {
        return poder_ataque;
    }

    public void setPoder_ataque(double poder_ataque) {
        this.poder_ataque = poder_ataque;
    }

    public double getPoder_defensa() {
        return poder_defensa;
    }

    public void setPoder_defensa(double poder_defensa) {
        this.poder_defensa = poder_defensa;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    

}
