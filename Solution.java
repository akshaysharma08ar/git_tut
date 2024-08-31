import java.util.Scanner;

class RandomNumberGenerator implements Runnable{

     int min,max;
    RandomNumberGenerator(){}

    RandomNumberGenerator(int min , int max){
        this.min = min;
        this.max = max;
    }

// Write a Java class named RandomNumberGenerator that generates a random integer between 1 and 100. Implement a method generate() that returns the random number.
    static void generate(){
            int I1 = (int) (1+(Math.random() * 101));
            System.out.println(I1);
    }


// Modify the RandomNumberGenerator class to allow generating a random number within a specified range using a constructor that accepts min and max values.

        void generateRange(){

        int I1 = (int) (min+(Math.random() * max));
        System.out.println(I1);

       }


//     Extend the RandomNumberGenerator class to include a method generateMultiple(int count) that returns an array of random numbers.

        void generateMultiple(int count){

        int arr[] = new int[count];

            for(int i=0 ; i < arr.length ; i++){

                int I1 = (int) (Math.random() * 10);
                arr[i] = I1;

            }
            System.out.println("Array of Random Number : ") ;
            System.out.print("[ ") ;
            for(int i=0 ; i < arr.length ; i++){

               System.out.print(arr[i] + "  ") ;

            }
            System.out.print("]");
        }
    public void run(){
        String s1 = "";
            int I1 = (int) (Math.random() * 10);
            String s3 = String.valueOf(I1);
            s1+=s3;
        System.out.print(s1);
    }
}

class RandomCharacterGenerator implements Runnable{
    //Create a class named RandomCharacterGenerator that generates a random alphabetic character (a-z or A-Z). Implement a method generate() to return the character.
    void generate() {

            char c1 = (char) (65 + (Math.random() * 26));
            System.out.print("Random Character Generat : " + c1);
    }

    public void run(){
        String s1 = "";
        if(Math.random() < 0.5) {
                char c1 = (char) (65 + (Math.random() * 26));
                String s3 = String.valueOf(c1);
                s1 += s3;
        }else{
                char c1 = (char) (97 + (Math.random() * 26));
                String s3 = String.valueOf(c1);
                s1 += s3;

        }
        System.out.print(s1);
    }
}

class RandomPasswordGenerator {

//    Build a RandomPasswordGenerator class that generates a random password of a specified length, including lowercase letters, uppercase letters, and digits.

    void RandomPasswordGenerator(){
        Scanner sc = new Scanner(System.in);
        RandomNumberGenerator rng = new RandomNumberGenerator();
        RandomCharacterGenerator  rcg= new RandomCharacterGenerator();

        System.out.print("Enter password Size : ");
        int user = sc.nextInt();

        int Size = (user - 2)/2;

        System.out.print("Password Generated successfully : ");
        if(user > 2) {
            for (int i = 0; i <= Size; i++) {

                Thread t1 = new Thread(rng);
                Thread t2 = new Thread(rcg);

                t1.start();
                t2.start();
            }
        }else{
            System.out.print("You can create Minimum 2 digit password . we can't able to create less than 2 digit password");
        }
    }
}

class RandomColorPicker{

//    Design a RandomColorPicker class that randomly selects a color from a predefined list (e.g., "Red", "Green", "Blue"). Implement a method pick() that returns the selected color.

    void pick(){
        String color[] = {"Red","Green","Blue","White","Orange","Black","Brown","Yellow"};
        int s1 = (int)(Math.random() * color.length);
        System.out.print(color[s1]);

    }

}

class FactorialCalculation{
//   Write a program that asks the user for a positive integer and then calculates its factorial using a do-while loop. The program should keep asking for a new number until the user enters ze

    void factorialCal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int user = sc.nextInt();

        int fac = user;
        int i = 1;

        if(user < 0){
            System.out.println("Enter Positive number");
            return;
        }else if(user == 0){
            System.out.println(user + " Factorial is  1");
            return;
        }
        do{
            fac *= i;
            i++;
        }while(i < user);

        System.out.println(user + " Factorial is " + fac);
    }
        }

class GuessTheNumber {
     void guessTheNumber() {
        Scanner sc = new Scanner(System.in);
        int RandomNumber = (int) (Math.random() * 101);
//        System.out.println(RandomNumber);

         System.out.println("press '0' for Exit");

        int count = 0;
        do {

            System.out.println("Enter your Number : ");
            int user = sc.nextInt();
            count++;
            if(user == 0){
                System.out.println("Exiting.....");
                return;
            }
            if (user == RandomNumber) {
                System.out.println("You guess right number \n\n");
                if (count == 1) {
                    System.out.print("Cogratulation \n\n You won");
                    System.out.print("\n\n Rs. 2.00cr  ");
                } else if (count > 5) {
                    System.out.println("Cogratulation \n\n You get 10rs Diary Milk");
                } else if (count > 1) {
                    System.out.println("Cogratulation \n\n You get flat 90% OFF Any Online Shopping");
                }
                break;
            } else if (user < RandomNumber) {
                System.out.println("Enter greater number");
            } else if (user > RandomNumber) {
                System.out.println("Enter Smaller number");
            }
        }while(true);
        System.out.print("\nYour guess time is " + count);
        System.out.println();
    }
}


public class Solution{
    public static void main(String args[]){

//        RandomNumberGenerator rng = new RandomNumberGenerator();
//        RandomNumberGenerator.generate();
//        rng.generateRange();
//          rng.generateMultiple(5);

//        RandomCharacterGenerator  rcg= new RandomCharacterGenerator();
//                    rcg.generate();

//        RandomPasswordGenerator rpg = new RandomPasswordGenerator();
//        rpg.RandomPasswordGenerator();

//        RandomColorPicker rcp = new RandomColorPicker();
//        rcp.pick();

//        FactorialCalculation fc = new FactorialCalculation();
//                fc.factorialCal();

        GuessTheNumber gn = new GuessTheNumber();
        gn.guessTheNumber();



    }
}