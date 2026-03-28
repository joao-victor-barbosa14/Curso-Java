public class Aula006 {
    public static void main(String[] args) {
        String s = "Bom dia, X";
        s = s.toUpperCase();
        s = s.replace("X","Cowrade");

        String n = "Boa tarde";
        n = n.toLowerCase();

        System.out.println(n);
        System.out.println(s);
    }
}
