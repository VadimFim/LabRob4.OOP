import java.util.Random;

class Samsung {
    private int weight;
    private String color;
    private String name;
    private int diagonal;
    private int time;
    private double worktime;

    Samsung(String name, int weight, String color, int diagonal, double worktime) {
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.diagonal = diagonal;
        this.time = (int) worktime;
    }
    
    private void info() {
        System.out.println("Назва моделі: " + name + "; Вага моделі: " + weight + "г" + "; Колір моделі: " + color + "; Діагональ екрану: " + diagonal + " дюймів" + "; Час використання: " + time + " годин" + ";");
    }

    protected void worktimeinfo(double usageTime) {
        Random random = new Random();
        double randomUsageTime = random.nextDouble() * 30 + 1;
        System.out.println("Час використання смартфону: " + randomUsageTime);
        if (randomUsageTime > usageTime) {
            System.out.println("Цей телефон вживаний.");
        } else {
            System.out.println("Цей телефон не був у використані.");
        }
    }

    static void specialMethod(int value) {
        System.out.println("Час на вітрині: " + value + "год.");
    }

    void processAnotherInstance(Samsung anotherSamsung) {
    }

    Samsung createCopy(int newWeight, String newColor, int newDiagonal, int newTime, double newWorktime) {
        return new Samsung(name, newWeight, newColor, newDiagonal, newWorktime);
    }

    double recursiveMethod(int iterations) {
        if (iterations > 0) {
            System.out.println("Кількість проданих моделей: " + iterations);
            recursiveMethod(iterations - 1);
        }
        return 0;
    }

    public void executeInfo() {
        info();
    }

    public void executeWorktimeInfo(double usageTime) {
        worktimeinfo(usageTime);
    }

    public static void executeSpecialMethod(int value) {
        specialMethod(value);
    }

    public void executeProcessAnotherInstance(Samsung anotherSamsung) {
        processAnotherInstance(anotherSamsung);
    }

    public Samsung executeCreateCopy(int newWeight, String newColor, int newDiagonal, int newTime, double newWorktime) {
        return createCopy(newWeight, newColor, newDiagonal, newTime, newWorktime);
    }

    public double executeRecursiveMethod(int iterations) {
        return recursiveMethod(iterations);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public double getWorktime() {
        return worktime;
    }

    public void setWorktime(double worktime) {
        this.worktime = worktime;
    }
}
