package basicInheritence;

public class MovieSystem {

    public static class User{

        private String name;
        private String email;

        public void setName(String name){this.name = name;}
        public void setEmail(String email){this.email = email;}

        public String getName(){return name;}
        public String getEmail(){return email;}

        public void login()
        {
            System.out.println("--------------- Wellcome"+name+" -------------");
        }
        public void watchMovie()
        {
            System.out.println("Watch Movie with Add and 480p");
        }
    }

    public static class PremiumUser extends User{

        @Override
        public void login()
        {
            super.login();
        }

        @Override
        public void watchMovie()
        {
            System.out.println("Watch Move With High Quality, Add free abd 1080p");
        }

        public void showProfile(){
            System.out.println("Name: "+ getName());
            System.out.println("Email: "+getEmail());
        }
    }

     public static void main(String[] args) {

        User u1 = new User();
        PremiumUser u2 = new PremiumUser();

        u1.setName("Lakhan Kumar");
        u1.setEmail("lakhan@gmail.com");;

         u2.setName("Yogesh Kumar");;
         u2.setEmail("Yogesh@gmail.com");;

        u1.login();
        u1.watchMovie();

         System.out.println();

         u2.login();
         u2.watchMovie();
         u2.showProfile();
    }
}
