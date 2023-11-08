package day3.topic2_inheritance;

public class TestLion {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.home = new Home();
        lion.home.location = "Safari";
    }
}
