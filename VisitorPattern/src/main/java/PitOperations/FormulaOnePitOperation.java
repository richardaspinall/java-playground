package PitOperations;

import Mechanics.Mechanic;

public interface FormulaOnePitOperation {
    public void perform();
    public void accept(Mechanic visitor);
    public int dangerLevel();
}
