package transport;

public enum Capacity {
    EXTRA_SMALL (0, 10),
    SMALL(11, 25),
    MIDDLE(40,50),
    BIG(60,80),
    EXTRA_BIG(100,120);

    private final Integer downCapacity;
    private final Integer upCapacity;

    Capacity(Integer downCapacity, Integer upCapacity) {
        this.downCapacity = downCapacity;
        this.upCapacity = upCapacity;
    }

    public Integer getDownCapacity() {
        return downCapacity;
    }

    public Integer getUpCapacity() {
        return upCapacity;
    }

    @Override
    public String toString() {
        return "Вместимость: " + downCapacity + " - " + upCapacity + " мест.";
    }
}
