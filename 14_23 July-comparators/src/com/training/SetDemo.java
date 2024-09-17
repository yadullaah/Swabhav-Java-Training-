package com.training;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		LinkedHashSet<Integer> linkedset = new LinkedHashSet<Integer>();
		TreeSet<Integer> treeset = new TreeSet<Integer>();

		set.add(5);
		set.add(2);
		set.add(1);
		set.add(4);
		set.add(3);
		set.add(6);

		linkedset.add(5);
		linkedset.add(2);
		linkedset.add(1);
		linkedset.add(3);
		linkedset.add(4);
		linkedset.add(6);

		treeset.add(5);
		treeset.add(2);
		treeset.add(1);
		treeset.add(4);
		treeset.add(6);
		treeset.add(3);

		System.out.println(set);

		set2.addAll(set);
		System.out.println(set2);

		System.out.println(linkedset);

		System.out.println(treeset);

	}

}
