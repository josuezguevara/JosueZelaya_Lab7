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
public class Minotauro extends Bestia{

    public Minotauro() {
        super();
    }

    public Minotauro(String nombre, String nickname, double poder_ataque, double poder_defensa, double salud, double puntos) {
        super(nombre, nickname, poder_ataque, poder_defensa, salud, puntos);
    }

    
    @Override
    public void Ataque(Guerreros guerrero) {
       double vida1,vida2, porciento,suma,ataque1,ataque2;
       porciento=guerrero.getPoder_defensa()*0.50;
       suma=guerrero.getPoder_defensa()+porciento;
       vida1=(this.getPoder_ataque()*2)-suma;
       vida2=guerrero.getSalud()-vida1;
       guerrero.setSalud(vida2);//asignacion
       ataque1=guerrero.getPoder_ataque()*0.10;
       ataque2=guerrero.getPoder_ataque()+ataque1;
       guerrero.setPoder_ataque(ataque2);//asignacion
    }
    
}
