package models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Floor {
    @Getter
    private int floorNumber;
    private ExternalButton externalButton;

    public void clickUpButton() {
        externalButton.requestUp(this);
    }

    public void clickDownButton() {
        externalButton.requestDown(this);
    }


}
