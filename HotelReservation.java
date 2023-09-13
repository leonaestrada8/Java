package Final.J4V4.Hotel;

class HotelReservation {
    public String bookRoom(String roomType, int days, boolean isVip) {
        String result;
        double price = 0.0;

        if (roomType.equals("Single")) {
            price = 100;
        } else if (roomType.equals("Double")) {
            price = 200;
        } else if (roomType.equals("Suite")) {
            price = 300;
        }

        if (isVip) {
            price = price * 0.9; // Desconto para VIP
        }

        price = price * days;

        if (price > 0) {
            result = "Reserva efetuada: " + roomType + " por " + days + " dias. Preço: " + price;
        } else {
            result = "Tipo de quarto inválido.";
        }

        return result;
    }

    public static void main(String[] args) {
        HotelReservation reservation = new HotelReservation();
        System.out.println(reservation.bookRoom("Single", 3, true));
    }
}
