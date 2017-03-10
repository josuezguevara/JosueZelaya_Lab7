/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuezelaya_lab7;

/**
 *
 * @author usuario
 */
public abstract class Bestia extends Guerreros{

    public Bestia(String nombre, String nickname, double poder_ataque, double poder_defensa, double salud, double puntos) {
        super(nombre, nickname, poder_ataque, poder_defensa, salud, puntos);
    }

    public Bestia() {
    }
    
    
    public abstract void Ataque(Guerreros guerrero);
}
