package models;

import constants.Direction;
import lombok.AllArgsConstructor;
import service.ExternalRequestDispatcher;

@AllArgsConstructor
public class ExternalButton {
    private ExternalRequestDispatcher dispatcher;

    public void requestUp(Floor floor) {
        dispatcher.submitRequest(floor, Direction.UP);
    }

    public void requestDown(Floor floor) {
        dispatcher.submitRequest(floor, Direction.DOWN);
    }
}
