/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author HAUSE
 */
public class Estudiante {
    int ru;
    String nombre;
    String apellido;
    String fechanacimiento;

    public Estudiante(int ru, String nombre, String apellido, String fechanacimiento) {
        this.ru = ru;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
    }
    
    public Estudiante(){
    }

    public int getRu() {
        return ru;
    }

    public void setRu(int ru) {
        this.ru = ru;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "ru=" + ru + ", nombre=" + nombre + ", apellido=" + apellido + ", fechanacimiento=" + fechanacimiento + '}';
    }
    
    
}
