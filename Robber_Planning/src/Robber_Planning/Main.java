package Robber_Planning;

/*This class is the main class.
  The users can change their input amount of houses in the hardcoded line.
  The maximum 
*/

public class Main {
    public static void main(String[] args){
        Robber_Planning RP = new Robber_Planning();
        int[] user_houses = {2,7,9,3,1};
        int maximum_amount = 0;
        maximum_amount = RP.planning(user_houses);
        System.out.println(maximum_amount);
    }
}
