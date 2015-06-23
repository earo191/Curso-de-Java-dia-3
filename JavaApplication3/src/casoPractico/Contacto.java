/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoPractico;

/**
 *
 * @author Administrador
 */
public class Contacto {
    private String NombreApellido;
    private char sexo;
    private int edad;
    private String direccion;
    private String estadoCivil;
    private String empresaTrabajo;
    private String telefono;
    private String email;

    public Contacto() {
        
    }

    public Contacto(String NombreApellido, char sexo, int edad, String direccion, String estadoCivil, String empresaTrabajo, String telefono, String email) {
        this.NombreApellido = NombreApellido;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.empresaTrabajo = empresaTrabajo;
        this.telefono = telefono;
        this.email = email;
    }

    
    public String getNombreApellido() {
        return NombreApellido;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getEmpresaTrabajo() {
        return empresaTrabajo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    
    
    public void setNombreApellido(String NombreApellido) {
        this.NombreApellido = NombreApellido;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setEmpresaTrabajo(String empresaTrabajo) {
        this.empresaTrabajo = empresaTrabajo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre y apellido : "+this.NombreApellido+
                "\nEdad : "+this.edad+
                "\nSexo : "+this.sexo+
                "\nEstado Civil : "+this.estadoCivil+
                "\nTelefono : "+this.telefono+
                "\nEmail : "+this.email+
                "\nDireccion : "+this.direccion+
                "\Empresa donde trabaja : "+this.empresaTrabajo;
                        
    
    }
    
    
    
}
