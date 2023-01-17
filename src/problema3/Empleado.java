package problema3;

import java.util.Scanner;

/**
 *
 * @author juan carlos, Ulices Calderon y Maria Ingrid 
 */
public class Empleado extends Persona {

    private String cargo;
    private double salario;
    Scanner entrada = new Scanner(System.in);
    
    public Empleado(){
        super();
    }

    public Empleado(int cedula, String primerNombre, String primerApellido, String segundoApellido, int telefono, int celular, String cargo, double salario) {
        super(cedula, primerNombre, primerApellido, segundoApellido, telefono, celular);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
         
        this.salario = salario;
    }

    

    @Override
    public String imprimir() {

        return """
               \n
               -----------------------------------------------
               solicitud de prestamos para empleados
               -----------------------------------------------
               
               """
                + "la cedula es: " +getCedula() + "\n"
                + "primer nombre : " +getPrimerApellido() + "\n"
                + "primer apellido ; " +getPrimerApellido() + "\n"
                + "segundo apellido : " +getSegundoApellido() + "\n"
                + "telefono : " +getTelefono() + "\n"
                + "celular : " +getCelular() + "\n"
                + "cargo : " +getCargo() + "\n"
                + "salario : " +getSalario();

    }

}
