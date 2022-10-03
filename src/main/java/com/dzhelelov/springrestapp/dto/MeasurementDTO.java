package com.dzhelelov.springrestapp.dto;

import com.dzhelelov.springrestapp.models.Sensor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MeasurementDTO
{

    @NotEmpty(message = "value cant be empty")
    @Size(min = -100, max = 100, message = "value must be between -100 to 100")
    private Double value;

    @NotNull
    private Boolean raining;

    @NotNull
    private Sensor sensor;

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
}
