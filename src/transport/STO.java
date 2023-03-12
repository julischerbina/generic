package transport;

import transportException.DiagnosticFailedException;

import java.util.ArrayDeque;
import java.util.Queue;

public class STO {
    private final Queue<Transport<?>> transportQueue = new ArrayDeque<>();

    public void addTransport (Transport<?> transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в ТО");
        } else {
            transportQueue.add(transport);
        }
    }

    public void runTO() {
        Transport<?> transport = transportQueue.poll();
        if (transport != null) {
            try {
                transport.passDiagnostics();
                transport.getMehanics().iterator().next().maintenance();
            } catch (DiagnosticFailedException e) {
                System.out.println("Ошибка при проведении ТО");
            }
        } else {
            System.out.println("В очереди больше никого нет");
        }
    }
}
