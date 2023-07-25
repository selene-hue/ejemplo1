/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dacastro
 */
public class Estudiante extends Persona {

    private String correoE;
    private String carreraE;

    public Estudiante() {
    }

    public Estudiante(String correoE, String carreraE, String nombrePersona, int edadP, String telefono) {
        super(nombrePersona, edadP, telefono);
        this.correoE = correoE;
        this.carreraE = carreraE;
    }

   
    
    /**
     * Get the value of carreraE
     *
     * @return the value of carreraE
     */
    public String getCarreraE() {
        return carreraE;
    }

    /**
     * Set the value of carreraE
     *
     * @param carreraE new value of carreraE
     */
    public void setCarreraE(String carreraE) {
        this.carreraE = carreraE;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    @Override
    public String toString() {
        return super.toString()+  correoE + "," + carreraE + "\n";
    }

 

   

    
    
}
