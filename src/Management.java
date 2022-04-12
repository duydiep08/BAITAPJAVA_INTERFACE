import java.util.ArrayList;
import java.util.Scanner;

public class Management {

        static void menu() {
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
        }

        static void inputNews(News news) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập title: ");
            news.title = scanner.nextLine();
            System.out.print("Nhập publish date: ");
            news.publishDate = scanner.nextLine();
            System.out.print("Nhập author: ");
            news.author = scanner.nextLine();
            System.out.print("Nhập content: ");
            news.content = scanner.nextLine();
            System.out.println("Nhập các đánh giá:");
            for (int i = 0; i < news.RateList.length; i++) {
                do {
                    System.out.format("Đánh giá %d: ", i + 1);
                    news.RateList[i] = scanner.nextInt();
                } while (!(1 <= news.RateList[i] && news.RateList[i] <= 5));
            }
        }

        public static void main(String[] args) {
            int option;
            Scanner scanner = new Scanner(System.in);
            ArrayList<News> NewsList = new ArrayList<>();
            menu();
            while (true) {
                while (true) {
                    try {
                        System.out.print("Mời bạn nhập 1 lựa chọn: ");
                        option = scanner.nextInt();
                        break;
                    } catch (Exception ex) {
                        System.out.println("Lựa chọn phải là 1 số nguyên");
                    }
                }
                switch (option) {
                    case 1:
                        News news = new News();
                        inputNews(news);
                        news.id = NewsList.size() + 1;
                        NewsList.add(news);
                        System.out.println("Đã thêm tin có mã " + news.id + " vào danh sách!");
                        break;
                    case 2:
                        System.out.println("Danh sách tin:");
                        for (News news1 : NewsList) {
                            news1.Display();
                        }
                        break;
                    case 3:
                        System.out.println("Danh sách tin sau khi tính trung bình rate:");
                        for (News news1 : NewsList) {
                            news1.calculate();
                            news1.Display();
                        }
                        break;
                    case 4:
                        return;
                }
            }
        }

}
