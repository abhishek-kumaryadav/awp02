import data_models.Car;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
public static void main() {
    boolean login = false;
    while (login == false) {
        System.out.println("Enter 0 for login and 1 for registration");
        Scanner in = new Scanner(System.in);
        int select = Integer.parseInt(in.nextLine());
        if (select == 0) {
            //login
            //if login successful
            //login=true;
        } else if (select == 1) {
            //registration
        } else
            System.out.println("Enter valid argument");
    }
    int booked = 0;
    while (booked == 0) {
        String path = "C:\\Users\\abhi\\IdeaProjects\\awp01\\locations";
        Location loc[] = Location.Readloc(path);
        //print locations
        System.out.println("Select numbered location for pickup");
        Scanner in = new Scanner(System.in);
        int pickup = Integer.parseInt(in.nextLine());
        System.out.println("Select numbered location for drop-off");
        in = new Scanner(System.in);
        int drop = Integer.parseInt(in.nextLine());
        System.out.println("Select numbered location for via, enter 0 if via not applicable");
        in = new Scanner(System.in);
        int via = Integer.parseInt(in.nextLine());

    }
}
}
class Location {
    String name;
    int x_cord;
    int y_cord;
    public Location(String string){
        String[] arrOfStr = string.split(" ", 0);
        this.name=arrOfStr[0];
        this.x_cord=Integer.parseInt(arrOfStr[1]);
        this.y_cord=Integer.parseInt(arrOfStr[2]);
    }
    static int getDistance(Location a, Location b){
        int distance= (int) StrictMath.sqrt(((a.y_cord-b.y_cord)*(a.y_cord-b.y_cord))+((a.x_cord-b.x_cord)*(a.x_cord-b.x_cord)));
        return distance;
    }
    static Location[] Readloc(String path){
        Location loc[]=new Location[4];
        try {
            Scanner scanner = new Scanner(new File(path));
            int i=0;
            while (scanner.hasNextLine()) {
                Location a= new Location(scanner.nextLine());
                loc[i]=a;
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return loc;
    }
}
class Driver {
    String name;
    int mob;
    String license;
    public Driver(String string) {
        String[] arrOfStr = string.split(" ", 0);
        this.name=arrOfStr[0];
        this.mob=Integer.parseInt(arrOfStr[1]);
        this.license=arrOfStr[2];
    }
    static Driver[] getdriverarray(String path){
        Driver d[]=new Driver[4];
        try {
            Scanner scanner = new Scanner(new File(path));
            int i=0;
            while (scanner.hasNextLine()) {
                Driver a= new Driver(scanner.nextLine());
                d[i]=a;
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return d;
    }

}
