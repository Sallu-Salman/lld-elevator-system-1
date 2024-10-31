package service;

import constants.Direction;
import lombok.AllArgsConstructor;
import models.Floor;

import java.util.ArrayList;
import java.util.List;

public class ExternalRequestDispatcher {
    List<LiftController> liftControllers;
    DispatcherStrategy dispatcherStrategy;

    public ExternalRequestDispatcher(DispatcherStrategy strategy) {
        dispatcherStrategy = strategy;
        liftControllers = new ArrayList<>();
    }

    public void addLiftController(LiftController liftController) {
        liftControllers.add(liftController);
    }

    public void submitRequest(Floor currentFloor, Direction direction) {
        LiftController liftController = dispatcherStrategy.getLiftController(currentFloor, direction, liftControllers);
        liftController.processExternalRequest(currentFloor, direction);
    }
}
