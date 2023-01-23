import java.util.Scanner;
//Mya
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Data types example

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("What is your age?");
        String age = input.nextLine();

        System.out.println("What is your gpa?");
        String gpa = input.nextLine();

        boolean isRaining = false;

        System.out.println(name + " - " + age + " - " + gpa + " - " + isRaining);


        String city = "Columbus";

        System.out.printf(city);
        System.out.printf(city.toUpperCase());
        //float pi = 3.1415926f;

        int dailyHighs[] = {23,35,63,10,93};

        System.out.println(dailyHighs[0]);

        for(int i = 0; i<5; i ++){
            System.out.println(dailyHighs[i]);
        }

        int sum = 3+2;
        System.out.println(sum);

        double quotient = 10.0/4;
        System.out.println(quotient);

        int i = 1;
        i++;
        System.out.println(i);


        int result = i++ * 2;
        System.out.println(result);




    }
}