import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 6. Степени двойки до N Ввод: N (N ≥ 1). Вывести: 1 2 4 8 ... пока число ≤ N.
        Scanner sc = new Scanner(System.in);
/*        System.out.println("Введите количество чисел");
        int N = sc.nextInt();
        long i;
        for (i = 1; i <= 10; i *= 2) {
            System.out.print(i + " ");
        }
    }*/
        //7. Сумма цифр числа Ввод: неотрицательное целое n. Вывести: сумму его цифр.
/*        System.out.println("Введите число");
        int N = sc.nextInt();
        int n = N;
        int sum = 0;
        for (; N > 0; N/=10) {
            sum += N % 10;
        }
        System.out.println("Сумма цифр числа " + n + " = " + sum);
    }*/
        //8. Разворот числа Ввод: одно число n. Вывести: n в обратном порядке.
/*        System.out.println("Введите число");
        int N = sc.nextInt();
        int obr = 0;
        for (; N > 0; N /= 10) {
            obr = obr * 10 + N % 10;
        }
        System.out.println(obr);
    }*/
        // 9. Проверка числа на простоту Ввод: n (n ≥ 2). Вывести: YES, если простое, иначе NO.
/*        int n = sc.nextInt();
        boolean prosto = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prosto = false;
                break;
            }
        }
        System.out.println(prosto ? "YES" : "NO");
    }*/
        // 10. Арифметическая прогрессия Ввод: a, d, n. Вывести: первые n членов прогрессии: a, a+d, a+2d, ..
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i <= n; i ++) {
            int prog = a + i * b;
            System.out.print(prog + " " );
        }
    }
}