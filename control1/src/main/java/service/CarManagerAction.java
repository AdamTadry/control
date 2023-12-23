
package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CarManager;
import service.dtos.CarDTO;


@Service
public class CarManagerAction implements CarManager {

    @Autowired
    private CarManager carManager;

    @Override
    public CarDTO getCarByModel(String model) {
        return carManager.getCarByModel(model);
    }

    @Override
    public CarDTO getCarByModelAndPrice(String model, Float price) {
        return carManager.getCarByModelAndPrice(model, price);
    }

    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        if (isMatriculeUnique(carDTO.getMatricul())) {
            return carManager.saveCar(carDTO);
        } else {
            return null;
        }
    }

    @Override
    public CarDTO DeleteCar(CarDTO carDTO) {
        return null;
    }

    @Override
    public CarDTO deleteCar(Long id) {
        return carManager.deleteCar(id);
    }

    private boolean isMatriculeUnique(String matricule) {
        return true;
    }
}
