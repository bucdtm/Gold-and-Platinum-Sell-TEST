import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float gold24 = 99.80F; // Hi, im really into coding atm, so I want you to solve some problems. Do some testing with all the variables you want, I really need advice
        float gold22 = 91.50F; // here I want the price to change according to the real market, not real time, but make the console LOOK for the info and pull it
        float gold18 = 74.90F;
        float plat1 = 1.17F;

        System.out.println("NOTE!!!");
        System.out.println(); //I want to stop making only 1 or 2 options, I want to learn how to make inputs be with words and not only numbers
        System.out.println("1 always means yes");
        System.out.println();
        System.out.println("2 always means no");
        System.out.println();

            Scanner YN = new Scanner(System.in);


            System.out.println("Hello, are you interested in selling some gold?");
            System.out.println();
            System.out.println("1: Yes");
            System.out.println("2: No");
            System.out.println();

            int YorN = YN.nextInt(); // here for example
            if (YorN == 1) {

                System.out.println("Which gold you would like to sell");

                System.out.println();

                System.out.println("24Kt");
                System.out.println("22Kt");
                System.out.println("18Kt");

                Scanner GoldSelection = new Scanner(System.in);
                int GoldSelect = GoldSelection.nextInt();

                if (GoldSelect == 24) { // maybe the user could write 24Kt and the code will crash, how do I solve this issue?

                    System.out.println("Perfect, 24 kt gold is currently set to " + gold24 + (" € per gram"));
                    Scanner GoldAmount = new Scanner(System.in);
                    System.out.println();
                    System.out.println("How much gold do you want to sell?");
                    System.out.println();
                    int GoldAm = GoldAmount.nextInt(); // float issue here?
                    System.out.println("Your sell price is " + gold24*GoldAm + ("€ ")); // for all the prints, I want them to only pull .2f and it always crashes when I use decimals, float issue??

                } else if (GoldSelect == 22) {
                    System.out.println("Perfect, 22 kt gold is currently set to " + gold22 + (" € per gram"));
                    Scanner GoldAmount = new Scanner(System.in);
                    System.out.println();
                    System.out.println("How much gold do you want to sell?");
                    System.out.println();
                    int GoldAm = GoldAmount.nextInt();
                    System.out.println("Your sell price is " + gold22*GoldAm + ("€ "));

                } else if (GoldSelect == 18) {
                    System.out.println("Perfect, 18 kt gold is currently set to " + gold18 + (" € per gram"));
                    System.out.println();
                    Scanner GoldAmount = new Scanner(System.in);
                    System.out.println("How much gold do you want to sell?");
                    int GoldAm = GoldAmount.nextInt();
                    System.out.println();
                    System.out.println("Your sell price is " + gold18*GoldAm + ("€ "));
                }

            } else if (YorN == 2) {
                Scanner FN = new Scanner(System.in);

                System.out.println("Maybe Platinum or smth?");

                int YesodNo = FN.nextInt();
                if (YesodNo == 1) {

                    System.out.println("Perfect");

                    System.out.println();

                    System.out.println("The price is currently set to: " + plat1 + "€ per gram");

                    System.out.println();

                    Scanner Plat = new Scanner(System.in);
                    System.out.println("How many grams do you want to sell?");
                    int PlatGram = Plat.nextInt();

                    System.out.println();

                    System.out.println("Perfect, your sell price will be:" + PlatGram * plat1 + ("€"));

                } else if (YesodNo == 2) {

                    System.out.println("Then goodbye!");

                }
            }else {
                System.out.println("Sorry, that's not an option");
            }


    }

}