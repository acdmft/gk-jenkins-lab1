package com.meep.home;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestOperation {

	@Test
	void testOppose() {
		assertTrue(Operation.oppose(4) == -4);
	}
	
	@Test
	void testCarre() {
		assertTrue(Operation.carre(3) == 9);
	}
}
