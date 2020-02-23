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
public class Motor {
        private int cilindros;
	private String combustible;
	private String encendido;
        
	public Motor() {

}
	public Motor (int c, String co, String e) {
	this.cilindros = c;
	this.combustible= co;
	this.encendido = e;
}

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getEncendido() {
        return encendido;
    }

    public void setEncendido(String encendido) {
        this.encendido = encendido;
    }
        public void encender(){
            System.out.println("Encendiendo motor...");
        }
       public void transformarEnergia(){
           System.out.println("Motor transformando energía...");
       }
               }
