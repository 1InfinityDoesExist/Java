import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public static <K, V> void printMap(Map<K, V> map)
	{
		Set<Map.Entry<K, V>> entry = map.entrySet();
		for(Map.Entry<K, V> mp : entry)
		{
			int freq = (Integer)mp.getValue();
			while(freq-- > 0)
			{
				System.out.print(mp.getKey() + " ");
			}
		}
		System.out.println();
	}
	public static <K, V extends Comparable <? super V> > Map<K, V> sortedMap(Map<K, V> unsortedMap)
	{
		Set<Map.Entry<K, V>> s = unsortedMap.entrySet();
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(s);

		Collections.sort(list, new Comparator<Map.Entry<K, V>>(){
			public int compare(Map.Entry<K, V> m1, Map.Entry<K, V> m2)
			{
				return m2.getValue().compareTo(m1.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for(Map.Entry<K, V> entry : list)
		{
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
	public void sorting(ArrayList<Integer> ai)
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int iter = 0; iter < ai.size(); iter++)
		{
			int i = ai.get(iter);
			Integer val = hm.get(i);
			if(val != null)
			{
				hm.put(i, val+1);
			}
			else
			{
				hm.put(i,1);
			}
		}
		Map<Integer, Integer> ans = sortedMap(hm);
		printMap(ans);
	}
	public static void main(String[] args)
	{
		GFG gfg = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int n = input.nextInt();
			ArrayList<Integer> ai = new ArrayList<Integer>();
			for(int iter = 0; iter < n; iter++)
			{
				ai.add(input.nextInt());
			}
			gfg.sorting(ai);
		}
	}
}
