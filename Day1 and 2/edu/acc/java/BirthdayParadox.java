

//java.util.Random
// int nextInt()
// pick a random birthday
//loop picking birthdays until match keeping count of loop count
//when duplicate found save loop count in an array
//do loop for n number of samples
//print average of loop count array

package edu.acc.java;
import java.util.Random;
public class BirthdayParadox {

   public static void main (String[] args) {
   Random randy = new java.util.Random();
   int compareToBirthday = randy.nextInt(366);
   int [] looping = new int[1000];
   int total;
   for (int i=0; i < 1000; i++){
       int count = 1;
       while(randy.nextInt(366) != compareToBirthday){
           count++;
       }
       looping[i]=count;
       //System.out.println("looping[" + i + "] is equal to " + count);
    }
    int sum = 0;
    for (int item : looping){
        sum += item;
    }
    System.out.println("Average is " + sum/1000.);
  }
}
