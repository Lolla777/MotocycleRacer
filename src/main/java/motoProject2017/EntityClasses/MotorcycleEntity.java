package motoProject2017.EntityClasses;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Ksenia on 13.01.2017.
 */
@Entity
@Table(name = "tmotorycycle")
public class MotorcycleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idmotorcycle")
    private Long IdMoto;

    public Long getIdMoto() {
        return IdMoto;
    }

    public void setIdMoto(Long idMoto) {
        this.IdMoto = idMoto;
    }

    @Column(name = "manufacturer")
    @NotNull
    private Long Manufacturer;

    public Long getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(Long manufacturer) {
        this.Manufacturer = manufacturer;
    }

    @NotNull
    @Column(name = "section")
    private String Model;

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    @NotNull
    @Column(name = "model")
    private String Production;

    public String getProduction() {
        return Production;
    }

    public void setProduction(String production) {
        this.Production = production;
    }

    @NotNull
    @Column(name = "specification")
    private String Specification;

    public String getSpecification() {
        return Specification;
    }

    public void setSpecification(String specification) {
        this.Specification = specification;
    }

    @Column(name = "peculiar_properties")
    private String Properties;

    public String getProperties() {
        return Properties;
    }

    public void setProperties(String properties) {
        this.Properties = properties;
    }

    @NotNull
    @Column(name = "engine")
    private String Engine;

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        this.Engine = engine;
    }

    @NotNull
    @Column(name = "transmission")
    private  String Transmission;

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String transmission) {
        this.Transmission = transmission;
    }
    @NotNull
    @Column(name = "brekes_front")
    private  String Brekes_front;

    public String getBrekes_front() {
        return Brekes_front;
    }

    public void setBrekes_front(String brekes_front) {
        this.Brekes_front = brekes_front;
    }
    @NotNull
    @Column(name = "brekes_rear")
    private String Brekes_rear;

    public String getBrekes_rear() {
        return Brekes_rear;
    }

    public void setBrekes_rear(String brekes_rear) {
        this.Brekes_rear = brekes_rear;
    }

    @NotNull
    @Column(name = "tires_front")
    private String Tires_front;

    public String getTires_front() {
        return Tires_front;
    }

    public void setTires_front(String tires_front) {
        this.Tires_front = tires_front;
    }
    @NotNull
    @Column(name = "tires_rear")
    private String Tires_rear;

    public String getTires_rear() {
        return Tires_rear;
    }

    public void setTires_rear(String tires_rear) {
        this.Tires_rear = tires_rear;
    }
    @NotNull
    @Column(name = "wheelbase")
    private Long Wheelbase;

    public Long getWheelbase() {
        return Wheelbase;
    }

    public void setWheelbase(Long wheelbase) {
        this.Wheelbase = wheelbase;
    }

    @NotNull
    @Column(name = "seat_height")
    private Long Seat;

    public Long getSeat() {
        return Seat;
    }

    public void setSeat(Long seat) {
        this.Seat = seat;
    }

    @NotNull
    @Column(name = "weight")
    private Long Weaght;

    public Long getWeaght() {
        return Weaght;
    }

    public void setWeaght(Long weaght) {
        this.Weaght = weaght;
    }

    @NotNull
    @Column(name = "fullcapacity")
    private Long Fullcapacity;

    public Long getFullcapacity() {
        return Fullcapacity;
    }

    public void setFullcapacity(Long fullcapacity) {
        this.Fullcapacity = fullcapacity;
    }

    @NotNull
    @Column(name = "output")
    private Long Output;

    public Long getOutput() {
        return Output;
    }

    public void setOutput(Long output) {
        this.Output = output;
    }

    @NotNull
    @Column(name = "lenght")
    private Long Lenght;

    public Long getLenght() {
        return Lenght;
    }

    public void setLenght(Long lenght) {
        this.Lenght = lenght;
    }

    @NotNull
    @Column(name = "width")
    private Long Width;

    public Long getWidth() {
        return Width;
    }

    public void setWidth(Long width) {
        this.Width = width;
    }

    @NotNull
    @Column(name = "height")
    private Long Height;

    public Long getHeight() {
        return Height;
    }

    public void setHeight(Long height) {
        this.Height = height;
    }

    @NotNull
    @Column(name = "type")
    private Long Type;

    public Long getType() {
        return Type;
    }

    public void setType(Long type) {
        this.Type = type;
    }

    @NotNull
    @Column(name = "picture_url")
    private String Picture;

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        this.Picture = picture;
    }

    public MotorcycleEntity() {
    }

    public MotorcycleEntity(Long idMoto, Long manufacturer, String model, String production, String specification, String properties, String engine, String transmission, String brekes_front, String brekes_rear, String tires_front, String tires_rear, Long wheelbase, Long seat, Long weaght, Long fullcapacity, Long output, Long lenght, Long width, Long height, Long type, String picture) {
        this.IdMoto=idMoto;
        this.Manufacturer = manufacturer;
        this.Model = model;
        this.Production = production;
        this.Specification = specification;
        this.Properties = properties;
        this.Engine = engine;
        this.Transmission = transmission;
        this.Brekes_front = brekes_front;
        this.Brekes_rear = brekes_rear;
        this.Tires_front = tires_front;
        this.Tires_rear = tires_rear;
        this.Wheelbase = wheelbase;
        this.Seat = seat;
        this.Weaght = weaght;
        this.Fullcapacity = fullcapacity;
        this.Output = output;
        this.Lenght = lenght;
        this.Width = width;
        this.Height = height;
        this.Type = type;
        this.Picture = picture;
    }
}
