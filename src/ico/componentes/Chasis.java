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
public class Chasis {

        private String vin;
	private String transmision;
	private String color;
        
	public Chasis() {

}
	public Chasis (String v, String t, String c) {
	this.vin = v;
	this.transmision= t;
	this.color= c;
}

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void sostenerVehículo() {
        System.out.println("Sosteniendo vehículo");
    }
    
    public void darForma(){
        System.out.println("Formando vehículo ");
        
}
}
