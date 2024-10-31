package service;

import constants.Direction;
import lombok.AllArgsConstructor;
import models.Floor;
import models.Lift;

@AllArgsConstructor
public class LiftController {
    private int id;
    private Lift lift;


    public void processExternalRequest(Floor floor, Direction direction) {
        // TODO: using lift status assign action
    }

    public void processInternalRequest(Floor targetFloor) {
        // TODO: using lift status assign action
    }
}
