import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder input = new StringBuilder();
        input.append(A);
        input = input.reverse();
        
        if(input.toString().equalsIgnoreCase(A)){
            System.out.println("Yes");
        }
        else
            System.out.println("No");

        
    }
}



