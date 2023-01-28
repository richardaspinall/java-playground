package PitOperations;

import Mechanics.Mechanic;

public class WheelsReplacement implements FormulaOnePitOperation {
    private int presureIndicator;
    public void perform() {
        System.out.print("Changing the wheels as we always do...");
    }
    public void accept(Mechanic visitor) {
        visitor.visit(this);
    }
    public int dangerLevel() {
        return presureIndicator;
    }
}
