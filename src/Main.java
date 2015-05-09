/**
 * Your task is to write a program which determines (calculates) the
 * percentage ratio of lowercase and uppercase letters of a given
 * string of letters.
 *
 * For each line of input, print the percentage ratio of uppercase
 * and lowercase letters rounded to the second digit after the point.
 *
 * @author: todyerutz@plainintricacy.wordpress.com
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your phrase:");
        String in = input.nextLine();
        input.close();
        int sumL=0, sumU=0;
        for(int i=0; i<in.length(); i++){
            if(!in.substring(i,i+1).equals(in.substring(i, i + 1).toLowerCase())){
                sumU+=1;
            }else{
                sumL+=1;
            }
        }
        double ratioU = (double)(sumU)/(double)(in.length())*100;
        double ratioL = (double)(sumL)/(double)(in.length())*100;
        System.out.println("Lowercase percentage: " + new DecimalFormat("##.00").format(ratioL));
        System.out.println("Uppercase percentage: " + new DecimalFormat("##.00").format(ratioU));
    }
}
