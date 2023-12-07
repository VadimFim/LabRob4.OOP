class Xiaomi extends Samsung {
    private double weight;
    private String color;
    private String name;
    private double diagonal;
    private double worktime;

    Xiaomi(String name, double weight, String color, double diagonal, double worktime) {
        super("Redmi 12 Note Pro", 100, "White", (int) 6.2, 0);
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.diagonal = diagonal;
        this.worktime = worktime;
    }

    private void info() {
        System.out.println("Назва моделі: " + name + "; Вага моделі: " + weight + "г" + "; Колір моделі: " + color + "; Діагональ екрану: " + diagonal + " дюймів" + "; Час використання: " + worktime + " годин" + ";");
    }

    protected void worktimeinfo(double usageTime) {
        System.out.println("Час використання смартфону: " + usageTime);
    }

    private static void specialMethod() {
        System.out.println("Час на вітрині: " + 20 + " год.");
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

    public static void executeSpecialMethod() {
        specialMethod();
    }

    public double executeRecursiveMethod(int iterations) {
        return recursiveMethod(iterations);
    }

    public int getWeight() {
        return (int) weight;
    }

    public void setWeight(double weight) {
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
        return (int) diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getWorktime() {
        return worktime;
    }

    public void setWorktime(double worktime) {
        this.worktime = worktime;
    }

    public void setWithDoubling(double value) {
        this.weight = value;
        this.weight *= 2;
    }

    protected void worktimeInfo(double usageTime) {
    }
}
