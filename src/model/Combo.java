package model;

public class Combo extends ComboBase {

    public Combo(String base) {
        super(base);
    }

    @Override
    public String detalle() {
        return toString();
    }
}
