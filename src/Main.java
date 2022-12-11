import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Random random = new Random();
		int min = 25000;
		int summ = 0;
        int minSalary = 100000;
        int maxSalary = 0;
		int[] salary = new int[30];
			for(int i=0; i<salary.length; i++ ){
				salary[i] = random.nextInt(50000)+min;
				summ += salary[i];
                if (salary[i] < minSalary) minSalary = salary[i];
                if (salary[i] > maxSalary) maxSalary = salary[i];
		}
		System.out.println(Arrays.toString(salary));
		System.out.println("Итоговая сумма: " + summ);
        System.out.println("Минимальная зарплата: " + minSalary);
        System.out.println("Максимальная зарплата: " + maxSalary);
    }
}