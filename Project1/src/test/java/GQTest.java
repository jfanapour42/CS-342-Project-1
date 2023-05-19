import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class GQTest {
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
	// GenericQueue constructor
	//
	@Test
	void GQConstructorIntLengthTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(1);
		assertEquals(1, GQ.getLength(), "Length of Int GQ is not 1");
	}
	
	@Test
	void GQConstructorDoubleLengthTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(1.0);
		assertEquals(1, GQ.getLength(), "Length of Double GQ is not 1");
	}
	
	@Test
	void GQConstructorStringLengthTest() {
		String str = "hello";
		GenericQueue<String> GQ = new GenericQueue<>(str);
		assertEquals(1, GQ.getLength(), "Length of String GQ is not 1");
	}
	
	@Test
	void GQConstructorIntDeleteTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(10);
		assertEquals(10, GQ.delete(), "Delete of int GQ failed");
	}
	
	@Test
	void GQConstructorDoubleDeleteTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(2.0);
		assertEquals(2.0, GQ.delete(), "Delete of double GQ failed");
	}
	
	@Test
	void GQConstructorStringDeleteTest() {
		String str = "hello";
		GenericQueue<String> GQ = new GenericQueue<>(str);
		assertEquals(str, GQ.delete(), "Delete of String GQ failed");
	}
	
	//
	// GenericList methods
	//
	@Test
	void GQAddIntegerLengthTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.add(intList.get(i));
		}
		assertEquals(intList.size(), GQ.getLength(), "GQ add integer length failed");
	}
	
	@Test
	void GQAddDoubleLengthTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GQ.add(douList.get(i));
		}
		assertEquals(douList.size(), GQ.getLength(), "GQ add double length failed");
	}
	
	@Test
	void GQAddStringLengthTest() {
		GenericQueue<String> GQ = new GenericQueue<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GQ.add(strList.get(i));
		}
		assertEquals(strList.size(), GQ.getLength(), "GQ add string length failed");
	}
	
	@Test
	void GQDeleteIntegerLengthTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		GQ.delete();
		assertEquals(0, GQ.getLength(), "GQ delete integer length failed");
	}
	
	@Test
	void GQDeleteDoubleLengthTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(douList.get(0));
		GQ.delete();
		assertEquals(0, GQ.getLength(), "GQ delete double length failed");
	}
	
	@Test
	void GQDeleteStringLengthTest() {
		GenericQueue<String> GQ = new GenericQueue<>(strList.get(0));
		GQ.delete();
		assertEquals(0, GQ.getLength(), "GQ delete string length failed");
	}
	
	@Test
	void GQDumpListIntegerTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.add(intList.get(i));
		}
		assertEquals(intList, GQ.dumplist(), "GQ integer dumplist failed");
	}
	
	@Test
	void GQDumpListDoubleTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GQ.add(douList.get(i));
		}
		assertEquals(douList, GQ.dumplist(), "GQ double dumplist failed");
	}
	
	@Test
	void GQDumpListStringTest() {
		GenericQueue<String> GQ = new GenericQueue<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GQ.add(strList.get(i));
		}
		assertEquals(strList, GQ.dumplist(), "GQ string dumplist failed");
	}
	
	@Test
	void GQDumpListIntegerlengthTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.add(intList.get(i));
		}
		GQ.dumplist();
		assertEquals(0, GQ.getLength(), "GQ integer dumplist length failed");
	}
	
	@Test
	void GQDumpListDoubleLengthTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GQ.add(douList.get(i));
		}
		GQ.dumplist();
		assertEquals(0, GQ.getLength(), "GQ double dumplist length failed");
	}
	
	@Test
	void GQDumpListStringLengthTest() {
		GenericQueue<String> GQ = new GenericQueue<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GQ.add(strList.get(i));
		}
		GQ.dumplist();
		assertEquals(0, GQ.getLength(), "GQ string dumplist length failed");
	}
	
	@Test
	void GQIntegerGetTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.add(intList.get(i));
		}
		for(int i = 0; i < intList.size(); i++) {
			assertEquals(intList.get(i), GQ.get(i), "GQ integer get failed");
		}
	}
	
	@Test
	void GQDoubleGetTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GQ.add(douList.get(i));
		}
		for(int i = 0; i < douList.size(); i++) {
			assertEquals(douList.get(i), GQ.get(i), "GQ double get failed");
		}
	}
	
	@Test
	void GQStringGetTest() {
		GenericQueue<String> GQ = new GenericQueue<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GQ.add(strList.get(i));
		}
		for(int i = 0; i < strList.size(); i++) {
			assertEquals(strList.get(i), GQ.get(i), "GQ string get failed");
		}
	}
	
	@Test
	void GQIntegerSetTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.add(intList.get(i));
		}
		int newVal = 20;
		int prevEle = GQ.set(1, newVal);
		assertEquals(intList.get(1), prevEle, "GQ integer set return failed");
		assertEquals(newVal, GQ.get(1), "GQ integer set modify failed");
	}
	
	@Test
	void GQDoubleSetTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GQ.add(douList.get(i));
		}
		double newVal = 20.5;
		double prevEle = GQ.set(1, newVal);
		assertEquals(douList.get(1), prevEle, "GQ double set return failed");
		assertEquals(newVal, GQ.get(1), "GQ double set modify failed");
	}
	
	@Test
	void GQStringSetTest() {
		GenericQueue<String> GQ = new GenericQueue<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GQ.add(strList.get(i));
		}
		String newVal = "Insert";
		String prevEle = GQ.set(1, newVal);
		assertEquals(strList.get(1), prevEle, "GQ string set return failed");
		assertEquals(newVal, GQ.get(1), "GQ string set modify failed");
	}
	
	@Test
	void GQIntegerGetHeadTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.add(intList.get(i));
		}
		assertEquals(intList.get(0), GQ.getHead().data, "GQ integer get head failed");
	}
	
	@Test
	void GQDoubleGetHeadTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GQ.add(douList.get(i));
		}
		assertEquals(douList.get(0), GQ.getHead().data, "GQ double get head failed");
	}
	
	@Test
	void GQStringGetHeadTest() {
		GenericQueue<String> GQ = new GenericQueue<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GQ.add(strList.get(i));
		}
		assertEquals(strList.get(0), GQ.getHead().data, "GQ string get head failed");
	}
	
	@Test 
	void GQIteratorHasNext() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		Iterator<Integer> it = GQ.iterator();
		for(int i = 0; i < intList.size(); i++) {
			assertEquals(true, it.hasNext(), "GQ iterator has next failed");
			it.next();
		}
	}
	
	@Test 
	void GQIteratorNext() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		Iterator<Integer> it = GQ.iterator();
		int idx = 0;
		while(it.hasNext()) {
			assertEquals(intList.get(idx), it.next(), "GQ iterator next failed");
			idx++;
		}
	}
	
	@Test 
	void GQReverseIteratorHasNext() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		Iterator<Integer> it = GQ.descendingIterator();
		for(int i = intList.size() - 1; i >= 0; i--) {
			assertEquals(true, it.hasNext(), "GQ reverse iterator has next failed");
			it.next();
		}
	}
	
	@Test 
	void GQReverseIteratorNext() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		Iterator<Integer> it = GQ.descendingIterator();
		int idx = intList.size() - 1;
		while(it.hasNext()) {
			assertEquals(intList.get(idx), it.next(), "GQ reverse iterator next failed");
			idx--;
		}
	}
	
	@Test
	void GQListIteratorHasNext() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		for(int i = 0; i < GQ.getLength(); i++) {
			ListIterator<Integer> it = GQ.listIterator(i);
			for(int j = i; j < intList.size(); j++) {
				assertEquals(true, it.hasNext(), "GQ list iterator has next failed");
				it.next();
			}
		}
	}
	
	@Test
	void GQListIteratorNext() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		for(int i = 0; i < GQ.getLength(); i++) {
			ListIterator<Integer> it = GQ.listIterator(i);
			int idx = i;
			while(it.hasNext()) {
				assertEquals(intList.get(idx), it.next(), "GQ list iterator next failed");
				idx++;
			}
		}
	}
	
	@Test
	void GQListIteratorHasPrevious() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		for(int i = 0; i < GQ.getLength(); i++) {
			ListIterator<Integer> it = GQ.listIterator(i);
			for(int j = i; j >= 0; j--) {
				assertEquals(true, it.hasPrevious(), "GQ list iterator has previous failed");
				it.previous();
			}
		}
	}
	
	@Test
	void GQListIteratorPrevious() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		for(int i = GQ.getLength() - 1; i >= 0; i--) {
			ListIterator<Integer> it = GQ.listIterator(i);
			int idx = i;
			while(it.hasPrevious()) {
				assertEquals(intList.get(idx), it.previous(), "GQ list iterator previous failed");
				idx--;
			}
		}
	}
	
	@Test
	void GQListIteratorNextIndex() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		for(int i = 0; i < GQ.getLength(); i++) {
			ListIterator<Integer> it = GQ.listIterator(i);
			int idx = i;
			while(it.hasNext()) {
				assertEquals(idx, it.nextIndex(), "GQ list iterator next index failed");
				it.next();
				idx++;
			}
		}
	}
	
	@Test
	void GQListIteratorPreviousIndex() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		for(int i = GQ.getLength() - 1; i >= 0; i--) {
			ListIterator<Integer> it = GQ.listIterator(i);
			int idx = i;
			while(it.hasPrevious()) {
				assertEquals(idx, it.previousIndex(), "GQ list iterator previous index failed");
				it.previous();
				idx--;
			}
		}
	}
	
	//
	// GenericQueue methods
	//
	@Test
	void GQIntegerRemoveTailTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.add(intList.get(i));
		}
		assertEquals(intList.get(intList.size() - 1), GQ.removeTail(), "GQ integer remove tail failed");
	}
	
	@Test
	void GQDoubleRemoveTailTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GQ.add(douList.get(i));
		}
		assertEquals(douList.get(douList.size() - 1), GQ.removeTail(), "GQ double remove tail failed");
	}
	
	@Test
	void GQStringRemoveTailTest() {
		GenericQueue<String> GQ = new GenericQueue<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GQ.add(strList.get(i));
		}
		assertEquals(strList.get(strList.size() - 1), GQ.removeTail(), "GQ string remove tail failed");
	}
	
	@Test
	void GQIntegerRemoveTailLengthTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.add(intList.get(i));
		}
		GQ.removeTail();
		assertEquals(intList.size() - 1, GQ.getLength(), "GQ integer remove tail length failed");
	}
	
	@Test
	void GQDoubleRemoveTailLengthTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GQ.add(douList.get(i));
		}
		GQ.removeTail();
		assertEquals(douList.size() - 1, GQ.getLength(), "GQ double remove tail length failed");
	}
	
	@Test
	void GQStringRemoveTailLengthTest() {
		GenericQueue<String> GQ = new GenericQueue<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GQ.add(strList.get(i));
		}
		GQ.removeTail();
		assertEquals(strList.size() - 1, GQ.getLength(), "GQ string remove tail length failed");
	}
	
	@Test
	void GQIntegerRemoveTailCompareToArrayTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.add(intList.get(i));
		}
		GQ.removeTail();
		for(int i = 0; i < intList.size() - 1; i++) {
			assertEquals(intList.get(i), GQ.get(i), "GQ integer remove tail compare to Array failed");
		}
	}
	
	@Test
	void GQDoubleRemoveTailCompareToArrayTest() {
		GenericQueue<Double> GQ = new GenericQueue<>(douList.get(0));
		for(int i = 1; i < douList.size(); i++) {
			GQ.add(douList.get(i));
		}
		GQ.removeTail();
		for(int i = 0; i < douList.size() - 1; i++) {
			assertEquals(douList.get(i), GQ.get(i), "GQ double remove tail compare to Array failed");
		}
	}
	
	@Test
	void GQStringRemoveTailCompareToArrayTest() {
		GenericQueue<String> GQ = new GenericQueue<>(strList.get(0));
		for(int i = 1; i < strList.size(); i++) {
			GQ.add(strList.get(i));
		}
		GQ.removeTail();
		for(int i = 0; i < strList.size() - 1; i++) {
			assertEquals(strList.get(i), GQ.get(i), "GQ string remove tail compare to Array failed");
		}
	}
	
	@Test
	void GQEnqueueLengthTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		assertEquals(intList.size(), GQ.getLength(), "GQ enqueue length failed");
	}
	
	@Test
	void GQEnqueueCompareToArrayTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		for(int i = 0; i < intList.size() - 1; i++) {
			assertEquals(intList.get(i), GQ.get(i), "GQ enqueue compare to Array failed");
		}
	}
	
	@Test
	void GQEnqueueEmptyTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		GQ.delete();
		assertEquals(0, GQ.getLength(), "GQ enqueue empty queue length failed");
		GQ.enqueue(intList.get(1));
		assertEquals(1, GQ.getLength(), "GQ enqueue empty queue length failed");
		assertEquals(intList.get(1), GQ.get(0), "GQ enqueue empty queue failed");
	}
	
	@Test
	void GQDequeueLengthTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		GQ.dequeue();
		assertEquals(intList.size() - 1, GQ.getLength(), "GQ dequeue length failed");
	}
	
	@Test
	void GQDequeueCompareToArrayTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		for(int i = 1; i < intList.size(); i++) {
			GQ.enqueue(intList.get(i));
		}
		int val;
		for(int i = 0; i < intList.size(); i++) {
			val = GQ.dequeue();
			assertEquals(intList.get(i), val, "GQ dequeue compare to array failed");
		}
	}
	
	@Test
	void GQDequeueEmptyTest() {
		GenericQueue<Integer> GQ = new GenericQueue<>(intList.get(0));
		GQ.dequeue();
		assertEquals(0, GQ.getLength(), "GQ dequeue empty queue length failed");
		assertNull(GQ.dequeue(), "GQ dequeue expected null");
	}
}
