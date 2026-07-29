public class UserReport {

    public void generate(UserService userService) {

        System.out.println("\n===== USER REPORT =====");

        System.out.println("Total Users : " + userService.getCount());

        for (int i = 0; i < userService.getCount(); i++) {

            User user = userService.getUser(i);

            System.out.println("---------------------");
            System.out.println("Name : " + user.getName());
            System.out.println("Email : " + user.getEmail());
            System.out.println("ID : " + user.getId());
        }
    }
}