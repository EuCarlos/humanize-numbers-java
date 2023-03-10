package br.com.carlos.hn;

public class App {
    public static void main(String[] args) throws Exception {
        HumanizeNumbers hn = new HumanizeNumbers("en");

        String result = hn.execute(1234567.00, 1);
        String result1 = hn.execute(1234567.00, 2);
        String result2 = hn.execute(11234567.00, 1);
        String result3 = hn.execute(11234567.00, 2);

        String result4 = hn.execute(2567.00, 2);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
