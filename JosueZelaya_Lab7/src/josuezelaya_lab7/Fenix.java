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
public class Fenix extends Bestia{

    @Override
    public void Ataque(Guerreros guerrero) {
         double salud_rival;
        double poder_ataque, ataque_rival1, ataque_rival2,resta_salud;
        poder_ataque=guerrero.getPoder_ataque()*0.75;//agaramos el 75%
        salud_rival= (guerrero.getPoder_ataque()+poder_ataque)-guerrero.getPoder_defensa();//suma del 75% de atque y resta del poder defensa del enemigo
        resta_salud=guerrero.getSalud()-salud_rival;//restamos la salud del rival 
        guerrero.setSalud(resta_salud);//asignammos
        ataque_rival1=guerrero.getPoder_ataque()*0.05;//agarramos el 15% de su poder defensa
        ataque_rival2=guerrero.getPoder_ataque()-ataque_rival1;
        guerrero.setPoder_ataque(ataque_rival2);//asignacion
        
    }
    
}
