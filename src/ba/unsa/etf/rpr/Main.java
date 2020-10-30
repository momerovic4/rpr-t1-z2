package ba.unsa.etf.rpr;

import java.net.http.WebSocket;
import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n) {
        int suma=0;
        while(n>0) {
            suma = suma + n%10;
            n=n/10;
        }
        return suma;
    }

    public static void main(String[] args) {
	    int n=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Unesite neki broj: ");
        n = in.nextInt();
        System.out.println("Svi brojevi koji su djeljivi sa svojom sumom cifara od 1 do " + n + " su:");
        for (int i = 1; i <= n; i++) {
            if(i % sumaCifara(i) == 0) System.out.print(i + " ");
        }
    }
}
