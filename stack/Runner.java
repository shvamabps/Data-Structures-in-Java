package stack;

/**
 * Runner
 */
public class Runner {

    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(15);
        nums.show();
        nums.push(8);
        nums.show();
        nums.push(45);
        nums.show();
        nums.push(4);
        nums.show();

        nums.pop();
        nums.pop();
        nums.pop();
        nums.pop();
        nums.size();
        nums.pop();
    }
}