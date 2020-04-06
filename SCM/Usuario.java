package SCM;
//Definimos clase usuarios

public class Usuario{
    private String nombre; 
    private String cedula; 
    private String contrasena; 
    private int edad; 
    private int cantHijos; 
    private double saldo; 

     // Definimos el constructor
     public Usuario(String nombre, String cedula, String contrasena, int edad, int cantHijos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contrasena = contrasena;
        this.edad = edad;
        this.cantHijos = cantHijos;
        this.saldo = 0;
    }

    // Metodos getter
public String getNombre() {
    return nombre;
}
public String getContrasena(){
    return contrasena;
}
public String getCedula(){
    return cedula;
}
public int getCantHijos(){
    return cantHijos;
}
public int getEdad() {
    return edad;
}
public double getSaldo(){
    return saldo;
}

    // Metodos setter
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setContrasena(String contrasena){
    this.contrasena = contrasena;
}
public void setCedula(String cedula){
    this.cedula = cedula;
}
public void setCantHijos(int cantHijos){
    this.cantHijos = cantHijos;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public void setSaldo(double saldo){
    this.saldo = saldo; 
}  
}