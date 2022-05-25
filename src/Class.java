package Class ;

public class Class {
    public static void main(String[] args) {
        int secNumber = 0;
        for (int i = 100; i <= 999; i++) {

            int number = i;
            int basNumber = 0;
            int tempNumber = number;
            int basValue;
            int result = 0;
            int basPow;


            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;
            }
            tempNumber = number;

            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (int j = 1; j <= basNumber; j++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }
            if (result == number) {
                System.out.println(number + " is a Armstrong number .");
                secNumber++;
            }
        }
        System.out.println("Total armstrog numbers from 100 to 999 : " + sectNumber);
    }
}


        /* *************************************ARMSTRONG CALCULATOR*************************************

        //---------------I will calculate from 1 to 999 , which numbers are Armstrong number---------------//
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        //-----------------------------step number calculate------------------------------------------------//

        int tempNumber = number ;
        int stepNumber =0;

        while (tempNumber!=0) {
            tempNumber /= 10;
            stepNumber++;
        }
        //-----------------------------last step value calculate-------------------------------------------//

        int stepValue;
        int stepPov;
        int result = 0;


        tempNumber = number ;
        while (tempNumber !=0) {
            stepValue = tempNumber % 10;

            //-----------------------------I will calculate pav numbers----------------------------------------//

            stepPov = 1;
            for (int i = 1; i <= stepNumber; i++) {
                stepPov *= stepValue;
            }
            result += stepPov;
            tempNumber /= 10;
        }

        if ( result == number) {
                System.out.println(number + "is Armstrong number.");
        }else {
            System.out.println(number + "is not Armstrong number.");
        }
        */


