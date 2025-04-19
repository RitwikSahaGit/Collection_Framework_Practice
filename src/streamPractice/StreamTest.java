package streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a Stream from Array
		String[] arrayOffruit = {"Apple", "Banana", "mango"};
 		Stream<String> stream = Arrays.stream(arrayOffruit);
		System.out.println(stream.collect(Collectors.toList()));
		
		//creating a stream from List
		List<Integer> listOfInteger = Arrays.asList(1,2,35,3,5,667,24,56,0,2,24);
		Stream<Integer> streamOfInteger = listOfInteger.stream();
		System.out.println(streamOfInteger.collect(Collectors.toList()));
		
		//creating a Stream from a ArrayList
		List<String> friend = new ArrayList<>();
		friend.add("Sayan");
		friend.add("Supratim");
		friend.add("Akram");
		friend.add("Subhajit");
		Stream<String> streamOfFriend = friend.stream();
		System.out.println(streamOfFriend.collect(Collectors.toList()));
		
		//Creating a stream
		Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
		/*
		 * Iterate is used for loop sceneries
		 */
		Stream<Integer> intStream =  Stream.iterate(0, n->n+1).skip(1).limit(100);
		System.out.println(intStream.collect(Collectors.toList()));
		
		//Skip before limit and skip after limit
		System.out.println(Stream.iterate(0, n->n+1).limit(100).skip(1).collect(Collectors.toList()));
		
		/*
		 * Generate is a supplier and used to do something creation
		 */
		Stream<Double> limit = Stream.generate(() -> Math.random()*100).limit(10);
		System.out.println(limit.collect(Collectors.toList()));
		
		
		
		
		//Stream operations
		List<Integer> list = Arrays.asList(1,2,35,3,5,667,24,56,0,2,24);
		
		System.out.println(list);
		
		List<Integer> newList =list.stream().filter(x->x%2==1).map(x->x+1).distinct().sorted((a,b)->(b-a)).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> limitAndSkip = newList.stream().limit(4).skip(1).collect(Collectors.toList());
		System.out.println(limitAndSkip);
		
		/*
		 * Stream.iterate things are shown below
		 * Stream.iterate(0, n->n+1).limit(21).skip(1).filter(x->x%2==0).map(x->x+1).sorted((a,b)-> (b-a)).peek(x->System.out.println(x)).collect(Collectors.toList());
		 */
		
		//Printing 0 to 21 and skipping the 1st value that is 0.
		List<Integer> iterate = Stream.iterate(0, n->n+1).skip(1).limit(21).collect(Collectors.toList());
		System.out.println(iterate);
		
		int i = list.stream().peek(x->System.out.println(x)).max((a,b) ->(a-b)).get();
		System.out.println(i);
		System.out.println();
		System.out.println(list.stream().count());
		
		//merging tow array
		int[] arr = {0,1,2,3,4}, arr2 = {5,6,7,8,9};
		int[] mergeArray = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr2)).toArray();
		System.out.println(Arrays.toString(mergeArray));
		
		//Finding ODD and EVEN using Stream
		List<Integer> numberList = Arrays.asList(1,2,3,5,6,7);
		
		List<Integer> odd = numberList.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(odd);
		
		
		
		
	}

}
