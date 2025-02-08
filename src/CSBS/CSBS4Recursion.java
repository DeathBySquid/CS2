import CSBS.Maze;

public class CSBS4Recursion {
    public static String reverse(String str) {
        if (str.length() == 1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static boolean isPalindrome(String str) {
        // racecar, marxism 1   
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
//        System.out.println(reverse("amanaplanacanalpanama"));
        String mazeTxt = "##########\n" +
                "#        #\n" +
                "# ### ## #\n" +
                "# #    # #\n" +
                "# #  # # #\n" +
                "# ## #####\n" +
                "# #      #\n" +
                "# # #  # #\n" +
                "##### ####\n" +
                "#   #     \n" +
                "# #    # #\n" +
                "##########";

        Maze maze = new Maze(mazeTxt);
//        System.out.println(maze);
        maze.escapeMaze2(6, 1);
        Maze maze2 = new Maze(mazeTxt);
//        System.out.println(maze);
        maze2.escapeMaze(6, 1);
    }
}
