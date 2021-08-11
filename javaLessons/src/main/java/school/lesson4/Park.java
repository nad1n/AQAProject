package school.lesson4;

//Создать класс Park с внутренним классом,
// с помощью объектов которого можно хранить
// информацию об аттракционах, времени их работы
// и стоимости.



public class Park {

    private String namePark;

    public Park(String namePark) {
        this.namePark = namePark;
    }

    public String getNamePark(){
     return namePark;
    }

    public class Attraction {
        protected String attrName;
        protected String attrType;
        protected int attrPrice;

        public Attraction(String attrName, String attrType, int attrPrice) {
            this.attrName = attrName;
            this.attrType = attrType;
            this.attrPrice = attrPrice;
        }

        public String getAttrName() {
            return attrName;
        }
        public String getAttrType() {
            return attrType;
        }
        public int getAttrPrice() {
            return attrPrice;
        }

        public void attrInfo() {
            System.out.println("In " + getNamePark() + " is Attraction: "
                    + getAttrName() + ", Type: " + getAttrType() + ", Price: " + getAttrPrice());
        }
    }







}
