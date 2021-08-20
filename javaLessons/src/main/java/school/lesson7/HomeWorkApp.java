package school.lesson7;

public class HomeWorkApp {

    public static void main(String[] args) {
        String[] nameColumn = new String[]{"ID", "Memory", "Price"};
        int[][] dataCell = new int[][]{{1, 32, 635}, {2, 64, 999}, {3, 128, 1244}, {4, 256, 1678}};

        AppData appData = new AppData(nameColumn, dataCell);
        appData.save("file.csv"); // Реализовать сохранение данных в csv файл;
        appData.read("file.csv"); //   Реализовать загрузку данных из csv файла. Файл читается целиком.
    }
}
