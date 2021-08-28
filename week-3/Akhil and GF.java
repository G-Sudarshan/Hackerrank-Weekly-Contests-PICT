/*
After dating for a long time, Akhil is finally going to propose to his girlfriend. She is very strong in mathematics, and will accept his proposal, if and only if Akhil solves a problem given by her. The problem is given below. Help Akhil solve it.

Akhil is given two numbers N and M, and he has to tell her the remainder when  is divided by .

Input Format
The first line contains an integer  i.e. the number of test cases.
Each of the next  lines contain two space separated integers,  and .

Output Format
 lines each containing ouptut for the corresponding test case.

Constraints



Sample Input 00

3
3 3
4 7
5 18
Sample Output 00

0
5   
5
Explanation

111 % 3 = 0
1111 % 7 = 5
11111%18 = 5
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

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER n
     *  2. INTEGER m
     */
    
    public static long power(long a, long b, long c)
{
    if(b==0) 
        return 1;
    if(b==1)
        return a%c;
    if(b%2 == 0)
    {
        long temp = power(a,b/2,c);
        return (temp*temp)%c;
    }
    else
    {
        long temp = power(a,b/2,c);
        temp = (temp*temp)%c;
        return (temp*a)%c;
    }
}

    public static long solve(long n, int m) {
    // Write your code here
        if(n< 6)
    {
        if(n==0)
            return 0;
        if(n==1)    
            return 1;
        if(n==2)
            return 11%m;
        if(n==3)
            return 111%m;
        if(n==4)
            return 1111%m;
        if(n==5)
            return 11111%m;
    }
    if(n%2 == 0)
    {
        long temp = solve(n/2 , m)%m;
        long temp1 = (power(10,n/2,m)*temp + temp)%m;
        return temp1;
    }
    else
    {
        long temp = solve(n/2 , m)%m;
        long temp1 = (power(10,n/2+1,m)*temp + temp*10 + 1)%m;
        return temp1;
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                long n = Long.parseLong(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                long result = Result.solve(n, m);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
