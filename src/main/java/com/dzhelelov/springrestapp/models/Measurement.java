package com.dzhelelov.springrestapp.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "measurement")
public class Measurement
{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "value")
    @NotEmpty(message = "value cant be empty")
    @Size(min = -100, max = 100, message = "value must be between -100 to 100")
    private Double value;

    @Column(name = "raining")
    @NotNull
    private Boolean raining;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "sensor", referencedColumnName = "name")
    private Sensor sensor;

    @Column(name = "measurement_time")
    private LocalDateTime measurementTime;

    public Measurement(Double value, Boolean raining, Sensor sensor) {
        this.value = value;
        this.raining = raining;
        this.sensor = sensor;
    }

    public Measurement()
    {
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Double getValue()
    {
        return value;
    }

    public void setValue(Double value)
    {
        this.value = value;
    }

    public Boolean isRaining()
    {
        return raining;
    }

    public void setRaining(Boolean raining)
    {
        this.raining = raining;
    }

    public Sensor getSensor()
    {
        return sensor;
    }

    public void setSensor(Sensor sensor)
    {
        this.sensor = sensor;
    }

    public LocalDateTime getMeasurementTime()
    {
        return measurementTime;
    }

    public void setMeasurementTime(LocalDateTime measurementTime)
    {
        this.measurementTime = measurementTime;
    }
}
