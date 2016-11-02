import java.util.ArrayList;
import java.util.List;

/**
 * Created by pivotal on 11/2/16.
 */
public class Frame {
    private List<Roll> rolls;

    public Frame() {
        rolls = new ArrayList<Roll>(1);
    }

    public void start() {

    }

    public boolean finished() {
        return rolls.size() >= 10;
    }

    public void roll(Roll roll) {
        rolls.add(roll);
    }

}
