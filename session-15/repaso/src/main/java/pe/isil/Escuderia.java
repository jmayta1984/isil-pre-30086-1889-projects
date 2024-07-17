package pe.isil;

public class Escuderia {
    private int codigo;
    private String nombre;
    private String pais;
    
    public Escuderia(int codigo, String nombre, String pais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void mostrarInfo() {
        System.out.println("Escuderia: " + nombre);
        System.out.println("País: " + pais);
    }
}
