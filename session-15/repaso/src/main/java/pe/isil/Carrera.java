package pe.isil;

public class Carrera {
    private String codigo;
    private String nombre;
    private int temporada;
    private String circuito;
    private String ciudad;
    private String pais;

    public Carrera(String codigo, String nombre, int temporada, String circuito, String ciudad, String pais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.temporada = temporada;
        this.circuito = circuito;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void mostrarInfo() {
        System.out.println("Carrera: " + nombre);
        System.out.println("Temporada: " + temporada);
        System.out.println("Circuito: " + circuito);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("País: " + pais);
    }

}
