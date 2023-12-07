public class Smartwatch extends Xiaomi {
    private boolean heartRateMonitor;

    public Smartwatch(String name, double weight, String color, double diagonal, double worktime, boolean heartRateMonitor) {
        super(name, weight, color, diagonal, worktime);
        this.heartRateMonitor = heartRateMonitor;
    }

    // Новий метод для класу Smartwatch
    public void monitorHeartRate() {
        if (heartRateMonitor) {
            System.out.println("Вимірювання пульсу в режимі реального часу.");
        } else {
            System.out.println("Цей смарт-годинник не підтримує вимірювання пульсу.");
        }
    }

    // Перевизначення методу з Xiaomi з додатковою логікою
    @Override
    protected void worktimeInfo(double usageTime) {
        super.worktimeInfo(usageTime);
        System.out.println("Додаткова інформація про час роботи смарт-годинника.");
    }
}