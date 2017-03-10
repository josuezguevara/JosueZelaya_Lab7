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
public class Alumnos extends Guerreros{
    private long num_cuenta;
    private String carrera;
    private int edad;

    public Alumnos() {
        super();
    }

    public Alumnos(long num_cuenta, String carrera, int edad, String nombre, String nickname, double poder_ataque, double poder_defensa, double salud, double puntos) {
        super(nombre, nickname, poder_ataque, poder_defensa, salud, puntos);
        this.num_cuenta = num_cuenta;
        this.carrera = carrera;
        this.edad = edad;
    }

    public long getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(long num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.getNombre()+ num_cuenta;
    }
    
    
}
