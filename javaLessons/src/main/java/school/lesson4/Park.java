package school.lesson4;

//Создать класс Park с внутренним классом,
// с помощью объектов которого можно хранить
// информацию об аттракционах, времени их работы
// и стоимости.


import java.util.ArrayList;
import java.util.List;

public class Park {
    private String namePark;
    private List<Atraction> atractionList;

    public Park(String namePark) {
        this.namePark = namePark;
        atractionList = new ArrayList<Atraction>();
    }

    public List<Atraction> getAtractionList() {
        return atractionList;
    }

    void addAtraction(Atraction atraction) {
        atractionList.add(atraction);
    }

    public String parkInfo() {
        return "In " + getNamePark() + "\n" + getAtractionList().toString();
    }

    public String getNamePark() {
        return namePark;
    }

    public void setNamePark(String namePark) {
        this.namePark = namePark;
    }

    class Atraction {
        private String atrName;
        private String atrType;
        private int atrPrice;

        public Atraction(String atrName, String atrType, int atrPrice) {
            this.atrName = atrName;
            this.atrType = atrType;
            this.atrPrice = atrPrice;
        }

        public String getArtName() {
            return atrName;
        }

        public String getAtrType() {
            return atrType;
        }

        public int getAtrPrice() {
            return atrPrice;
        }


        public String toString() {
            return " \n Name: " + getArtName() + "; Type: " + getAtrType() + "; Price: " + getAtrPrice();
        }
    }
}