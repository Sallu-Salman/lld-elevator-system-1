package models;

import service.LiftController;

public class InternalButton {

    public void requestTargetFloor(Floor floor, LiftController liftController) {
        liftController.processInternalRequest(floor);
    }
}
