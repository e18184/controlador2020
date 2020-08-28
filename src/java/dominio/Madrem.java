/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import dominio.Hijom;
import java.util.Set;

/**
 *
 * @author HAUSE
 */
public class Madrem {
    // formulario de la madre 
    private String cim;
    private String nombre;
    private String ap;
    private String am;
    // una madre tiene muchos hijos -> Set (vector)
    private Hijom[] hijomv = new Hijom[3];
    private Set <Hijom> hijom;
    // una madre tiene un solo hijo
    private Hijom hijou;

    public Set<Hijom> getHijo() {
        return hijom;
    }

    public void setHijo(Set<Hijom> hijo) {
        this.hijom = hijo;
    }

    public Set<Hijom> getHijom() {
        return hijom;
    }

    public void setHijom(Set<Hijom> hijom) {
        this.hijom = hijom;
    }

    public Hijom getHijou() {
        return hijou;
    }

    public void setHijou(Hijom hijou) {
        this.hijou = hijou;
    }

  

    

    

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }
    
}
