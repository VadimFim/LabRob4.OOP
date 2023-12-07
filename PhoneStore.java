public class PhoneStore {
    public static void main(String[] args) {
        Samsung samsung1 = new Samsung("Samsung Galaxy A10", 110, "Grey", 6, 0);
        Iphone iphone1 = new Iphone("Iphone 11 Pro", 107, "White", 5.5, 0);
        Xiaomi xiaomi = new Xiaomi("Xiaomi Redmi 12 Note", 92, "Black", 6.2, 0);
        Smartwatch smartwatch = new Smartwatch("Smartwatch Model", 80, "Black", 1.5, 0, true);

        executeSamsungMethods(samsung1);
        executeIphoneMethods(iphone1);
        executeXiaomiMethods(xiaomi);
        executeSmartwatchMethods(smartwatch);
    }

    private static void executeSmartwatchMethods(Smartwatch smartwatch) {
        System.out.println("\n== Smartwatch Methods ==");
        smartwatch.executeInfo();
        smartwatch.executeWorktimeInfo(3.5);
        smartwatch.monitorHeartRate();
    }


    private static void executeSamsungMethods(Samsung samsung) {
        System.out.println("== Samsung Methods ==");
        samsung.executeInfo();
        samsung.executeWorktimeInfo(5.5);
        Samsung.executeSpecialMethod(10);

        Samsung samsung2 = new Samsung("Samsung Galaxy S20", 120, "Blue", 6, 0);
        samsung.processAnotherInstance(samsung2);

        Samsung copySamsung = samsung.createCopy(125, "Red", 5, 10, 0);
        copySamsung.executeInfo();

        samsung.recursiveMethod(5);
        samsung.setWeight(50);
        System.out.println("Вага Samsung після дооснащення: " + samsung.getWeight());
    }

    private static void executeIphoneMethods(Iphone iphone) {
        System.out.println("\n== Iphone Methods ==");
        iphone.executeInfo();
        iphone.executeWorktimeInfo(7.2);
        Iphone.executeSpecialMethod(15);

        Iphone iphone2 = new Iphone("Iphone 12", 130, "Gold", 6.1, 0);
        iphone.processAnotherInstance(iphone2);

        Iphone copyIphone = (Iphone) iphone.createCopy(140, "Silver", 12, 0, 6.5);
        copyIphone.executeInfo();

        iphone.recursiveMethod();
        iphone.setWeight(55);
        System.out.println("Вага Iphone після дооснащення: " + iphone.getWeight());
    }

    private static void executeXiaomiMethods(Xiaomi xiaomi) {
        System.out.println("\n== Xiaomi Methods ==");
        xiaomi.executeInfo();
        xiaomi.executeWorktimeInfo(6.8);
        Xiaomi.executeSpecialMethod();

        Xiaomi xiaomi2 = new Xiaomi("Xiaomi Redmi Note 10", 110, "Green", 6.5, 0);
        xiaomi.processAnotherInstance(xiaomi2);

        Xiaomi copyXiaomi = (Xiaomi) xiaomi.createCopy(120, "Blue", 6, 8, 0);
        copyXiaomi.executeInfo();

        xiaomi.recursiveMethod(8);
        xiaomi.setWeight(60);
        System.out.println("Вага Xiaomi після дооснащення: " + xiaomi.getWeight());
    }
}
