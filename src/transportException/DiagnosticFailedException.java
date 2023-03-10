package transportException;

import Driver.Driver;
import transport.Transport;

public class DiagnosticFailedException extends Exception {
    private final Transport transport;

    public DiagnosticFailedException(String message, Transport transport) {
        super(message);
        this.transport = transport;

    }

    public Transport<Driver> getTransport() {
        return transport;
    }
}
