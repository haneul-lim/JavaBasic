package sky.basic.day08;

public class EX06 {
    public static void main(String[] args) {

        Person p = new Person();

        Book b = new Book();


    }//main


}//class

class Person {
    // 값만 저장하는 VO 클래스
    // 멤버변수
    private String name;    // 이름
    private String gender;  // 성별
    private int age;        // 나이
    private int height;     // 키
    private int weight;     // 몸무게

    // 생성자
    public Person() { }

    public Person(String name, String gender, int age, int height, int weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}//Person


class Book {
    private String bookName;
    private String writer;
    private String trlator;
    private String publisher;
    private String publicationDate;
    private int price;
    private int sellingPrice;
    private double discountRate;
    private int saveMoney;

    public Book() { }

    public Book(String bookName, String writer, String trlator, String publisher,
                String publicationDate, int price, double discountRate) {
        this.bookName = bookName;
        this.writer = writer;
        this.trlator = trlator;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.price = price;
        this.discountRate = discountRate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTrlator() {
        return trlator;
    }

    public void setTrlator(String trlator) {
        this.trlator = trlator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(int saveMoney) {
        this.saveMoney = saveMoney;
    }



}//Book