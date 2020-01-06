package hhh;
import java.io.*;
import java.net.*;
import java.util.regex.*;

/**
 * This program displays all URLs in a web page by matching a regular expression that describes the
 * <a href=...> HTML tag. Start the program as <br>
 * java HrefMatch URL
 * @version 1.01 2004-06-04
 * @author Cay Horstmann
 */
public class Main
{
   public static void main(String[] args)
   {
      try
      {
         String fileName="D:\\集美大学-计算机工程学院.htm";     
         InputStreamReader in = new InputStreamReader(new FileInputStream(fileName));
         StringBuilder input = new StringBuilder();
         int ch;
         while ((ch = in.read()) != -1)
            input.append((char) ch);
         String patternImgString = "img\\s[a-zA-Z]+=\".*.(gif|png|jpg|jpeg)\"";
         Pattern pattern = Pattern.compile(patternImgString, Pattern.CASE_INSENSITIVE);
         Matcher matcher = pattern.matcher(input);

         while (matcher.find())
         {
            int start = matcher.start();
            int end = matcher.end();
            String match = input.substring(start, end);
            System.out.println(match);
         }
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      catch (PatternSyntaxException e)
      {
         e.printStackTrace();
      }
   }
}