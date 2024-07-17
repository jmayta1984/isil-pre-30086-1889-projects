package pe.isil;

public class Piloto {
    private int codigo;
    private String nombre;
    private String apellido;
    private String pais;
    private Escuderia escuderia;

    public Piloto(int codigo, String nombre, String apellido, String pais, Escuderia escuderia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.escuderia = escuderia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido);
        escuderia.mostrarInfo();
    }

}
