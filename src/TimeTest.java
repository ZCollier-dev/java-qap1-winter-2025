public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);
        t2.setTime(10, 20, 25);

        System.out.println(t1.toString());
        System.out.println(t2.toString());

        t1.nextSecond();
        t2.previousSecond();
        System.out.println("Times altered.");

        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}
