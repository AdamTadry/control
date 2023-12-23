package service;

import org.springframework.stereotype.Service;
import service.dtos.CarDTO;

import java.util.List;

public interface CarManager {


        public CarDTO getCarByModel(String model) ;

        public CarDTO getCarByModelAndPrice(String model, Float price) ;

        public CarDTO saveCar(CarDTO carDTO) ;

        public CarDTO DeleteCar(CarDTO carDTO) ;

    CarDTO deleteCar(Long id);
}

