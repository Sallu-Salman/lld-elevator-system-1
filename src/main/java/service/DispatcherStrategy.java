package service;

import constants.Direction;
import models.Floor;

import java.util.List;

public interface DispatcherStrategy {
    LiftController getLiftController(Floor currentFloor, Direction direction, List<LiftController> liftControllers);
}
