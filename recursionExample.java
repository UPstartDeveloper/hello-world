/* import 8 */

public class keepAdding
{
    /*
     * Demonstrates recursion using additive operations.
     * Pre: int num
     * Post: int num >= 2
     */
    public static int twoOrMore(int num)
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
     * Calls the recursive method twoOrMore().
     */
    public static void main(String[] args)
    {
        System.out.println(add(0)); // prints 2
        System.out.println(add(2)); // prints 2
        System.out.println(add(5)); // prints 5
    }
}
