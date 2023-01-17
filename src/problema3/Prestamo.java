package problema3;

import java.util.Date;
import java.time.LocalDate;
import javax.naming.InsufficientResourcesException;

/**
 *
 * @author juan carlos, Ulices Calderon, Maria Avila
 */
public class Prestamo extends Persona {

    LocalDate fechaPrestamo;
    private double monto;
    private int numCuotas;
    public LocalDate fechaHoy = LocalDate.now();
    //public static LocalDate fechaMaxima;
    
    
    
    public Prestamo(){
        super();
    }
    public Prestamo(int cedula, String primerNombre, String primerApellido, String segundoApellido, int telefono, int celular, LocalDate fechaPrestamo, double monto, int numCuotas) {
        super(cedula, primerNombre, primerApellido, segundoApellido, telefono, celular);
        this.fechaPrestamo = fechaPrestamo;
        this.monto = monto;
        this.numCuotas = numCuotas;
    }
    

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNumCuotas() {
        return numCuotas;
    }

    public void setNumCuotas(int numCuotas) {
        this.numCuotas = numCuotas;
    }
    
    //metodo para calcular si el monto es mayor a 100000 se autoriza el prestamo 3 dias despues
    public void solicitarPrestamo(LocalDate fechaPrestamo, double monto, int numCuotas){
       if(getMonto()>100000){
           System.out.println("""
                              ########################################################
                              ##       fecha de aprobacion de su credito            ##
                              ########################################################
                              """);
           System.out.println("fecha de solicitud "+getFechaPrestamo());
           System.out.println("su prestamo se hara efectivo los tres dias siguientes a su solicitud : "+getFechaPrestamo().plusDays(3));
           System.out.println("pago diferido en : "+getNumCuotas()+" cuotas");
           System.out.println("-------------------------------------------------------");
           System.out.println("se genera las fechas de pago de sus cuotas mes a mes");
           System.out.println("-------------------------------------------------------");
           
           //imprimo las fechas pago de las cuotas que ingreso el usuario
           double calculo = getMonto()/getNumCuotas();//obtengo el valor prestado y lo divido por el numero de cuotas
           
           //double calculoRedondeado = Math.round(calculo*100.0)/100.0;
           double calculoRedondeado = Math.ceil(calculo);
           int cuota = getNumCuotas()+1; //obtengo el numero de cuotas ingresadas
           int []cuotas = new int[cuota]; //lleno un arreglo con las cuotas obtenidas
           for(int i= 1; i<cuotas.length; i++){
               System.out.println("cuota numero :  "+i+"  fecha a pagar : "+getFechaPrestamo().plusMonths(i)+"    por valor de : "+calculoRedondeado);//imprimo las cuotas a pagar cada mes
           }
           //System.out.println("la fecha de pago de su primera cuota es : "+getFechaPrestamo().plusMonths(1));
       }else{
           System.out.println("""
                              ########################################################
                              ##       fecha de aprobacion de su credito            ##
                              ########################################################
                              """);
           System.out.println("su credito se aprobara hoy mismo : "+getFechaPrestamo());
           System.out.println("pago diferido en  : "+getNumCuotas()+" cuotas");
           System.out.println("----------------------------------------------------------");
           System.out.println("se calculan los pagos de sus coutas mes a mes : ");
           System.out.println("----------------------------------------------------------");
           
           //imprimo las fechas pago de las cuotas que ingreso el usuario
           double calculo = getMonto()/getNumCuotas();//obtengo el valor prestado y lo divido por el numero de cuotas
           
           //double calculoRedondeado = Math.round(calculo*100.0)/100.0;
           //double calculoRedondeado = Math.ceil(calculo);
           int calculoRedondeado = (int)Math.ceil(calculo);//convierto a entero el resultado
           int cuota = getNumCuotas()+1; //obtengo el numero de cuotas ingresadas
           int []cuotas = new int[cuota]; //lleno un arreglo con las cuotas obtenidas
           for(int i= 1; i<cuotas.length; i++){
               
               System.out.println("cuota numero :  "+i+"   fecha a pagar : "+getFechaPrestamo().plusMonths(i)+"    por valor de : "+calculoRedondeado);//imprimo las cuotas a pagar cada mes
           }
           //imprimo las cuotas a pagar segun el numero de cuotas escogido por el usuario
           
       }
        
        
    }

    public String imprimir() {

        return """
                \n---------------------------------------------------------
                prestamo aprobado
                -----------------------------------------------------------
                """
                +"titular del prestamo : "+"\n"
                + "cedula : " + getCedula() + "\n"
                + "primer nombre: " + getPrimerNombre() + "\n"
                + "primer apellido ; " + getPrimerApellido() + "\n"
                + "segundo apellido : " + getSegundoApellido() + "\n"
                + "telefono : " + getTelefono() + "\n"
                + "celular : " + getCelular() + "\n"
                + "la fecha de solicitud del prestamo : " +fechaHoy + "\n"
               // + "se genero la fecha de aprobacion para "+getFechaPrestamo()+"\n"
                + "Monto aprobado :" + getMonto() + "\n";
                //+ "numero de cuotas a pagar : " + getNumCuotas()+"\n"
                //+ "fecha de pago de su primer cuota es ";

    }

}
