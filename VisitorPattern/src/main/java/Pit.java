import Mechanics.PetrolPumpMechanic;
import Mechanics.WheelsMechanic;

import PitOperations.FormulaOnePitOperation;
import PitOperations.PetrolFilling;
import PitOperations.WheelsReplacement;

public class Pit {
    public static void main(String[] args) {
        FormulaOnePitOperation petrolFilling = new PetrolFilling();
        FormulaOnePitOperation wheelsReplacement = new WheelsReplacement();
        petrolFilling.perform();
        petrolFilling.accept(new PetrolPumpMechanic());
        wheelsReplacement.perform();
        wheelsReplacement.accept(new WheelsMechanic());
    }
}
