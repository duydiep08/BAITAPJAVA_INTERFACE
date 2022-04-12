public class Book implements IBook {
    int id;
    String name;
    String publishDate;
    String author;
    String language;
    float averagePrice;
    int [] priceList = new int[5];
    @Override
    public void display() {
        System.out.println("name:" +name);
        System.out.println("pubLish date: " +publishDate);
        System.out.println("Author :" +author);
        System.out.println("Language:" +language);
        System.out.println("Average Price " +averagePrice);
    }
    void calculate() {
        for(int i : priceList) {
            averagePrice +=i;
        }
        averagePrice /= priceList.length;
    }
}