/* import 8 */

public class keepAdding
{
    /*
     * Demonstrates recursion using additive operations.
     * Pre: int num < 2
     * Post: int num >= 2
     */
    public static int add(int num)
    {
        if(num < 2)
        {
            return add(num + 1);
        }
        else
        {
            return num;
        }
    }

    /*
     * Calls the recursive method add().
     */
    public static void main(String[] args)
    {
        System.out.println(add(-4)); // prints 2
        System.out.println(add(0)); // prints 2
        System.out.println(add(2)); // prints 2
        System.out.println(add(5)); // prints 5
    }
}
