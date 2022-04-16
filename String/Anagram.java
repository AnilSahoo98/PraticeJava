package String;

public class Anagram {
    public static void main(String[] args) {
        String s="malayalam";
        String rev="";
        char ch[]=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--) {
            
            rev=rev+ch[i];
        }
        
        if(rev.equals(s)) {
            System.out.println("ANAGRAM");
        }else {
            System.out.println(" not an ANAGRAM");
        }
    }
}