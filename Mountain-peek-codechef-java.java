import java.util.*;

public class Main {
    public static int[] nextHigherPeak(int[] heights) {
    int[] nextHigher = new int[heights.length];
     Arrays.fill(nextHigher, -1);
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < heights.length; i++) {
      while (!stack.isEmpty() && heights[stack.peek()] < heights[i]) {
        nextHigher[stack.pop()] = heights[i];
      }
        stack.push(i);
    }
    return nextHigher;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; ++i) {
            heights[i] = sc.nextInt();
        }

        int[] result = nextHigherPeak(heights);

        for (int height : result) {
            System.out.print(height + " ");
        }
        System.out.println();
    }
}
