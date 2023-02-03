package transport;

public enum BodyType {
    SEDAN("Седан"),
    HETCHBACK("Хетчбек"),
    CUPE("Купе"),
    UNIVERSAL("Универсал"),
    VNEDOROZHNIK("Внедорожник"),
    KROSSOVER("Кроссовер"),
    PIKUP("Пикап"),
    FURGON("Фургон"),
    MINIVEN("Минивэн");

    private final String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова " + bodyType;
    }
}
