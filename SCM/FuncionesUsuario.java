package SCM;

public class FuncionesUsuario {
   
    public double calcImpuesto(int edad, int cantHijos){
       double impuesto = 0;
       double deduccion;
        // condicionamos el impuesto por edad
        if (edad < 18){
             impuesto = 0;
        } 
        else if ( edad >= 18 && edad <= 30 ){
           if (cantHijos > 0) { //comprobamos si tiene hijos
                deduccion = cantHijos * (2000*0.03); // calcculamos el total a deducir
               if (deduccion > 2000/2){ // si excede el maximo permitido, deducimos 50%;
                 impuesto = 2000/2;
               }else{ //sino, calculamos el total del impuesto
                 impuesto = 2000 - deduccion;
               }            
            }
            else { //si no tiene hijos, impuesto igual a franja de edad
                 impuesto = 2000;
           }
        } else if (edad > 30 && edad <= 65){
            if (cantHijos > 0) {
                if (cantHijos > 0) { 
                    deduccion = cantHijos * (7000*0.03); 
                   if (deduccion > 7000/2){ 
                     impuesto = 7000/2;
                   }else{ 
                        impuesto = 7000 - deduccion;
                   }            
                }
                else { 
                impuesto = 7000;
               }
               }
        } else if (edad > 65){
            if (cantHijos > 0) { 
                deduccion = cantHijos * (2000*0.03); 
               if (deduccion > 2000/2){ 
                    impuesto = 2000/2;
               }else{ 
                    impuesto = 2000 - deduccion;
               }            
            }
            else { 
             impuesto = 2000;
           }
        }
        return impuesto;
    }

    
    
}