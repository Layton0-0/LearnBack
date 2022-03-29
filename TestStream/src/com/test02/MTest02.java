package com.test02;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MTest02 {
	public static void main(String[] args) {
		List<BigDecimal> list = new ArrayList<BigDecimal>();
		list.add(new BigDecimal("1"));
		list.add(new BigDecimal("2"));
		list.add(new BigDecimal("3"));
		list.add(new BigDecimal("4"));
		list.add(new BigDecimal("5"));

		long start = System.currentTimeMillis();
		System.out.println("--- 직렬 처리 ---");
		BigDecimal result = list.stream().reduce(new BigDecimal("100"), (value1, value2) -> {
			System.out.println("value1 =" + value1);
			System.out.println("value2 =" + value2);
			return value1.add(value2);
		});
		System.out.println("result =" + result);
		long end = System.currentTimeMillis();
		System.out.println("=======>직렬 처리 시간 " + (end - start));

		start = System.currentTimeMillis();
		System.out.println("--- 병렬 처리 ---");
		BigDecimal parallelResult = list.parallelStream().reduce(new BigDecimal("100"), (value1, value2) -> {
			System.out.println("value1 =" + value1);
			System.out.println("value2 =" + value2);
			return value1.add(value2);
		});
		System.out.println("parallelResult =" + parallelResult);
		end = System.currentTimeMillis();
		System.out.println("==========>병렬 처리 시간 " + (end - start));

	}
}
