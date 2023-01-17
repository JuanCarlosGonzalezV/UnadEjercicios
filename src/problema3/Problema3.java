package problema3;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;

/**
 *
 * @author juan carlos, Ulices Calderon, Maria Avila
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada, entradaNum, entradaDob;
        LocalDate fechaActual, fechaMaxima, fechaIngresada;
        //parac capturar los datos de strings y otra para capturar los datos numericos
        entrada = new Scanner(System.in);
        entradaNum = new Scanner(System.in);
        entradaDob = new Scanner(System.in);
        fechaActual = LocalDate.now();//obtengo la fecha actual del sistema
        fechaMaxima = fechaActual.plusMonths(1);//sumo 1 mes a la fecha actual

        //creo una instancia de la clase prestamo vacia
        Prestamo pre1 = new Prestamo();
        String anio, mes, dia; //para pasar como formato de fecha

        //declaro variables auxiliares para llenar los datos de la persona que solicita prestamo
        int cedula;
        String primerNombre;
        String primerApellido;
        String segundoApellido;
        int telefono;
        int celular;
        double monto;
        int cuotas;

        //ingrese sus datos personale
        boolean fechaEsValida = true;

        while (fechaEsValida) {

            try {
                System.out.println("""
                           #################################################
                           # solicitud  prestamo
                           #################################################
                           """);
                System.out.println("numero de cedula  ");//
                cedula = entradaNum.nextInt();
                System.out.println("Ingrese su nombre");
                primerNombre = entrada.nextLine();
                System.out.println("Ingrese su apellido");
                primerApellido = entrada.nextLine();
                System.out.println("Ingrese su segundo apellido");
                segundoApellido = entrada.nextLine();
                System.out.println("Ingrese su telefono");
                telefono = entradaNum.nextInt();
                System.out.println("Ingrese su numero celular");
                celular = entradaNum.nextInt();
                System.out.println("Ingrese el monto del prestamo");
                monto = entradaDob.nextDouble();
                System.out.println("a cuantas cuotas va a diferir");
                cuotas = entradaNum.nextInt();
                //llenamos la intancia de la clase prestamo con los datos capturados
                pre1.setCedula(cedula);
                pre1.setPrimerNombre(primerNombre);
                pre1.setPrimerApellido(primerApellido);
                pre1.setSegundoApellido(segundoApellido);
                pre1.setTelefono(telefono);
                pre1.setCelular(celular);
                pre1.setFechaPrestamo(fechaActual);
                pre1.setMonto(monto);
                pre1.setNumCuotas(cuotas);//
                System.out.println("""
                           #################################################
                           # solicitud fecha prestamo
                           #################################################
                           """);
                System.out.println("fecha maxima habil para prestamos calculada a un mes: " + fechaActual + " a " + fechaMaxima);
                System.out.println("ingrese la fecha maxima para la autorizacion de su prestamo");
                System.out.println("ingrese año en numeros");
                anio = entrada.nextLine();
                System.out.println("ingrese mes en numeros");
                mes = entrada.nextLine();
                System.out.println("ingrese dia en numeros");
                dia = entrada.nextLine();
                String fechaScan = anio + "-" + mes + "-" + dia;
                fechaIngresada = LocalDate.parse(fechaScan);
                /**
                 * pedimos los datos personales
                 */

                //si la fecha es mayor o menor a la expuesta en pantalla vuelve a pedir la fecha
                if (fechaIngresada.isBefore(fechaMaxima) && fechaIngresada.isAfter(fechaActual)) {
                    System.out.println("fecha valida");
                    pre1.solicitarPrestamo(fechaActual, pre1.getMonto(), pre1.getNumCuotas());
                    System.out.println(pre1.imprimir());
                    /**
                     * si quiero para aqui el programa hago uso del break o
                     * esmayor= false
                     */
                    //break;
                    //esMayor = false;

                } else {

                    System.out.println("""
                                   **************************************************
                                   *   fecha incorrecta intente nuevamente          *
                                   **************************************************
                                   """);

                }
                //pedimos que ingresen un numero para salir del programa
                System.out.println("### Para salir del programa escriba el numero 1 ###");
                System.out.println("### para continuar oprima cualquier tecla ###");
                String salida = entrada.nextLine();
                if (salida.equals("1")) {
                    fechaEsValida = false;
                    System.exit(0);
                    
                }
                //capturamos el error InputMismatchException
            } catch (InputMismatchException e) {
                System.out.println("""
                                   *************************************************************
                                   *   Error grave, excedio los numeros permitidos en telefono *
                                   *   o ingreso letras en lugar de numeros vuelva a empezar   *
                                   *************************************************************
                                   """);
                e.printStackTrace();
                System.exit(0);
            }catch(DateTimeParseException ex){//capturamos error en caso de ingresa mal la fecha
                System.out.println("error al ingresar la fecha");
                ex.printStackTrace();
                System.exit(0);
            }
        }
    }

}
