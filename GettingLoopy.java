package com.company;

public class Main {

    public static void main(String[] args)
    {
        for(int count = 0; count <= 30; count++)
        {
            System.out.println(count);
        }
        for(int count = 30; count >= 0; count--)
        {
            System.out.println(count);
        }
        for(int count = 0; count <= 18; count = count + 3)
        {
            System.out.println(count);
        }
        for(int count = 10; count >= 0; count = count - 2)
        {
            System.out.println(count);
        }
        for (int n = 1; n <= 5; n++)
        {
            for (int t = 1; t <= n; t++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int n = 5; n >= 1; n--)
        {
            for (int t = n; t >= 1; t--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        final int N = 5;
        final int T = 5;

        for (int n = 1; n <= N; n++)
        {
            for (int t = 1; t <= T; t++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
