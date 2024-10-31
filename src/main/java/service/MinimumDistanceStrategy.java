package service;

import constants.Direction;
import models.Floor;

import java.util.List;

public class MinimumDistanceStrategy implements DispatcherStrategy{
    @Override
    public LiftController getLiftController(Floor currentFloor, Direction direction, List<LiftController> liftControllers) {
        // TODO: assign a lift controller from the list of lift controllers
        return liftControllers.get(0);
    }
}
