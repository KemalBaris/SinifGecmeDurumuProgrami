import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mat = input.nextInt();
        while (mat < 0 || mat > 100) {
            System.out.println("Lütfen 0 ile 100 arasında bir not giriniz!");
            System.out.print("Matematik notunuz :");
            mat = input.nextInt();
        }
        System.out.print("Türkçe notunuz :");
        turkce = input.nextInt();
        while (turkce < 0 || turkce > 100) {
            System.out.println("Lütfen 0 ile 100 arasında bir not giriniz!");
            System.out.print("Türkçe notunuz :");
            turkce = input.nextInt();
        }
        System.out.print("Fizik notunuz :");
        fizik = input.nextInt();
        while (fizik < 0 || fizik > 100) {
            System.out.println("Lütfen 0 ile 100 arasında bir not giriniz!");
            System.out.print("Fizik notunuz :");
            fizik = input.nextInt();
        }
        System.out.print("Kimya notunuz :");
        kimya = input.nextInt();
        while (kimya < 0 || kimya > 100) {
            System.out.println("Lütfen 0 ile 100 arasında bir not giriniz!");
            System.out.print("Kimya notunuz :");
            kimya = input.nextInt();
        }
        System.out.print("Müzik notunuz :");
        muzik = input.nextInt();
        while (muzik < 0 || muzik > 100) {
            System.out.println("Lütfen 0 ile 100 arasında bir not giriniz!");
            System.out.print("Müzik notunuz :");
            muzik = input.nextInt();
        }
        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55) {
            System.out.println("Maalesef" + " " + avarage + " " + "ortalama ile sınıfta kaldınız. Seneye görüşmek üzere!");
        } else {
            System.out.println("Tebrikler!" + " " + avarage + " " + "ortalama ile sınıfı geçtiniz.");
        }
    }
}
