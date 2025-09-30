import java.util.Scanner;
import mvc.ComboController;
import mvc.ComboView;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComboView vista = new ComboView();
        ComboController controlador = new ComboController(vista);

        System.out.println("=== Bienvenido a FastFood ===");

        // === Selección Combo Base === hdhhd
        System.out.println("Seleccione el tipo de combo:");
        System.out.println("1. Hamburguesa");
        System.out.println("2. Pollo");
        System.out.println("3. Vegetariano");
        int opcionBase = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        String base = "";
        switch (opcionBase) {
            case 1: base = "Hamburguesa"; break;
            case 2: base = "Pollo"; break;
            case 3: base = "Vegetariano"; break;
            default: System.out.println("Opción inválida, se eligió Hamburguesa por defecto."); base = "Hamburguesa";
        }

        // === Selección Bebida ===
        System.out.println("Seleccione la bebida:");
        System.out.println("1. Coca-Cola");
        System.out.println("2. Pepsi");
        System.out.println("3. Chicha Morada");
        System.out.println("4. Jugo de Maracuyá");
        int opcionBebida = sc.nextInt();
        sc.nextLine();

        String bebida = "";
        switch (opcionBebida) {
            case 1: bebida = "Coca-Cola"; break;
            case 2: bebida = "Pepsi"; break;
            case 3: bebida = "Chicha Morada"; break;
            case 4: bebida = "Jugo de Maracuyá"; break;
            default: bebida = "Agua";
        }

        // === Selección Acompañamiento ===
        System.out.println("Seleccione el acompañamiento:");
        System.out.println("1. Papas fritas");
        System.out.println("2. Ensalada");
        System.out.println("3. Yuca frita");
        int opcionAcomp = sc.nextInt();
        sc.nextLine();

        String acompanamiento = "";
        switch (opcionAcomp) {
            case 1: acompanamiento = "Papas fritas"; break;
            case 2: acompanamiento = "Ensalada"; break;
            case 3: acompanamiento = "Yuca frita"; break;
            default: acompanamiento = "Papas fritas";
        }

        // === Selección Extra ===
        System.out.println("Seleccione un extra:");
        System.out.println("1. Postre");
        System.out.println("2. Nuggets");
        System.out.println("3. Helado");
        int opcionExtra = sc.nextInt();
        sc.nextLine();

        String extra = "";
        switch (opcionExtra) {
            case 1: extra = "Postre"; break;
            case 2: extra = "Nuggets"; break;
            case 3: extra = "Helado"; break;
            default: extra = "Nada";
        }

        // Crear pedido
        controlador.crearPedido(base, bebida, acompanamiento, extra);

        // Mostrar resumen
        controlador.mostrarPedido();

        // Confirmación
        System.out.println("\n¿Desea confirmar el pedido? (si/no):");
        String confirmacion = sc.nextLine();

        if (confirmacion.equalsIgnoreCase("si")) {
            System.out.println("✅ Pedido confirmado. ¡Gracias por su compra!");
        } else {
            System.out.println("❌ Pedido cancelado.");
        }
    }
}
