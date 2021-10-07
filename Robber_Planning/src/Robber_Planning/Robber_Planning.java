package Robber_Planning;

/* This class is the implementation class. 
   The maximum amount of money will be calculated recursively. The input values will be inserted by users in the main class.
   In order to calculate them, we need to check two conditions in advance. 
   First, if there is no element in the array, we should return zero.
   Second, if there is only one element in the array, we just return that value as the maximum amount. 
   After checking these conditions, the maximum value is calculated dynamically. */

public class Robber_Planning {
  
  public int planning(int[] houses_money){
    
    int number_houses = houses_money.length; //We need the length of the user input because it will check the boundary in the for loop as below.
    int first_element = houses_money[0]; //Initialize the first element in the array.
    int second_element = max(first_element, houses_money[1]); //The second element will be the maximum number between the first element and the second element in the array.
    //We need to check two base cases.
    //First, if there is no house, then the money will be zero.
    if(number_houses==0){
      return 0;
    }
    //Second, if there is only one house, then the money will be its amount.
    if(number_houses==1){
      return number_houses[0];
    }
    
    int third_element_position = 2;
    
    //This for loop will calculate the maximum amount recursively.
    for(int i= third_element_position; i<houses_money.length; i++){
      int temp = second_element; //We need a temporary int value in order to store that value for comparing the maximum number between the second value and the sum of the third value and first value.
      second_element = max(second_element, first_element + houses_money[i]); 
      first_element = temp; //For the next loop, the second element will be the first element, which will be used for the next recursive calculation.
    }
    return second_element; //Return the maximum number after adding all the elements which are not adjacent each other.
    
}//Robber_Planning
