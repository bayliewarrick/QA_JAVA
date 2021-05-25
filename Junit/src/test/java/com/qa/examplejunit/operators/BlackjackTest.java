package com.qa.examplejunit.operators;

import org.junit.jupiter.api.Test;

public class BlackjackTest {
	@Test
	public void blkjkTest() {
		int result = Blackjack.play(10, 20);
		System.out.println(result);
	}
}
