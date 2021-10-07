package Robber_Planning;

/*This class is the main class.
  The users can change their input amount of houses in the hardcoded line.
  The maximum money will be calculated by the implementation class.
  After compiling the program, the maximum amount that the robber can rob will be seen in the console.
 
  Name: Hyejin Kim
  Date: 10/7/2021
*/

public class Main {
    public static void main(String[] args){
        Robber_Planning RP = new Robber_Planning();
        int[] user_houses = {3,1,9,2,7}; //The users can change their input amount of houses here.
        int maximum_amount = 0; //Initialize the maximum amount at first.
        maximum_amount = RP.planning(user_houses);
        System.out.println(maximum_amount);
    }
}//Main
