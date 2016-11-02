import java.util.ArrayList;
import java.util.List;

/**
 * Created by pivotal on 11/2/16.
 */
public class Game {
    private List<Frame> frames;

    public void Frame() {
        frames = new ArrayList<Frame>(10);
    }

    public void start() {

    }

    public boolean finished() {
        return frames.size() >= 10;
    }
}
