package ParcialPOO.dominio;

import punto1.dominio.Producto;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {
    public static final int CAPACIDAD = 15;
    private List<Material> materiales;

    public Pooflix(List<Material> materiales) {
        this.materiales = new ArrayList<>();
    }
    //Metodos del dominio
    public boolean agregar(Material m){

        for (Material material:this.materiales) {
            if (m.getCodigo()==m.getCodigo()){
                return false;
            }else{
                materiales.add(m);
            }

        }
        return true;
    }
    public boolean retirar(int codigo){
        for (Material material:this.materiales){
            if (material.getCodigo()== codigo) {
                materiales.remove(material);
                return true;
            }

        }
        return false;

    }
    public Material buscar(int codigo){

        Material material = this.materiales.stream().filter(m -> m.getCodigo() == codigo).findFirst().orElse(null);

        return material;

    }
    public Material buscar(String nombre){

        Material material = this.materiales.stream().filter(m -> m.getNombre().equalsIgnoreCase(nombre)).findFirst().orElse(null);

        return material;
    }

    public List<Material> buscarPorTipo(String tipo){

        List<Material> porTipo = new ArrayList<>();

        for (Material material:this.materiales) {
            if (material.getTipoMaterial().equals(tipo)) {
                porTipo.add(material);

            }

        }
        return porTipo;



    }

    public int calcularDuracionTotal(){

        return 0;
    }
    public List<Material> ordenarPorCodigo(){
        return null;
    }





    //Metodo no dominio(Getters & Setters)

    public static int getCANTIDAD() {
        return CAPACIDAD;
    }

    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }
}
