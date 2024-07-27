package Project;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
	static private List<User> users = new ArrayList<>();
	static private List<Driver> drivers = new ArrayList<>();
	private Driver driver;
	Scanner sc = new Scanner(System.in);
	
	public Login() {
		
	}
	
	public Login(String type, String name, String pass) {
		if(type.equals("user")) {
			boolean login = checkUserLogin(name,pass);
			if(login) {
				new UserPanel(name);
			}
			else {
				new loginFrame(type);
			}
		}
		else if(type.equals("driver")) {
			boolean login = checkDriverLogin(name,pass);
			if(login) {
				new DriverPanel(driver);
			}
			else {
				new loginFrame(type);
			}
		}
		else {
			if(name.equals("Admin") && pass.equals("admin")) {
				new adminPanel();
			}
			else new loginFrame(type);
		}
	}
	private boolean checkDriverLogin(String n, String p) {
		getDrivers();
		for(Driver driver: drivers) {
			if (driver.getName().equals(n) && driver.getPass().equals(p)) {
				this.driver = driver;
                return true;
            }
		}
		return false;
	}
	public List<Driver> getDrivers() {
		try (DataInputStream inputStream = new DataInputStream(new FileInputStream("Drivers.dat"))) {
            while (true) {
            	String name, email, pass, carName, locs;
            	
                while (true) {
                	name = inputStream.readUTF();
                	email = inputStream.readUTF();
                	pass = inputStream.readUTF();
                	carName = inputStream.readUTF();
                	locs = inputStream.readUTF();
                	Driver d = new Driver(locs);
					Driver driver = new Driver(name, email, pass, carName, d.getLoc_id_str_arr());
                	drivers.add(driver);
                }
            }
        } catch (EOFException e) {
            // Reached end of file
        } catch (Exception e) {
//            e.printStackTrace();
        	System.out.println("No record found :(");
        }

        return drivers;
	}
	private boolean checkUserLogin(String n, String p) {
		getUsers();
		for(User user: users) {
			if (user.getName().equals(n) && user.getPassword().equals(p)) {
                return true;
            }
		}
		return false;
	}
	public List<User> getUsers() {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("Users.dat"))) {
        	String name, email, password;
            while (true) {
            	name = inputStream.readUTF();
            	email = inputStream.readUTF();
            	password = inputStream.readUTF();
            	User user = new User(name, email, password);
            	users.add(user);
            }
        } catch (EOFException e) {
            // Reached end of file
        } catch (Exception e) {
//            e.printStackTrace();
//        	System.out.println("No record found :(");
        }

        return users;
    }
}