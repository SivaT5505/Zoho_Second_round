/*
Output:
abbccccccccccc
*/

import java.util.*;

public class TimesofCharacter {
    public static void main(String[] args) {
      
      String s = "a1b2c11";
      String num = "";
      char letter = ' ';
      
      for(char c : s.toCharArray())
      {
        if(!(c >= '0' && c <= '9'))
        {
          if(num!="")
          {
          int n = Integer.parseInt(num);
          for(int i =0; i<n;i++)
          {
            System.out.print(letter);
          }
          }
          letter = c;
          num = "";
        }
        else
        {
          num+=c;
        }
      }
      int n = Integer.parseInt(num);
      for(int i =0; i<n;i++)
      {
        System.out.print(letter);
      }
      
       
    }
}
