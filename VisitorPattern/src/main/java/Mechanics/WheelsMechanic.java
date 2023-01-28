package Mechanics;

import PitOperations.FormulaOnePitOperation;

public class WheelsMechanic implements Mechanic {
    public void visit(FormulaOnePitOperation formulaOnePitOperation) {
        System.out.print("Just supervising the wheels replacement operation! Not disturbing");
        if(formulaOnePitOperation.dangerLevel()>45)
            System.out.print("Be careful you are pumping them too much");
    }
}
