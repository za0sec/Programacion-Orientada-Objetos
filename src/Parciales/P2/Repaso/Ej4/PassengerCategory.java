package Parciales.P2.Repaso.Ej4;

public enum PassengerCategory {

    EMERALD("EMERALD"),
    SAPPHIRE("SAPPHIRE"),
    RUBY("RUBY"),
    ECONOMY("ECONOMY");

    private String name;

    PassengerCategory(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }


}