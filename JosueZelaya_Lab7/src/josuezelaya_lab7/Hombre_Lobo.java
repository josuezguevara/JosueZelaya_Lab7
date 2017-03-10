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
public class Hombre_Lobo extends Bestia{

    @Override
    public void Ataque(Guerreros guerrero) {
       double vida_rival1,vida_rival2;
       vida_rival1=this.getPoder_ataque()-guerrero.getPoder_defensa();
       vida_rival2=guerrero.getSalud()-vida_rival1;
       guerrero.setSalud(vida_rival2);
    }
    
}
