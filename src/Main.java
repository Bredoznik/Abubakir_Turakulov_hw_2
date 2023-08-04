import java.util.Random;

public class Main {
    public static void main(String[] args) {
        sendMessageIn(28, 20); // Возраст: 28, Температура: 20 - Оставайтесь дома
        sendMessageIn(18, 10); // Возраст: 18, Температура: 10 - Можно идти гулять
        sendMessageIn(48, 0);  // Возраст: 48, Температура: 0 - Оставайтесь дома
        sendMessageIn(32, 5);  // Возраст: 32, Температура: 5 - Можно идти гулять
        sendMessageIn(generateRandomAge(), generateRandomTemp());
    }

    public static String canGoForAWalk(int age, int temperature) {
        return (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25) ?
                "Можно идти гулять" : "Оставайтесь дома";
    }

    public static int generateRandomAge() {
        return new Random().nextInt(51); // Случайное число от 0 до 50
    }

    public static int generateRandomTemp() {
        return new Random().nextInt(51) - 30; // Случайное число от -30 до +20
    }

    public static void sendMessageIn(int age, int temperature) {
        System.out.println("Возраст: " + age + ", Температура на улице: " + temperature + " - " + canGoForAWalk(age, temperature));
    }
}