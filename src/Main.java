import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Hash Table. Press Exit to quit.");
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		for (int i = 0; i < 100; i++) {
			System.out.println("Enter digits: ");
			String key = sc.nextLine();
			if (key.equalsIgnoreCase("EXIT")) {
				break;
			}
			else{
				int hashKey = Integer.parseInt(key);
				if (myMap.containsKey(hashKey)) {
					System.out.println(hashKey + " " + myMap.get(hashKey));
				} else {
					System.out.println("This key value doesnt exist. Please but the respective value to this key: ");
					String number = sc.nextLine();
					myMap.put(hashKey, number);
					System.out.println(hashKey + " " + myMap.get(hashKey));
				}
			}
		}
	}
}
