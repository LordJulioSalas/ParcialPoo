package ParcialPOO.dominio;

public class Material {
    private int codigo;
    private String nombre;
    private int duracion;
    private String tipo;
    private TipoMaterial tipoMaterial;

    public Material(int codigo, String nombre, int duracion, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.tipo = tipo;
        this.tipoMaterial = tipoMaterial;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }
}
