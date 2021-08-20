package school.lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData {

    private String[] nameColumn;
    private int[][] dataRow;

    public AppData(String[] nameColumn, int[][] dataRow) {
        this.nameColumn = nameColumn;
        this.dataRow = dataRow;
    }

    public void save(String fileName) {
        try (BufferedWriter in = new BufferedWriter(new FileWriter(fileName))) {

            for (int i = 0; i <= this.nameColumn.length - 1; i++) {
                if (i < this.nameColumn.length - 1) {
                    in.write(this.nameColumn[i] + ";");
                } else {
                    in.write(this.nameColumn[i] + "\n");
                }
            }

            for (int i = 0; i <= this.dataRow.length - 1; i++) {
                for (int j = 0; j <= this.dataRow[i].length - 1; j++) {
                    String row = String.valueOf(dataRow[i][j]);
                    if (j < this.dataRow[i].length - 1) {
                        in.write(row + ";");
                    } else {
                        in.write(row + "\n");
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(String fileName) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            List<String[]> rows = new ArrayList<>();
            String row;

            while ((row = br.readLine()) != null) {
                rows.add(row.split(";"));
            }

            nameColumn = rows.get(0);
            rows.remove(0);
            dataRow = new int[rows.size()][nameColumn.length];

            for (int i = 0; i < rows.size(); i++) {
                String[] strings = rows.get(i);
                for (int j = 0; j < strings.length; j++) {
                    dataRow[i][j] = Integer.parseInt(strings[j]);
                }
            }

            System.out.println(Arrays.toString(nameColumn));
            System.out.println(Arrays.deepToString(dataRow));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}