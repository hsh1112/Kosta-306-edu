package ex0203;

public class HelloArgs {

    public static void main(String[] args) {

        System.out.println("args 길이: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}