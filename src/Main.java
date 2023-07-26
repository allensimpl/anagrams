import javax.swing.*;
import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class Main {
    public static String stringSorter(String testString,int n){
        char[] a = testString.toCharArray();
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=n-2-i;j++){
                    if(a[j]>a[j+1]){
                        char temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
            }
        }
        String testB = new String(a);
        return testB;
    }
    public static boolean anagramChecker(String firstString,String secondString){
        String sortedFirstString = stringSorter(firstString,firstString.length());
        String sortedSecondString = stringSorter(secondString,secondString.length());
        if(sortedFirstString.equals(sortedSecondString)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String firstString = sc.nextLine();
        System.out.println("Enter the second string");
        String secondString = sc.nextLine();
        if(firstString.length()!=secondString.length()){
            System.out.println("It is not Anagram");
            return;
        }
        boolean anagramResult = anagramChecker(firstString,secondString);
        if(anagramResult){
            System.out.println("It is Anagram");
        }else{
            System.out.println("It is not Anagram");
        }
    }
}