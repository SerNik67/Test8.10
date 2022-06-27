import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();
        final int BOXES_PER_CONTAINERS = 27;
        final int CONTAINERS_IN_TRACKS = 12;

        int containersCount = boxes / BOXES_PER_CONTAINERS +
                (boxes % BOXES_PER_CONTAINERS == 0 ? 0 : 1);

        int tracksCount = containersCount / CONTAINERS_IN_TRACKS +
                (containersCount % CONTAINERS_IN_TRACKS == 0 ? 0 : 1);

        for (int i = 1; i <= tracksCount; i ++) {
            System.out.println("Грузовик: " + i);
            int c = (i - 1) * CONTAINERS_IN_TRACKS;

            for (int a = 1; (a <= CONTAINERS_IN_TRACKS && a <= (containersCount - c)); a ++) {
                System.out.println("\tКонтейнер: " + (c + a));
                int d = (c + a - 1) * BOXES_PER_CONTAINERS;

                for (int b = 1; (b <= BOXES_PER_CONTAINERS && b <= (boxes - d)); b ++) {
                    System.out.println("\t\tЯщик: " + (d + b));
                }
            }
        }
        System.out.println("");
        System.out.println("Необходимо:");
        System.out.println("");
        System.out.println("грузовиков - " + tracksCount + " шт.");
        System.out.println("контейнеров - " + containersCount + " шт.");
    }
}
