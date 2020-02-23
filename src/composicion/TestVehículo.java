/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;
import ico.componentes.Chasis;
import ico.componentes.Llanta;
import ico.fes.auto.Vehículo;
import ico.componentes.Motor;
/**
 *
 * @author Espinosa
 */
public class TestVehículo {
    public static void main(String[] args) {
        Vehículo auto1= new Vehículo();
        auto1.setModelo("Civic");
        auto1.setPuertas(4);
        auto1.setPrecio(300564.5f);
        auto1.setLlan(new Llanta(15, 680, "Pirelli"));
        auto1.setEstructura(new Chasis("SHHFK2760CU003289", "Automática", "Gris"));
        auto1.setMotor1(new Motor(6, "Gasolina", "Chispa"));
        
        System.out.println("Modelo del vehículo: " +auto1.getModelo());
        System.out.println("Puertas del vehículo: " +auto1.getPuertas());
        System.out.println("Precio del vehículo: "+auto1.getPrecio());
        System.out.println("Tamaño del rin de llantas: "+auto1.getLlan().getRin()+" pulgadas");
        System.out.println("Capacidad de carga de llantas: "+auto1.getLlan().getCapacidad()+" kg");
        System.out.println("Marca de llantas: "+auto1.getLlan().getMarca());
        System.out.println("VIN de chasis: "+auto1.getEstructura().getVin());
        System.out.println("Tipo de transmision de chasis: "+auto1.getEstructura().getTransmision());
        System.out.println("Color de chasis: "+auto1.getEstructura().getColor());
        System.out.println("Cilindros de motor: "+auto1.getMotor1().getCilindros());
        System.out.println("Combustible de motor: "+auto1.getMotor1().getCombustible());
        System.out.println("Encendido de motor: "+auto1.getMotor1().getEncendido());
        auto1.encender();
        auto1.apagar();
        auto1.avanzar();    
        auto1.getLlan().girar();
        auto1.getMotor1().encender();
        auto1.getMotor1().transformarEnergia();
        auto1.getEstructura().darForma();
        auto1.getEstructura().sostenerVehículo();
        System.out.println("\n");
        
        Vehículo auto2= new Vehículo();
        auto2.setModelo("Ibiza");
        auto2.setPuertas(4);
        auto2.setPrecio(230560.3f);
        auto2.setLlan(new Llanta(14, 600, "Firestone"));
        auto2.setEstructura(new Chasis("VSSZZZ6JZAR035500", "Automática", "Negro"));
        auto2.setMotor2(new Motor(4, "Diésel", "Compresion"));
        
        System.out.println("Modelo del vehículo: " +auto2.getModelo());
        System.out.println("Puertas del vehículo: " +auto2.getPuertas());
        System.out.println("Precio del vehículo: "+auto2.getPrecio());
        System.out.println("Tamaño del rin de llantas: "+auto2.getLlan().getRin()+" pulgadas");
        System.out.println("Capacidad de carga de llantas: "+auto2.getLlan().getCapacidad()+" kg");
        System.out.println("Marca de llantas: "+auto2.getLlan().getMarca());
        System.out.println("VIN de chasis: "+auto2.getEstructura().getVin());
        System.out.println("Tipo de transmision de chasis: "+auto2.getEstructura().getTransmision());
        System.out.println("Color de chasis: "+auto2.getEstructura().getColor());
        System.out.println("Cilindros de motor: "+auto2.getMotor2().getCilindros());
        System.out.println("Combustible de motor: "+auto2.getMotor2().getCombustible());
        System.out.println("Encendido de motor: "+auto2.getMotor2().getEncendido());
        auto2.encender();
        auto2.apagar();
        auto2.avanzar();
        auto2.getMotor2().encender();
        auto2.getMotor2().transformarEnergia();
        auto2.getEstructura().darForma();
        auto2.getEstructura().sostenerVehículo();
         }
        }