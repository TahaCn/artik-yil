import java.util.Scanner;

public class artik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yıl;
        System.out.println("Yılı giriniz : ");
        yıl = input.nextInt();

        if((yıl%4 == 0) && (yıl%100 != 0) || (yıl%400 == 0)){
            System.out.println(yıl + " Artık yıldır. ");
        } else
            System.out.println(yıl + " Artık yıl değildir.");



    }


}

