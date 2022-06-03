package patrones;

import java.util.Scanner;

public class PatronesAnidados {
    public void patron1(int n) {
        if (n == 1) {
            System.out.println("*");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();

            for (int i = 0; i < n - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void patron2(int n) {
        if (n == 1) {
            System.out.println("*");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 0; i < n - 2; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == n - 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void patron3(int n) {
        if (n == 1) {
            System.out.println("x");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == i || j == n - i - 1)
                        System.out.print("x");
                    else
                        System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }

    public void patron4(int n) {
        if (n == 1) {
            System.out.println("x");
        } else {
            for (int i = 0; i < n - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
            for (int i = 0; i < n - 2; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (j == 0)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                System.out.println("");
            }
            for (int i = 0; i < n; i++) {
                if (i == 0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese n");
        int n = scan.nextInt();
        PatronesAnidados patron = new PatronesAnidados();
        patron.patron1(n);
        System.out.println("");
        patron.patron2(n);
        System.out.println("");
        patron.patron3(n);
        System.out.println("");
        patron.patron4(n);
    }
}
