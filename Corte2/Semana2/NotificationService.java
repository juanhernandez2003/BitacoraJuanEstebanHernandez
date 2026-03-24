public class NotificationService {

    private static NotificationService instance;

    private NotificationStrategy strategy;

    // Constructor privado
    private NotificationService() {
    }

    // Método para obtener la única instancia
    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    // Permite cambiar el canal dinámicamente
    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    // Envía la notificación usando la estrategia actual
    public void sendNotification(String message) {
        if (strategy == null) {
            System.out.println("No se ha seleccionado un canal de notificación.");
            return;
        }

        strategy.send(message);
    }
}