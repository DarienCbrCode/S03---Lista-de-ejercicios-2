package model;

public abstract class ComboBase {
    protected String base;          // Tipo de combo (Hamburguesa, Pollo, Vegetariano)
    protected String bebida;
    protected String acompanamiento;
    protected String extra;

    public ComboBase(String base) {
        this.base = base;
    }

    // Métodos para personalizar
    public void setBebida(String bebida) { this.bebida = bebida; }
    public void setAcompanamiento(String acompanamiento) { this.acompanamiento = acompanamiento; }
    public void setExtra(String extra) { this.extra = extra; }

    // Getters
    public String getBase() { return base; }
    public String getBebida() { return bebida; }
    public String getAcompanamiento() { return acompanamiento; }
    public String getExtra() { return extra; }

    // Método abstracto que obliga a las subclases a definir su detalle
    public abstract String detalle();

    @Override
    public String toString() {
        return "Combo: " + base +
                "\nBebida: " + (bebida != null ? bebida : "No seleccionado") +
                "\nAcompañamiento: " + (acompanamiento != null ? acompanamiento : "No seleccionado") +
                "\nExtra: " + (extra != null ? extra : "No seleccionado");
    }
}
