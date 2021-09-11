/*

Roman Numerals 8
Problem
Submissions
Leaderboard
Discussions
Roman numerals are represented by seven different symbols:I,V,X,L,C,DandM.Given an integer, convert it to a roman number.

SymbolValue

I 1
V 5
X 10
L 50
C 100
D 500
M 1000
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is notIIII. Instead, the number four is written asIV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written asIX. There are six instances where subtraction is used:

I can be placed beforeV(5) andX(10) to make 4 and 9.
X can be placed beforeL(50) andC(100) to make 40 and 90.
C can be placed beforeD(500) andM(1000) to make 400 and 900
Input Format

Number N

Constraints

1 <= N <=3999

Output Format

The Roman Symbol


*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) {

        // Write your code here
        // String s = "";
        StringBuilder s = new StringBuilder();
        int num = 0;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        
        if(num>=1000){
            s.append('M');
            if(num>=2000){
                s.append('M');
            }
            if(num>=3000){
                s.append('M');
            }
        }
        
        num = num % 1000;
        
        if(num>=500){
            if(num>=900){
                s.append('C');
                s.append('M');
            }else{
                s.append('D');
                if(num>=600){
                    s.append('C');
                }
                if(num>=700){
                    s.append('C');
                }
                if(num>=800){
                    s.append('C');
                }
            }
        }
        else{
            if(num>=400){
                s.append('C');
                s.append('D');
            }else if(num>=300){
                s.append('C');
                s.append('C');
                s.append('C');
            }else if(num>=200){
                s.append('C');
                s.append('C');
            }else if(num>=100){
                s.append('C');
            }
        }
        num = num % 100;
        
        if(num >= 50){
            if(num>=50){
                if(num>=90){
                    s.append('X');
                    s.append('C');
                }
                else{
                    s.append('L');
                    if(num >= 60){
                        s.append('X');
                    }
                    if(num >= 70){
                        s.append('X');
                    }
                    if(num >= 80){
                        s.append('X');
                    }
                }
            }
        }else {
            if(num >= 40){
                s.append('X');
                s.append('L');
            }else if(num>=30){
                s.append('X');
                s.append('X');
                s.append('X');
            }else if(num>=20){
                s.append('X');
                s.append('X');
            }else if(num>=10){
                s.append('X');
            }
        }
        
        num = num % 10;
        
        switch(num){
            case 1: s.append('I'); break;
            case 2: s.append('I'); s.append('I');  break;
            case 3: s.append('I'); s.append('I'); s.append('I'); break;
            case 4: s.append('I'); s.append('V'); break;
            case 5: s.append('V'); break;
            case 6: s.append('V'); s.append('I'); break;
            case 7: s.append('V'); s.append('I'); s.append('I'); break;
            case 8: s.append('V'); s.append('I'); s.append('I'); s.append('I'); break;
            case 9: s.append('I'); s.append('X'); break;
            case 10: s.append('X'); break;
        }
        
        System.out.println(s.toString());

    }
}
