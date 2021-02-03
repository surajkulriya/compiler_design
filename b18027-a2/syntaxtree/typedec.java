package syntaxtree;
import java.util.*;

public class typedec {
    String type;
    boolean dec;

    public typedec(String type, boolean dec) {
        this.type = type;
        this.dec = dec;
    }

    public String getType() {
        return type;
    }

    public boolean getInit() {
        return dec;
    }

    public void setType(String a) {
        type = a;
    }

    public void setInit(boolean a) {
        dec = a;
    }
}