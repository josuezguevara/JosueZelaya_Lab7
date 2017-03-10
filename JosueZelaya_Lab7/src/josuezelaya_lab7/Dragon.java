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
public class Dragon extends Bestia{
    @Override
    public void Ataque(Guerreros guerrero){
        double salud_rival;
        double poder_ataque, defensa_rival1, defensa_rival2,resta_salud;
        poder_ataque=guerrero.getPoder_ataque()*0.35;//agaramos el 35%
        salud_rival= (guerrero.getPoder_ataque()+poder_ataque)-guerrero.getPoder_defensa();//suma del 35% de atque y resta del poder defensa del enemigo
        defensa_rival1=guerrero.getPoder_defensa()*0.15;//agarramos el 15% de su poder defensa
        defensa_rival2=guerrero.getPoder_defensa()-defensa_rival1;
        guerrero.setPoder_defensa(defensa_rival2);//asignacion
        resta_salud=guerrero.getSalud()-salud_rival;//restamos la salud del rival 
        guerrero.setSalud(resta_salud);//asignammos
    }

   
}
