package transport;

public enum Carring {
    N1(0.0f, 3.5f),
    N2 (3.51f, 12.0f),
    N3 (12.01f, null)
    ;

    private final Float downloadCarring;
    private final Float uploadCarring;

    Carring(Float downloadCarring, Float uploadCarring) {
        this.downloadCarring = downloadCarring;
        this.uploadCarring = uploadCarring;
    }

    public Float getDownloadCarring() {
        return downloadCarring;
    }

    public Float getUploadCarring() {
        return uploadCarring;
    }

    @Override
    public String toString() {
        if (uploadCarring != null) {
            return "Грузоподъемность от " + downloadCarring + " тонн до " + uploadCarring + " тонн";
        } else {
            return "Грузоподъемность от " + downloadCarring + " тонн";
        }
    }
}
