package PitOperations;

import Mechanics.Mechanic;

public class PetrolFilling implements FormulaOnePitOperation {
    private int petrolLevels;

    public void perform() {
        System.out.print("Filling the tank as we always do...");
    }

    public void accept(Mechanic visitor) {
        visitor.visit(this);
    }

    public int dangerLevel() {
        return petrolLevels;
    }
}
