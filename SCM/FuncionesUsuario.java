package SCM;

import java.util.Scanner;

public class FuncionesUsuario {
    public static void main() {
        Scanner sc = new Scanner(System.in); //Se crea el lector
        String nombre, cedula, contrasena;        
        int edad, cantHijos, saldo, proceso = 1;

        while (proceso > 0){

        System.out.println("Por favor ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Por favor ingrese su cedula");
        cedula = sc.nextLine();
        System.out.println("Por favor ingrese su contraseña");
        contrasena = sc.nextLine();
        System.out.println("Por favor ingrese su edad");
        edad = sc.nextInt();
        System.out.println("Por favor ingrese cantidad de hijos");
        cantHijos = sc.nextInt();        
        Usuario actUsuario = new Usuario(nombre, cedula, contrasena, edad, cantHijos);
        if (actUsuario.equals(actUsuario) == false){
            System.out.println("El nro de cedula ingresado ya existe, por favor intentelo de nuevo");
        }else{
            System.out.println("Por favor ingrese su ingreso nominal");
            saldo = sc.nextInt();
            double impuesto = calcImpuesto(edad, cantHijos);
            System.out.println("Su sueldo neto es: " + cobroSueldo(saldo, impuesto));
        }
        System.out.println("Desea iniciar el proceso nuevamente, indique 1 para continuar y 0 para salir.");
        proceso = sc.nextInt(); 
        while (((Object)proceso).getClass().getSimpleName() == "Integer"){
            System.out.println("El valor ingresado no es correcto, indique 1 para continuar y 0 para salir");   
            proceso = sc.nextInt();
        }
    }
}

    public static double calcImpuesto(int edad, int cantHijos) {
        double impuesto = 0;
        double deduccion;
        // condicionamos el impuesto por edad
        if (edad < 18) {
            impuesto = 0;
        } else if (edad >= 18 && edad <= 30) {
            if (cantHijos > 0) { // comprobamos si tiene hijos
                deduccion = cantHijos * (2000 * 0.03); // calcculamos el total a deducir
                if (deduccion > 2000 / 2) { // si excede el maximo permitido, deducimos 50%;
                    impuesto = 2000 / 2;
                } else { // sino, calculamos el total del impuesto
                    impuesto = 2000 - deduccion;
                }
            } else { // si no tiene hijos, impuesto igual a franja de edad
                impuesto = 2000;
            }
        } else if (edad > 30 && edad <= 65) {
            if (cantHijos > 0) {
                if (cantHijos > 0) {
                    deduccion = cantHijos * (7000 * 0.03);
                    if (deduccion > 7000 / 2) {
                        impuesto = 7000 / 2;
                    } else {
                        impuesto = 7000 - deduccion;
                    }
                } else {
                    impuesto = 7000;
                }
            }
        } else if (edad > 65) {
            if (cantHijos > 0) {
                deduccion = cantHijos * (2000 * 0.03);
                if (deduccion > 2000 / 2) {
                    impuesto = 2000 / 2;
                } else {
                    impuesto = 2000 - deduccion;
                }
            } else {
                impuesto = 2000;
            }
        }
        return impuesto;
    }

    public static double cobroSueldo(int saldo, double impuesto) {
        double sueldo = saldo - impuesto; 
        return sueldo; 
    }

    
    
}