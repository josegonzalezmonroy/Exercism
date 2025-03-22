import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> actions = new ArrayList<>();
        
        if ((number & 1) != 0) actions.add(Signal.WINK);
        if ((number & 2) != 0) actions.add(Signal.DOUBLE_BLINK);
        if ((number & 4) != 0) actions.add(Signal.CLOSE_YOUR_EYES);
        if ((number & 8) != 0) actions.add(Signal.JUMP);
        
        if ((number & 16) != 0) {
            java.util.Collections.reverse(actions);
        }
        
        return actions;
    }
}