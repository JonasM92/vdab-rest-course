package be.vdab.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jeansmits on 06/07/15.
 */
@Entity
@XmlRootElement
public class Car {
    public Car() {
    }

    public Car(String brand, String model, String color, String engine, int pk, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.pk = pk;
        this.licensePlate = licensePlate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String brand;
    private String model;
    private String color;

    private String engine;
    private int pk;

    private String licensePlate;



//    Getters and Setters
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public String getEngine() {return engine;}
    public void setEngine(String engine) {this.engine = engine;}
    public int getPk() {return pk;}
    public void setPk(int pk) {this.pk = pk;}
    public String getLicensePlate() {return licensePlate;}
    public void setLicensePlate(String licensePlate) {this.licensePlate = licensePlate;}
}
