package Mechanics;

import PitOperations.FormulaOnePitOperation;

public class PetrolPumpMechanic implements Mechanic {
    public void visit(FormulaOnePitOperation formulaOnePitOperation) {
        System.out.print("You are doing well guys keep going, I am just keeping an eye on the pump here. I won't disturb you");
        if(formulaOnePitOperation.dangerLevel() > 100)
            System.err.print("STOP!!! CLOSE THE PUMP NOW!!!!");
    }
}
