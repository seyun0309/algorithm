import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String newA = "";
        
        for(int i=0; i<a.length(); i++) {
            if('a' <= a.charAt(i) && a.charAt(i) <= 'z') {
                newA += Character.toUpperCase(a.charAt(i));
            } else {
                newA += Character.toLowerCase(a.charAt(i));
            }
        }
        
        System.out.println(newA);
    }
}