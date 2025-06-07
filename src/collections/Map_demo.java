package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<>();
		
		List<Integer> list = new ArrayList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		Map<Employee, Integer> employeeMap = new HashMap<>();
		Employee emp =new Employee("Ritwik", "9051543770","riksaha1998@gmail.com" );
		Employee emp2 =new Employee("Ankita", "9051543770","riksaha1998@gmail.com" );
		employeeMap.put(emp, 10);
		employeeMap.putIfAbsent(emp2, 20);
		employeeMap.putIfAbsent(emp2, 30);
		System.out.println(employeeMap.get(emp2));
		
		
		
	}

}
