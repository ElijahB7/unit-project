/**************************
 Unit 4 - Project
 Text Adventure
 ***************************/
//Fossil effect (Make sure to branch out story, asking the user many questions)
// created by Elijah and My Pops

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("You are walking down by a creek, and spot a weird looking rock. Enter 1 to pick it up. Enter 2 to break the rock, Enter 3 to inspect the rock \n");
        int input = in.nextInt();

        TextQuest(input);
    }
    public static void StoryOne(int input) {
        Scanner in = new Scanner(System.in);
        int inputText = input;

        System.out.print("You picked up the rock!, you go to school and show your friends. Press 2 to see what your friends say! \n");
        while(input != 3) {
            inputText = in.nextInt();
            if(inputText == 2) {
                System.out.print ("Your freinds love the cool rock, it is black in color and is funny looking!, Thank you for play Fossil Effect \n");
            }
        }
    }
    public static void StoryTwo(int inputtwo) {
        Scanner in = new Scanner(System.in);
        int inputText = inputtwo;

        System.out.print("You broke the rock and inside the rock, there was a fossil! Press 2 to take it to school and show your friends!\n");

        while(inputtwo != 3) {
            inputText = in.nextInt();
            if(inputText == 2) {
                System.out.print ("You became super popular! One of your friends dad Mr Gox, is an archeologist and wants to buy it for 21 Bitcoins! Press three to sell the fossil!\n");
            }
            int inputTxt = in.nextInt();
            if(inputTxt == 3) {
                System.out.print("You sold the rock for 21 Bitcoins! Congrats!, Thank you for playing Fossil Effect");
            }
        }
    }

    public static void StoryThree(int inputtwo) {
        Scanner in = new Scanner(System.in);
        int inputText = inputtwo;

        System.out.print("You further inspect the rock, its kinda ugly. Press 2 to throw it across the creek! \n");

        while(inputtwo != 3) {
            inputText = in.nextInt();
            if(inputText == 2) {
                System.out.print ("Wow! that was a far through! Thank you for playing Fossil Effect!\n");
            }
        }
    }

    public static void TextQuest(int textObject) {



        int input = textObject;

        boolean storyState = false;

        if(input == 1 && storyState == false) {
            storyState = true;
            StoryOne(input);
        } else if(input == 2 && storyState == false) {
            storyState = true;
            StoryTwo(input);
        } else if(input == 3 && storyState == false) {
            storyState = true;
            StoryThree(input);
        }

    }

}
