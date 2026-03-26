public class Aula003 {
    
    public static void main(String[] args) {
        int Fahrenheit = 77;
        int SubFahrenheit = 32;
        int MultiFahrenheit = 5;
        int DividFahrenheit = 9;

        int Celsius = (Fahrenheit - SubFahrenheit) * MultiFahrenheit / DividFahrenheit;
        System.out.println("Valor em Fahrenheit: " + Fahrenheit + "C°");
        System.out.println("Valor em Celsius: " + Celsius + "C°");

    }
}
