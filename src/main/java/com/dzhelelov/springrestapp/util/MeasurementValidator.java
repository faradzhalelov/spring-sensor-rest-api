package com.dzhelelov.springrestapp.util;

import com.dzhelelov.springrestapp.models.Measurement;
import com.dzhelelov.springrestapp.services.MeasurementService;
import com.dzhelelov.springrestapp.services.SensorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class MeasurementValidator implements Validator
{
    private final SensorsService sensorsService;

    @Autowired
    public MeasurementValidator(SensorsService sensorsService)
    {
        this.sensorsService = sensorsService;
    }

    @Override
    public boolean supports(Class<?> clazz)
    {
        return MeasurementService.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors)
    {
        Measurement measurement = (Measurement) target;

        if (measurement.getSensor() == null)
        {
            return;
        }

        if (sensorsService.findByName(measurement.getSensor().getName()).isEmpty()) {
            errors.rejectValue("sensor", "", "No sensor with such name");
        }

    }
}
