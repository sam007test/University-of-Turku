public class Longest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No parameters");
        } else {
            String longest = args[0];
            for (int i = 1; i < args.length; i++) {
                if (args[i].length() > longest.length()) {
                    longest = args[i];
                }
            }
            System.out.println("Longest parameter: " + longest);
        }
    }
}
