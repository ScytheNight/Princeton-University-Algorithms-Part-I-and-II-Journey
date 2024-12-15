public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner names = new Scanner(System.in);
        System.out.println("Enter 2 names");

        String name1 = names.nextLine();
        String name2 = names.nextLine();

        System.out.println("Hello " + name1 + " and " + name2 + ".\n");
        System.out.println("Goodbye " + name2 + " and " + name1 + ".\n");

        names.close();
    }
}
