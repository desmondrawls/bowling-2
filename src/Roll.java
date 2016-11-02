/**
 * Created by pivotal on 11/2/16.
 */
public class Roll {

    enum RollResult { Strike, Spare, Default;}

    private int hitPins;

    private RollResult rollResult;

    public Roll(int hitPins, RollResult rollResult) {
        this.hitPins = hitPins;
        this.rollResult = rollResult;
    }

    public int getHitPins() {
        return hitPins;
    }

    public void setHitPins(int hitPins) {
        this.hitPins = hitPins;
    }

    public RollResult getRollResult() {
        return rollResult;
    }

    public void setRollResult(RollResult rollResult) {
        this.rollResult = rollResult;
    }


}
