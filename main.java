import java.util.*;
 public class Main {
  public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
    String s=sc.nextLine();      //input to be taken as x,y,z
    String s2=sc.nextLine();    //String to be compared 
    String[]sa=s.split(",");
    int count=0;
    ArrayList<Character> sal = new ArrayList <Character>();
    for(int i=0;i<sa.length;i++)
      {
        char c=sa[i].charAt(0);
        sal.add(c);
      }
    for(int i=0;i<s2.length();i++) 
    {
       boolean con =sal.contains(s2.charAt(i));
        if(con==true)
        {
          count++;
        }
      }
    if(count==0)
      {
        System.out.println(" the string has 0 lowercase letters defined by me");
      }
    else{
    System.out.println(" the string has "+count+" lowercase letters defined by me");
    }
  }
}
