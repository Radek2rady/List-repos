package OOP.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies;

    public SharpieSet() {
        this.sharpies = new ArrayList<>();
    }

    public SharpieSet(String name) {

    }

    public void add(Sharpie sharp) {
        sharpies.add(sharp);
    }


    public int countUsable() {
        int counter = 0;
        for (Sharpie sharp : this.sharpies) {
            if (sharp.getInkAmount() > 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {
        for (Sharpie sharp : this.sharpies) {
            if (sharp.getInkAmount() == 0) {
                sharp = null;
            }
        }
    }

}
