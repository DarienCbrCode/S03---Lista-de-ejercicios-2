package mvc;

import builder.ComboBuilder;
import model.Combo;
import model.ComboFactory;

public class ComboController {
    private Combo combo;
    private ComboView vista;

    public ComboController(ComboView vista) {
        this.vista = vista;
    }

    public void crearPedido(String tipoBase, String bebida, String acompanamiento, String extra) {
        combo = (Combo) ComboFactory.crearComboBase(tipoBase);

        combo = new ComboBuilder(combo.getBase())
                .agregarBebida(bebida)
                .agregarAcompanamiento(acompanamiento)
                .agregarExtra(extra)
                .build();
    }

    public void mostrarPedido() {
        vista.mostrarCombo(combo);
    }
}
