package patrones;

public class Patrones {
    public void patron1(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.print("*");
            else
                System.out.print(".");
        }
    }

    public void patron2(int n) {
        int ban = 1;
        for (int i = 0; i < n; i++) {
            if (ban == 1) {
                System.out.print("1");
            }
            if (ban == 2) {
                System.out.print("2");
            }
            if (ban == 3) {
                System.out.print("3");
            }
            if (ban == 4) {
                ban = 0;
                System.out.print("4");
            }
            ban++;
        }


    }

    public void patron3(int n) {
        int ban = 1;
        for (int i = 0; i < n; i++) {
            if (ban == 1) {
                System.out.print("|");
            }
            if (ban == 2) {
                System.out.print("|");
            }
            if (ban == 3) {
                ban = 0;
                System.out.print("*");
            }
            ban++;
        }
    }

    public static void main(String[] args) {
        Patrones a = new Patrones();
        a.patron1(13);
        System.out.println();
        a.patron2(8);
        System.out.println();
        a.patron3(10);
    }
}
