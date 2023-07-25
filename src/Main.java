import java.util.Scanner;

public class Main {
    public static boolean anagramChecker(String firstString,String secondString){
        int[] characters = new int[256];
        if(firstString.length()!=secondString.length()){
            return false;
        }
        for(int i=0;i<=firstString.length()-1;i++){
            int x = firstString.charAt(i);
            characters[x]++;
        }
        for(int i=0;i<=secondString.length()-1;i++){
            int x = secondString.charAt(i);
            characters[x]--;
        }

        for(int i=0;i<=255;i++){
            if(characters[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String firstString = sc.nextLine();
        System.out.println("Enter the second string");
        String secondString = sc.nextLine();
        boolean anagramResult = anagramChecker(firstString,secondString);
        if(anagramResult){
            System.out.println("It is Anagram");
        }else{
            System.out.println("It is not Anagram");
        }
    }
}