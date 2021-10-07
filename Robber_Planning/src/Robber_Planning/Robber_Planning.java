package Robber_Planning;

public class Robber_Planning {
  public int planning(int[] houses_money){
    int number_houses = houses_money.length;
    int first_element = houses_money[0];
    int second_element = max(first_element, houses_money[1]);
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
    for(int i= third_element_position; i<houses_money.length; i++){
      int temp = second_element;
      second_element = max(second_element, first_element + houses_money[i]);
      first_element = temp;
    }
    return second_element;
    
}
