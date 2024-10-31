package models;

import service.ExternalRequestDispatcher;
import service.LiftController;
import service.MinimumDistanceStrategy;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private static Building instance;
    private List<Floor> floors;
    private List<Lift> lifts;

    private Building() {
        floors = new ArrayList<>();
        lifts = new ArrayList<>();
    }

    public Lift getLift(int i) {
        return lifts.get(i);
    }

    public static Building getInstance() {
        if (instance == null) {
            instance = new Building();
        }
        return instance;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public Floor getFloor(int floorNumber) {
        return floors
                .stream()
                .filter(f -> f.getFloorNumber() == floorNumber)
                .findFirst()
                .orElse(null);
    }
}
