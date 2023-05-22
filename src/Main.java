public class Main {
    public static void main(String[] args) {
        String a = "Привет, я сдаю курсовую";
        int b = a.length() / 2;
        System.out.println(a.length());
        System.out.println(b);
        System.out.println(a.substring(0,b));
        System.out.println(a.substring(b,a.length()));
    }
}