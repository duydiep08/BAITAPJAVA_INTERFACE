public class News implements INews{
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    float averageRate;

    public News() {
        id=1;
        title="News";
        publishDate="07-04-2022";
        author="Điệp";
        content="BAITAPJAVA_NEWS";
        averageRate=4.5f;
    }

    public News(int id, String title, String publishDate, String author,
                String content, float averageRate, int[] rateList) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
        RateList = rateList;
    }

    //GETTER
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getPublishDate() {
        return publishDate;
    }
    public String getAuthor() {
        return author;
    }
    public String getContent() {
        return content;
    }
    public float getAverageRate() {
        return averageRate;
    }

    //SETTER
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public void Display() {
        System.out.println("Title: " + title);
        System.out.println("Publish date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average rate: " + averageRate);
    }

    int[] RateList = new int[3];

    void calculate() {
        averageRate = (float) (RateList[0] + RateList[1] + RateList[2]) / RateList.length;
    }
}