package school.lesson6;

public class HomeWorkApp {

    public static void main(String[] args) {
        String[][] array44 = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] array4A = new String[][]{{"1", "2", "3", "x"}, {"1", "A", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] array43 = new String[][]{{"1", "2", "3", "x"}, {"1", "A", "3", "4"}, {"1", "2", "3", "4"}};

        sumArray(array44);
        sumArray(array4A);
        sumArray(array43);
    }

    private static int sumArray(String[][] array) throws MyArraySizeException {
        int sum = 0;
        if (array.length != 4) throw new MyArraySizeException("Error! Size of array isn't [4][4]");

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeException("Error! Size of array isn't [4][4]");
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int temp = Integer.parseInt(array[i][j]);
                    sum = sum + temp;
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                    //если след строку не писать то просчет суммы продолжиться
                    throw new MyArrayDataException(array[i][j] + " in [" + i + "][" + j + "] can't convert to Int");
                }
            }
        }

        System.out.println("Sum of " + array.getClass().getSimpleName() + ": " + sum);
        return sum;
    }
}
