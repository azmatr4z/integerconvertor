package integerConvertor;

import java.util.HashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.assertTrue;

public class MyTest {

	
	@Test
	public void convertorTest() {
		String result = "";
		
		// Created a map of random integers and there corresponding Roman Numerals.
		// The string were taken from https://www.rapidtables.com/math/symbols/roman_numerals.html
		Map<Integer, String>testMap = new HashMap<Integer, String>();
		
		testMap.put(1, "I");
		testMap.put(2, "II");
		testMap.put(4, "IV");
		testMap.put(9, "IX");
		testMap.put(11, "XI");
		testMap.put(49, "XLIX");
		testMap.put(50, "L");
		testMap.put(51, "LI");
		testMap.put(100, "C");
		testMap.put(999, "CMXCIX");
		testMap.put(1901, "MCMI");
		testMap.put(1066, "MLXVI");
		testMap.put(4098, "MMMMXCVIII");
		testMap.put(1999, "MCMXCIX");
		testMap.put(567, "DLXVII");
		testMap.put(42, "XLII");
		testMap.put(790, "DCCXC");
		testMap.put(2019, "MMXIX");
		testMap.put(842, "DCCCXLII");
		testMap.put(235, "CCXXXV");
		testMap.put(78, "LXXVIII");
		
		// Just using a for loop as if there's an error you will still need the string printed with the values that are being compared.
		for(Map.Entry<Integer, String> entry: testMap.entrySet()) {
			result = Solution.integerConvertor(entry.getKey());
			assertTrue("String given " + entry.getValue() + " equals String generated: " + result, result.equals(entry.getValue()));
		
		}
		
	}
	
}
