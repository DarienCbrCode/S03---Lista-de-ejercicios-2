package mvc;

import model.Combo;

public class ComboView {
    public void mostrarCombo(Combo combo) {
        System.out.println("=== Detalle del Pedido ===");
        System.out.println(combo.toString());
    }
}
