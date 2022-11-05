import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boy boy1 = new Boy();
        boy1.setFulName("Akyl Akylov");
        boy1.setAga(19);
        boy1.setHobby("Basketbol");
        boy1.setAducation("Worker");

        Boy boy2 = new Boy();
        boy2.setFulName("Kayrat Kayratov");
        boy2.setAga(18);
        boy2.setHobby("Tennis");
        boy2.setAducation("Student");

        Boy boy3 = new Boy();
        boy3.setFulName("Nurlan Nurlanov");
        boy3.setAga(18);
        boy3.setHobby("Footbol");
        boy3.setAducation("Student");

        Boy boy4 = new Boy();
        boy4.setFulName("Sabir Sabirov");
        boy4.setAga(16);
        boy4.setHobby("Game");
        boy4.setAducation("Schoolboy");

        Boy[] boys = {boy1, boy2, boy3, boy4};
        Scanner scanner = new Scanner(System.in);
        String fulName = scanner.nextLine();
        getInfo(fulName, boys);

    }

    public static void getInfo(String fulName, Boy[] boys) {
        for (Boy boy : boys) {
            if(boy.getFulName().equals(fulName))
                if (boy.getAga()>18) {
                   System.out.println(fulName + ": Armiaga bar");
                    break;
                } else if (boy.getAga()==18) {
                    System.out.println(fulName + ": Bul okup jatat");
                    break;
                } else  {
                    System.out.println(fulName + ": Armiaga jashy jetelek");
                    break;
                }
            }
        }
    }
