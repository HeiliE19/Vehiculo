/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.auto;
import ico.componentes.Chasis;
import ico.componentes.Llanta;
import ico.componentes.Motor;

/**
 *
 * @author Espinosa
 */
public class Vehículo {
    private String modelo;
    private int puertas;
    private float precio;
    private Llanta llan;
    private Chasis estructura;
    private Motor motor1;
    private Motor motor2;
    
    public Vehículo() {
    }
        
    public Vehículo(String modelo, int puertas, float precio, Llanta llan, Chasis estructura, Motor motor1, Motor motor2) {
        this.modelo= modelo;
        this.puertas = puertas;
        this.precio = precio;
        this.llan = llan;
        this.estructura = estructura;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void encender(){
        System.out.println("Encnendiendo el vehículo modelo: "+this.modelo);
    }
    
    public void avanzar(){
        System.out.println("Avanzando con vehículo modelo: "+this.modelo);
    }
    
    public void apagar(){
        System.out.println("Apagando vehículo modelo: "+this.modelo);
    }
    public Llanta getLlan() {
        return llan;
    }

    public void setLlan(Llanta llan) {
        this.llan = llan;
    }

    public Chasis getEstructura() {
        return estructura;
    }

    public void setEstructura(Chasis estructura) {
        this.estructura = estructura;
    }

    public Motor getMotor1() {
        return motor1;
    }

    public void setMotor1(Motor motor1) {
        this.motor1 = motor1;
    }

    public Motor getMotor2() {
        return motor2;
    }

    public void setMotor2(Motor motor2) {
        this.motor2 = motor2;
    }
    
    
    
}
