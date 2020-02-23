/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.componentes;

/**
 *
 * @author Espinosa
 */
public class Llanta {
	private int rin;
	private int capacidad;
	private String marca;
        
	public Llanta() {

}
	public Llanta (int r, int c, String m) {
	this.rin = r;
	this.capacidad= c;
	this.marca= m;
}

    public int getRin() {
        return rin;
    }

    public void setRin(int rin) {
        this.rin = rin;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void girar(){
        System.out.println("Girando llantas...");
    }

}   
