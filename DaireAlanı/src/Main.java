import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double r, alan, cevre, aci;
		double pi = 3.14;
		Scanner deger = new Scanner(System.in);
		System.out.print("dairenin yarıçapını giriniz: ");
		r = deger.nextDouble();
		System.out.print("merkez aciyi giriniz: ");
		aci = deger.nextDouble();
		alan = pi * r * r * aci / 360;
		cevre = 2 * pi * r;
		System.out.println("darinenin alani: " + alan + " ve dairenin cevresi " + cevre);

	}

}
