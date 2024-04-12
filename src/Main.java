public class Main {
    public static void main(String[] args) {
        int check = 800;
        int purchase = 1300;

        boolean isRegistred = true;


        int bonus;
        if (purchase > 1100) {
            bonus = ((purchase + check) / 100);
        } else {
            bonus = 0;
        }
        int result = check + bonus + purchase;
        System.out.println(result);
    }
}