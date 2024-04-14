public class Main {
    public static void main(String[] args) {
        int check = 50;
        int purchase = 1000;

        int bonus;
        if (purchase >= 1000) {
            bonus = (purchase /100);
        } else {
            bonus = 0;
        }
        int result = check + bonus + purchase;
        System.out.println(result);
    }
}