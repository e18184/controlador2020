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
public class Materias {
 
    private String sigla;
    private String NombreMat;

    public Materias(String sigla, String NombreMat) {
        this.sigla = sigla;
        this.NombreMat = NombreMat;
    }
    
    public Materias(){
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombreMat() {
        return NombreMat;
    }

    public void setNombreMat(String NombreMat) {
        this.NombreMat = NombreMat;
    }

    @Override
    public String toString() {
        return "Materias{" + "sigla=" + sigla + ", NombreMat=" + NombreMat + '}';
    }
    
    
}
