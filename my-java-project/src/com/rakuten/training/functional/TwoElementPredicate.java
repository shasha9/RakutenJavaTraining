package com.rakuten.training.functional;

public interface TwoElementPredicate<E> {

	boolean isFirstBetterThanSecond(E first,E second);
}
