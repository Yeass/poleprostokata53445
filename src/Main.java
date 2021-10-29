import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RectangleArea{
    double a, b, area;

    void pobieranieDanych() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dzięki temu programowi obliczysz pole prostokąta");
        System.out.println("Podaj długość boku a:");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj długość boku b:");
        b = Double.parseDouble(br.readLine());
    }

    void obliczaniePola() {
        area = a * b;
    }

    void wyswietlaniePola(){
        System.out.print("Pola prostokąta o boku a = ");
        System.out.printf("%2.2f",a);
        System.out.print(" i boku b = ");
        System.out.printf("%2.2f",b);
        System.out.print(" równa się = ");
        System.out.printf("%2.2f.\n", area);
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        RectangleArea ra = new RectangleArea();
        ra.pobieranieDanych();
        ra.obliczaniePola();
        ra.wyswietlaniePola();
    }
}