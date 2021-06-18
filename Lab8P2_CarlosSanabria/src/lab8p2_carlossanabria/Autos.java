/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_carlossanabria;

import java.io.Serializable;

/**
 *
 * @author HP1
 */
public class Autos implements Serializable{
    private String categegoria;
    private int VIN;
    private String marca,tipo;
    private int num_puertas;
    private String color,motor;
    private double precio;
    private String tipo_h;
    private int cantidad_p,tiempo;
    private static final long SerialVersionUID=789L;

    public Autos(String categegoria, int VIN, String marca, String tipo, int num_puertas, String color, String motor, double precio, String tipo_h, int cantidad_p, int tiempo) {
        this.categegoria = categegoria;
        this.VIN = VIN;
        this.marca = marca;
        this.tipo = tipo;
        this.num_puertas = num_puertas;
        this.color = color;
        this.motor = motor;
        this.precio = precio;
        this.tipo_h = tipo_h;
        this.cantidad_p = cantidad_p;
        this.tiempo = tiempo;
    }

    public String getCategegoria() {
        return categegoria;
    }

    public void setCategegoria(String categegoria) {
        this.categegoria = categegoria;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo_h() {
        return tipo_h;
    }

    public void setTipo_h(String tipo_h) {
        this.tipo_h = tipo_h;
    }

   

    public int getCantidad_p() {
        return cantidad_p;
    }

    public void setCantidad_p(int cantidad_p) {
        this.cantidad_p = cantidad_p;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Autos{" + "categegoria=" + categegoria + ", VIN=" + VIN + ", marca=" + marca + ", tipo=" + tipo + ", num_puertas=" + num_puertas + ", color=" + color + ", motor=" + motor + ", precio=" + precio + ", tipo_h=" + tipo_h + ", cantidad_p=" + cantidad_p + ", tiempo=" + tiempo + '}';
    }
    
    
}
