package models;

import constants.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import service.LiftController;

@Getter
public class Lift {
    private int id;
    private InternalButton internalButton;
    private Status status;
    private Floor currentFloor;
    @Setter
    private LiftController liftController;

    public Lift() {
        internalButton = new InternalButton();
        status = Status.IDLE;
    }

    public void pressFloorButton(int floorNumber) {
        Building building = Building.getInstance();
        Floor targetFloor = building.getFloor(floorNumber);
        internalButton.requestTargetFloor(targetFloor, liftController);
    }



}
