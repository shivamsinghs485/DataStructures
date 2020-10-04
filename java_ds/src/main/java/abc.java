
// Java implementation to find Minimum
// possible value of the maximum xor
// in an array by choosing some integer
import java.util.*;

class abc{

    // Function to calculate Minimum possible
// value of the Maximum XOR in an array
    static int calculate(Vector<Integer> section, int pos)
    {

        // Base case
        if (pos < 0)
            return 0;

        // Divide elements into two sections
        Vector<Integer> on_section = new Vector<Integer>(),
                off_section = new Vector<Integer>();

        // Traverse all elements of current
        // section and divide in two groups
        for(int el : section)
        {
            if (((el >> pos) & 1) == 0)
                off_section.add(el);
            else
                on_section.add(el);
        }

        // Check if one of the sections is empty
        if (off_section.size() == 0)
            return calculate(on_section, pos - 1);

        if (on_section.size() == 0)
            return calculate(off_section, pos - 1);

        // Explore both the possibilities using recursion
        return Math.min(calculate(off_section, pos - 1),
                calculate(on_section, pos - 1)) +
                (1 << pos);
    }

    // Function to calculate minimum XOR value
    static int minXorValue(int a[], int n)
    {
        Vector<Integer> section = new Vector<Integer>();

        for(int i = 0; i < n; i++)
            section.add(a[i]);

        // Start recursion from the
        // most significant pos position
        return calculate(section, 30);
    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 4;
        int A[] = { 4,7,18,16,14 };

        System.out.print(minXorValue(A, N));
    }
}

