package clare.asm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {
	
	private Sets() {}
	
	public static <T> Set<T> copy(Set<T> set) {
		return new HashSet<T>(set);
	}

	public static <T> Set<T> union(Set<T> a, Set<T> b) {
		Set<T> set = new HashSet<T>();
		set.addAll(a);
		set.addAll(b);
		return set;
	}

	public static <T> Set<T> minus (Set<T> a, Set<T> b) {
		Set<T> set = new HashSet<T>();
		set.addAll(a);
		set.removeAll(b);
		return set;
	}
	
	@FunctionalInterface
	public interface PairConsumer<T> {
		public void accept(T a, T b);
	}
	
	public static <T> void forPairs(Set<T> set, PairConsumer<T> pairConsumer) {
		set.forEach(a ->
			set.forEach(b -> {
				if (a != b)
					pairConsumer.accept(a, b);
			}));
	}
	
	public static <T> Set<T> asSet(T... e) {
		HashSet<T> set = new HashSet<T>();
		for (T i : e)
			set.add(i);
		return set;
	}
}












