/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import dominio.Madrem;


/**
 *
 * @author HAUSE
 */
public class Hijom {
    private String cih;
    private String nombre;
    private String ap;
    private String am;
    private Madrem madre;

    public Madrem getMadre() {
        return madre;
    }

    public void setMadre(Madrem madre) {
        this.madre = madre;
    }

    public String getCih() {
        return cih;
    }

    public void setCih(String cih) {
        this.cih = cih;
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
