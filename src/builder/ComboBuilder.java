package builder;

import model.Combo;

public class ComboBuilder {
    private Combo combo;

    public ComboBuilder(String base) {
        this.combo = new Combo(base);
    }

    public ComboBuilder agregarBebida(String bebida) {
        combo.setBebida(bebida);
        return this;
    }

    public ComboBuilder agregarAcompanamiento(String acompanamiento) {
        combo.setAcompanamiento(acompanamiento);
        return this;
    }

    public ComboBuilder agregarExtra(String extra) {
        combo.setExtra(extra);
        return this;
    }

    public Combo build() {
        return combo;
    }
}
