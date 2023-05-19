import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class GSTest {
	static ArrayList<Integer> intList;
	static ArrayList<Double> douList;
	static ArrayList<String> strList;
	
	@BeforeAll
	static void ArrayListSetup() {
		intList = new ArrayList<>(5);
		douList = new ArrayList<>(5);
		strList = new ArrayList<>(5);
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		douList.add(1.0);
		douList.add(2.0);
		douList.add(3.0);
		douList.add(4.0);
		douList.add(5.0);
		
		strList.add("hello");
		strList.add("how");
		strList.add("are");
		strList.add("you");
		strList.add("doing");
	}
	//
	// GenericStack constructor
	//
	@Test
	void GSConstructorIntLengthTest() {
		GenericStack<Integer> GS = new GenericStack<>(1);
		assertEquals(1, GS.getLength(), "Length of Int GS is not 1");
	}
	
	@Test
	void GSConstructorDoubleLengthTest() {
		GenericStack<Double> GS = new GenericStack<>(1.0);
		assertEquals(1, GS.getLength(), "Length of Double GS is not 1");
	}
	
	@Test
	void GSConstructorStringLengthTest() {
		String str = "hello";
		GenericStack<String> GS = new GenericStack<>(str);
		assertEquals(1, GS.getLength(), "Length of String GS is not 1");
	}
	
	@Test
	void GSConstructorIntDeleteTest() {
		GenericStack<Integer> GS = new GenericStack<>(10);
		assertEquals(10, GS.delete(), "Delete of int GS failed");
	}
	
	@Test
	void GSConstructorDoubleDeleteTest() {
		GenericStack<Double> GS = new GenericStack<>(2.0);
		assertEquals(2.0, GS.delete(), "Delete of double GS failed");
	}
	
	@Test
	void GSConstructorStringDeleteTest() {
		String str = "hello";
		GenericStack<String> GS = new GenericStack<>(str);
		assertEquals(str, GS.delete(), "Delete of String GS failed");
	}
	
	//
	// GenericList methods
	//
	@Test
	void GSAddIntegerLengthTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.add(intList.get(i));
		}
		assertEquals(intList.size(), GS.getLength(), "GS add integer length failed");
	}
	
	@Test
	void GSAddDoubleLengthTest() {
		GenericStack<Double> GS = new GenericStack<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GS.add(douList.get(i));
		}
		assertEquals(douList.size(), GS.getLength(), "GS add double length failed");
	}
	
	@Test
	void GSAddStringLengthTest() {
		GenericStack<String> GS = new GenericStack<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GS.add(strList.get(i));
		}
		assertEquals(strList.size(), GS.getLength(), "GS add string length failed");
	}
	
	@Test
	void GSDeleteIntegerLengthTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		GS.delete();
		assertEquals(0, GS.getLength(), "GS delete integer length failed");
	}
	
	@Test
	void GSDeleteDoubleLengthTest() {
		GenericStack<Double> GS = new GenericStack<>(douList.get(0));
		GS.delete();
		assertEquals(0, GS.getLength(), "GS delete double length failed");
	}
	
	@Test
	void GSDeleteStringLengthTest() {
		GenericStack<String> GS = new GenericStack<>(strList.get(0));
		GS.delete();
		assertEquals(0, GS.getLength(), "GS delete string length failed");
	}
	
	@Test
	void GSDumpListIntegerTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.add(intList.get(i));
		}
		Collections.reverse(intList);
		assertEquals(intList, GS.dumplist(), "GS integer dumplist failed");
	}
	
	@Test
	void GSDumpListDoubleTest() {
		GenericStack<Double> GS = new GenericStack<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GS.add(douList.get(i));
		}
		Collections.reverse(douList);
		assertEquals(douList, GS.dumplist(), "GS double dumplist failed");
	}
	
	@Test
	void GSDumpListStringTest() {
		GenericStack<String> GS = new GenericStack<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GS.add(strList.get(i));
		}
		Collections.reverse(strList);
		assertEquals(strList, GS.dumplist(), "GS string dumplist failed");
	}
	
	@Test
	void GSDumpListIntegerlengthTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.add(intList.get(i));
		}
		GS.dumplist();
		assertEquals(0, GS.getLength(), "GS integer dumplist length failed");
	}
	
	@Test
	void GSDumpListDoubleLengthTest() {
		GenericStack<Double> GS = new GenericStack<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GS.add(douList.get(i));
		}
		GS.dumplist();
		assertEquals(0, GS.getLength(), "GS double dumplist length failed");
	}
	
	@Test
	void GSDumpListStringLengthTest() {
		GenericStack<String> GS = new GenericStack<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GS.add(strList.get(i));
		}
		GS.dumplist();
		assertEquals(0, GS.getLength(), "GS string dumplist length failed");
	}
	
	@Test
	void GSIntegerGetTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.add(intList.get(i));
		}
		for(int i = 0; i < intList.size(); i++) {
			assertEquals(intList.get(intList.size()-i-1), GS.get(i), "GS integer get failed");
		}
	}
	
	@Test
	void GSDoubleGetTest() {
		GenericStack<Double> GS = new GenericStack<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GS.add(douList.get(i));
		}
		for(int i = 0; i < douList.size(); i++) {
			assertEquals(douList.get(douList.size()-i-1), GS.get(i), "GS double get failed");
		}
	}
	
	@Test
	void GSStringGetTest() {
		GenericStack<String> GS = new GenericStack<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GS.add(strList.get(i));
		}
		for(int i = 0; i < strList.size(); i++) {
			assertEquals(strList.get(strList.size()-i-1), GS.get(i), "GS string get failed");
		}
	}
	
	@Test
	void GSIntegerSetTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.add(intList.get(i));
		}
		int newVal = 20;
		int prevEle = GS.set(1, newVal);
		assertEquals(intList.get(intList.size() - 2), prevEle, "GS integer set return failed");
		assertEquals(newVal, GS.get(1), "GS integer set modify failed");
	}
	
	@Test
	void GSDoubleSetTest() {
		GenericStack<Double> GS = new GenericStack<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GS.add(douList.get(i));
		}
		double newVal = 20.5;
		double prevEle = GS.set(1, newVal);
		assertEquals(douList.get(douList.size() - 2), prevEle, "GS double set return failed");
		assertEquals(newVal, GS.get(1), "GS double set modify failed");
	}
	
	@Test
	void GSStringSetTest() {
		GenericStack<String> GS = new GenericStack<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GS.add(strList.get(i));
		}
		String newVal = "Insert";
		String prevEle = GS.set(1, newVal);
		assertEquals(strList.get(strList.size() - 2), prevEle, "GS string set return failed");
		assertEquals(newVal, GS.get(1), "GS string set modify failed");
	}
	
	@Test
	void GSIntegerGetHeadTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.add(intList.get(i));
		}
		assertEquals(intList.get(intList.size() - 1), GS.getHead().data, "GS integer get head failed");
	}
	
	@Test
	void GSDoubleGetHeadTest() {
		GenericStack<Double> GS = new GenericStack<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GS.add(douList.get(i));
		}
		assertEquals(douList.get(douList.size() - 1), GS.getHead().data, "GS double get head failed");
	}
	
	@Test
	void GSStringGetHeadTest() {
		GenericStack<String> GS = new GenericStack<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GS.add(strList.get(i));
		}
		assertEquals(strList.get(strList.size() - 1), GS.getHead().data, "GS string get head failed");
	}
	
	@Test 
	void GSIteratorHasNext() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		Iterator<Integer> it = GS.iterator();
		for(int i = 0; i < intList.size(); i++) {
			assertEquals(true, it.hasNext(), "GS iterator has next failed");
			it.next();
		}
	}
	
	@Test 
	void GSIteratorNext() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		Iterator<Integer> it = GS.iterator();
		int idx = intList.size()-1;
		while(it.hasNext()) {
			assertEquals(intList.get(idx), it.next(), "GS iterator next failed");
			idx--;
		}
	}
	
	@Test 
	void GSReverseIteratorHasNext() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		Iterator<Integer> it = GS.descendingIterator();
		for(int i = intList.size() - 1; i >= 0; i--) {
			assertEquals(true, it.hasNext(), "GS reverse iterator has next failed");
			it.next();
		}
	}
	
	@Test 
	void GSReverseIteratorNext() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		Iterator<Integer> it = GS.descendingIterator();
		int idx = 0;
		while(it.hasNext()) {
			assertEquals(intList.get(idx), it.next(), "GS reverse iterator next failed");
			idx++;
		}
	}
	
	@Test
	void GSListIteratorHasNext() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		for(int i = 0; i < GS.getLength(); i++) {
			ListIterator<Integer> it = GS.listIterator(i);
			for(int j = i; j < intList.size(); j++) {
				assertEquals(true, it.hasNext(), "GS list iterator has next failed");
				it.next();
			}
		}
	}
	
	@Test
	void GSListIteratorNext() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		for(int i = 0; i < GS.getLength(); i++) {
			ListIterator<Integer> it = GS.listIterator(i);
			int idx = i;
			while(it.hasNext()) {
				assertEquals(intList.get(intList.size()- idx- 1), it.next(), "GS list iterator next failed");
				idx++;
			}
		}
	}
	
	@Test
	void GSListIteratorHasPrevious() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		for(int i = 0; i < GS.getLength(); i++) {
			ListIterator<Integer> it = GS.listIterator(i);
			for(int j = i; j >= 0; j--) {
				assertEquals(true, it.hasPrevious(), "GS list iterator has previous failed");
				it.previous();
			}
		}
	}
	
	@Test
	void GSListIteratorPrevious() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		for(int i = GS.getLength() - 1; i >= 0; i--) {
			ListIterator<Integer> it = GS.listIterator(i);
			int idx = i;
			while(it.hasPrevious()) {
				assertEquals(intList.get(intList.size() - idx - 1), it.previous(), "GS list iterator previous failed");
				idx--;
			}
		}
	}
	
	@Test
	void GSListIteratorNextIndex() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		for(int i = 0; i < GS.getLength(); i++) {
			ListIterator<Integer> it = GS.listIterator(i);
			int idx = i;
			while(it.hasNext()) {
				assertEquals(idx, it.nextIndex(), "GS list iterator next index failed");
				it.next();
				idx++;
			}
		}
	}
	
	@Test
	void GSListIteratorPreviousIndex() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		for(int i = GS.getLength() - 1; i >= 0; i--) {
			ListIterator<Integer> it = GS.listIterator(i);
			int idx = i;
			while(it.hasPrevious()) {
				assertEquals(idx, it.previousIndex(), "GS list iterator previous index failed");
				it.previous();
				idx--;
			}
		}
	}
	
	
	//
	// GenericStack methods
	//
	@Test
	void GSIntegerRemoveTailTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.add(intList.get(i));
		}
		assertEquals(intList.get(0), GS.removeTail(), "GS integer remove tail failed");
	}
	
	@Test
	void GSDoubleRemoveTailTest() {
		GenericStack<Double> GS = new GenericStack<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GS.add(douList.get(i));
		}
		assertEquals(douList.get(0), GS.removeTail(), "GS double remove tail failed");
	}
	
	@Test
	void GQStringRemoveTailTest() {
		GenericStack<String> GS = new GenericStack<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GS.add(strList.get(i));
		}
		assertEquals(strList.get(0), GS.removeTail(), "GS string remove tail failed");
	}
	
	@Test
	void GSIntegerRemoveTailLengthTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.add(intList.get(i));
		}
		GS.removeTail();
		assertEquals(intList.size() - 1, GS.getLength(), "GS integer remove tail length failed");
	}
	
	@Test
	void GSDoubleRemoveTailLengthTest() {
		GenericStack<Double> GS = new GenericStack<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GS.add(douList.get(i));
		}
		GS.removeTail();
		assertEquals(douList.size() - 1, GS.getLength(), "GS double remove tail length failed");
	}
	
	@Test
	void GSStringRemoveTailLengthTest() {
		GenericStack<String> GS = new GenericStack<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GS.add(strList.get(i));
		}
		GS.removeTail();
		assertEquals(strList.size() - 1, GS.getLength(), "GS string remove tail length failed");
	}
	
	@Test
	void GSIntegerRemoveTailCompareToArrayTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.add(intList.get(i));
		}
		GS.removeTail();
		for(int i = 0; i < intList.size() - 1; i++) {
			assertEquals(intList.get(intList.size() - i - 1), GS.get(i), "GS integer remove tail compare to Array failed");
		}
	}
	
	@Test
	void GSDoubleRemoveTailCompareToArrayTest() {
		GenericStack<Double> GS = new GenericStack<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GS.add(douList.get(i));
		}
		GS.removeTail();
		for(int i = 0; i < douList.size() - 1; i++) {
			assertEquals(douList.get(douList.size() - i - 1), GS.get(i), "GS double remove tail compare to Array failed");
		}
	}
	
	@Test
	void GSStringRemoveTailCompareToArrayTest() {
		GenericStack<String> GS = new GenericStack<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GS.add(strList.get(i));
		}
		GS.removeTail();
		for(int i = 0; i < strList.size() - 1; i++) {
			assertEquals(strList.get(strList.size() - i - 1), GS.get(i), "GS string remove tail compare to Array failed");
		}
	}
	
	@Test
	void GSPushLengthTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		assertEquals(intList.size(), GS.getLength(), "GS push length failed");
	}
	
	@Test
	void GSPushCompareToArrayTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		Collections.reverse(intList);
		for(int i = 0; i < intList.size() - 1; i++) {
			assertEquals(intList.get(i), GS.get(i), "GS push compare to Array failed");
		}
	}
	
	@Test
	void GSPushEmptyTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		GS.delete();
		assertEquals(0, GS.getLength(), "GS push empty queue length failed");
		GS.push(intList.get(1));
		assertEquals(1, GS.getLength(), "GS push empty queue length failed");
		assertEquals(intList.get(1), GS.get(0), "GS push empty queue failed");
	}
	
	@Test
	void GSPopLengthTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		GS.pop();
		assertEquals(intList.size() - 1, GS.getLength(), "GS pop length failed");
	}
	
	@Test
	void GSPopCompareToArrayTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GS.push(intList.get(i));
		}
		int val;
		Collections.reverse(intList);
		for(int i = 0; i < intList.size(); i++) {
			val = GS.pop();
			assertEquals(intList.get(i), val, "GS pop compare to array failed");
		}
	}
	
	@Test
	void GQDequeueEmptyTest() {
		GenericStack<Integer> GS = new GenericStack<>(intList.get(0));
		GS.pop();
		assertEquals(0, GS.getLength(), "GS pop empty queue length failed");
		assertNull(GS.pop(), "GS pop expected null");
	}
}

