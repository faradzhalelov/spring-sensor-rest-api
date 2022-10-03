package com.dzhelelov.springrestapp.repositories;

import com.dzhelelov.springrestapp.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementsRepository extends JpaRepository<Measurement, Integer>
{
}
