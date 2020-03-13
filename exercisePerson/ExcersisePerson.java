/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*Create an interactive program.
Ask a user for his/her name. All the following questions and answers should contain his/her name. Also ask for gender (M, F).
Ask for age. Based on age, the program should respond the following:
0-5 : You are too young for this app.
6-18: Oh you are a student
19-40:Well, you must be employed.

The program should provide more details about the age. For example:
If user answers 3, the program should respond: Come back in 3 years when you will be a student.
If user answers 10, the program should respond: Keep up... 8 more years left and afterwards you will make money.
If user answers 25, the program should respond: You finished school 7 years ago.

Also, the program should tell you how old you were in 1980 (if you were born) and how old you will be in 2040.

Then ask the user about his/her favorite season. You have to provide the following options and the user must choose one of them by inserting a number 1-4:
1. Winter
2. Spring
3. Summer
4. Autumn

Based on the answer, respond with a message:
Winter = It must be cold outside
Spring = Ohh, flowers are very beautiful these days
Summer = Let's go for swimming
Autumn = The trees are full of brown leaves

Ask user to enter his/her height and weight. Then find the BMI and print a message:
Underweight   = < 18.5
Normal weight = 18.5â€“24.9
Overweight    = 25â€“29.9
Obesity       = BMI of 30 or greater 
**BMI = kg/meters^2

Now let's find your lucky day. Transform your age to days. Add the digits of the days. If number is more than 6, use the modulo operation with number 7. Based on result find the lucky day.
0 = Monday
1 = Tuesday
...
6 = Sunday
For example 
30 years is 10950 days(1 year = 365 days)
Add digits : 1+0+9+5+0 = 15
15 is larger than 6
15%7 = 1
Lucky day is Tuesday.

The user now wants to go to a club. There is a man in the entrance of the club. Only people that their lucky day is Wednesday can enter. You must also be between 20 and 40. Can you enter? Print the message that the guy tells you at the door. If he doesn't let you pass, he will tell you the reason.
If you can enter and you are 20-25 the guy welcomes you with your name.
If you can enter, you are over 25 and male, the guy welcomes you with title Mr. 
If you are female he will ask you if you are married. If yes he welcomes you Mrs. otherwise Ms.   
******************************* Class Exercise End ***********************
 */
package excersiseperson;

import java.util.Scanner;

/**
 *
 * @author chatz
 */
public class ExcersisePerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name: ");
        String name = input.next();
        System.out.println("What is your gander M for male and F for female: ");
        char gender = input.next().charAt(0);
        System.out.println("How old are you: ");
        int age = input.nextInt();
        while (age > 40) {

            System.out.println("type age between 0-40: ");
            age = input.nextInt();
        }
        respond(age);
        eihtiesForties(age);
        bestSeason();
        bmi(height(), weight());
        int dayForClub= luckyDay(age);
        club(age,dayForClub,name,gender);
        

    }

    static void respond(int age) {
        if (age <= 5) {
            System.out.println("You are too young for this app");
            System.out.println("Come back in" + (6 - age) + "years when you will be a student");

        } else if (age <= 18) {
            System.out.println("Oh you are a student");
            System.out.println("Keep up... " + (18 - age) + "more years left and afterwards you will make money");
        } else if (age <= 40) {
            System.out.println("Well, you must be employed");
            System.out.println("You finished school " + (age - 18) + "years ago");
        }
    }

    static void eihtiesForties(int age) {
        int year = 2020 - age;
        if (year < 1980) {
            System.out.println("in 1980 you were: " + (year - 1980) + "years old");

        } else {
            System.out.println("you weren't born in 1980");
        }
        System.out.println("and in 2040 you will be: " + (2040 - year));
    }

    static void bestSeason() {
        System.out.println("what is your facvorite sesaon: ");
        System.out.println("type only number:\n" + "1. Winter\n" + "2. Spring\n" + "3. Summer\n" + "4. Autumn");
        Scanner input = new Scanner(System.in);
        int season = input.nextInt();
       /* while (season == 1 || season == 2 || season == 3 || season == 4) {
            System.out.println("type only number:\n" + "1. Winter\n" + "2. Spring\n" + "3. Summer\n" + "4. Autumn");
            season = input.nextInt();
        }*/
        if (season == 1) {
            System.out.println("It must be cold outside");
        }
        if (season == 2) {
            System.out.println("Ohh, flowers are very beautiful these days");
        }
        if (season == 3) {
            System.out.println("Let's go for swimming");
        }
        if (season == 4) {
            System.out.println("The trees are full of brown leaves");
        }
    }

    static double height() {
        System.out.println("give me your height");
        Scanner input = new Scanner(System.in);
        double h = input.nextDouble();
        return h;
    }

    static double weight() {
        System.out.println("give me your weight");
        Scanner input = new Scanner(System.in);
        double w = input.nextDouble();
        return w;
    }

    static void bmi(double h, double w) {
        /*Underweight   = < 18.5
Normal weight = 18.5â€“24.9
Overweight    = 25â€“29.9
Obesity       = BMI of 30 or greater 
**BMI = kg/meters^2
*/
        
        double y=w/(h*h);
        if (y<18.5){
            System.out.println("you are uderweight");
            
        }
        else if (y<=24.9){
            System.out.println("you have Normal weight");
        }
        else if (y<=29.9){
            System.out.println("you are overweight");
            
        }
        else{
            System.out.println("you are obesity");
        }
        
    }
    
    static int luckyDay(int age){
          int days=age*365;
        int sum = 0; 
          
        while (days != 0) 
        { 
            sum = sum + days % 10; 
            days = days/10; 
        } 
        if (sum>6){
           int lucDay=sum%7;
           
           if (lucDay==0){
            System.out.println("your lucky day is Monday");
        }
        else if (lucDay==1){
            System.out.println("your lucky day is Tuesday");
        }
        else if (lucDay==2){
            System.out.println("your lucky day is Wednsday");
        }
        else  if (lucDay==3){
            System.out.println("your lucky day is Thursday");
        }
        else if (lucDay==4){
            System.out.println("your lucky day is friday");
        }
        else if (lucDay==5){
            System.out.println("your lucky day is Saturday");
        }
        else{
            System.out.println("your lucky day is Sunday");
            
        }
           return lucDay;
        }
        else{
            return sum;
        }
        

    }
    
    
   /* The user now wants to go to a club. There is a man in the entrance of the club.
    Only people that their lucky day is Wednesday can enter. You must also be between 20 and 40. 
    Can you enter? Print the message that the guy tells you at the door. If he doesn't let you pass, he will tell you the reason.
If you can enter and you are 20-25 the guy welcomes you with your name.
If you can enter, you are over 25 and male, the guy welcomes you with title Mr. 
If you are female he will ask you if you are married. If yes he welcomes you Mrs. otherwise Ms.   
******************************* Class Exercise End ***********************
 */
    static void club(int age,int d,String name,char g){
        if ((d==2)&&(age>=20 && age<=40)){
            if (age>=20&&age<=25){
                System.out.println("welcome "+name);
            }
            else if(g=='M'){
                System.out.println("welcome Mr."+name);
            }
            else if(g=='F'){
                System.out.println("are you married?");
                Scanner input=new Scanner(System.in);
                String merried=input.next();
                if (merried.equals("yes"))
                System.out.println("welcome Mrs."+name);
                else
                    System.out.println("welcome Ms."+name);
            }
        }
        else{
            System.out.println("you can't enter to the club");
        }
    
    }





}
