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
public class Persona {

    private String nombrePersona;
     private int edadP;
    private String telefono;
   

    public Persona() {
    }

    public Persona(String nombrePersona, int edadP, String telefono) {
        this.nombrePersona = nombrePersona;
        this.edadP = edadP;
        this.telefono = telefono;
    }

    public int getEdadP() {
        return edadP;
    }

    public void setEdadP(int edadP) {
        this.edadP = edadP;
    }

  

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Get the value of nombrePersona
     *
     * @return the value of nombrePersona
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Set the value of nombrePersona
     *
     * @param nombrePersona new value of nombrePersona
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String toString() {
        return nombrePersona + "," + edadP + "," + telefono +",";
    }

  

}
