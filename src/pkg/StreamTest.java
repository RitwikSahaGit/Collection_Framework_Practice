package pkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,35,3,5,667,24,56,0,2,24);
		
		System.out.println(list);
		
		List<Integer> newList =list.stream().filter(x->x%2==1).map(x->x+1).distinct().sorted((a,b)->(b-a)).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> limitAndSkip = newList.stream().limit(4).skip(1).collect(Collectors.toList());
		System.out.println(limitAndSkip);
		
		List<Integer> iterate = Stream.iterate(0, n->n+1).limit(21).skip(1).filter(x->x%2==0).map(x->x+1).sorted((a,b)-> (b-a)).peek(x->System.out.println(x)).collect(Collectors.toList());
		System.out.println(iterate);
		
		int i = list.stream().peek(x->System.out.println(x)).max((a,b) ->(a-b)).get();
		System.out.println(i);
		System.out.println();
		System.out.println(list.stream().count());
		
		//merging tow array
		int[] arr = {0,1,2,3,4}, arr2 = {5,6,7,8,9};
		int[] mergeArray = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr2)).toArray();
		System.out.println(Arrays.toString(mergeArray));
		
		//Finding 
		

	}

}
