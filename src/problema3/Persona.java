package problema3;

/**
 *
 * @author juan carlos, Maria Avila, Ulices Calderon
 */
public class Persona {

    private int cedula;
    private String primerNombre;
    private String primerApellido;
    private String segundoApellido;
    private int telefono;
    private int celular;

    public Persona() {
    }

    public Persona(int cedula, String primerNombre, String primerApellido, String segundoApellido, int telefono, int celular) {
        this.cedula = cedula;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.celular = celular;
    }
    //creamos los getters and setters aqui

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    

    //y por ultimo creamos el metodo para imprimir de la clase persona
    public String imprimir() {

        return "\nla cedula es: " + getCedula() + "\n"
                + "primer nombre : " + getPrimerNombre() + "\n"
                + "primer apellido ; " + getPrimerApellido() + "\n"
                + "segundo apellido : " + getSegundoApellido() + "\n"
                + "telefono : " + getTelefono() + "\n"
                + "celular : " + getCelular();

    }

}
