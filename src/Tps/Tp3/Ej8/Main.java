package Tps.Tp3.Ej8;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva promoción de "números amigos" con un máximo de 3 amigos
        FriendPromotion promotion = new FriendPromotion();
        promotion.setDiscountPercentage(50); // Descuento del 50%
        promotion.addFriend("123");
        promotion.addFriend("456");

        // Crear una nueva factura de teléfono
        CellPhoneBill bill = new CellPhoneBill("800-555-1234");
        bill.setFriendPromotion(promotion); // Asignar la promoción a la factura

        // Registrar algunas llamadas
        bill.registerCall("123", 60); // 1 minuto a un "número amigo"
        bill.registerCall("789", 60); // 1 minuto a un número no-amigo

        // Procesar la factura
        double total = bill.processBill();
        System.out.println("El costo total de la factura es: $" + total);

        // Eliminar un amigo y añadir otro
        promotion.removeFriend("123");
        promotion.addFriend("789");

        // Registrar más llamadas
        bill.registerCall("123", 60); // 1 minuto a un número que ya no es amigo
        bill.registerCall("789", 60); // 1 minuto a un nuevo "número amigo"

        // Volver a procesar la factura
        total = bill.processBill();
        System.out.println("El nuevo costo total de la factura es: $" + total);
    }
}
