/**
 *
 * Todo.txt Touch tests/src/com/todotxt/todotxttouch/util/CursorPositionCalculator.java
 *
 * Copyright (c) 2011 Tim Barlotta
 *
 * LICENSE:
 *
 * This file is part of Todo.txt Touch, an Android app for managing your todo.txt file (http://todotxt.com).
 *
 * Todo.txt Touch is free software: you can redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any
 * later version.
 *
 * Todo.txt Touch is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with Todo.txt Touch.  If not, see
 * <http://www.gnu.org/licenses/>.
 * 
 * CursorPositionCalculatorTest
 * A JUnit based test class for the CursorPositionCalculator class
 *
 * @author Tim Barlotta <tim[at]barlotta[dot]net>
 * @license http://www.gnu.org/licenses/gpl.html
 * @copyright 2011 Tim Barlotta
 */
package com.todotxt.todotxttouch.util;

import junit.framework.TestCase;

public class CursorPositionCalculatorTest extends TestCase {
	public void testCalculate_nullPrior() {
		assertEquals(7, CursorPositionCalculator.calculate(0, null, "123test"));
	}

	public void testCalculate_nullNew() {
		assertEquals(0, CursorPositionCalculator.calculate(0, "test", null));
	}

	public void testCalculate_simpleBegin() {
		assertEquals(3,
				CursorPositionCalculator.calculate(0, "test", "123test"));
	}

	public void testCalculate_simpleEnd() {
		assertEquals(7,
				CursorPositionCalculator.calculate(4, "test", "test123"));
	}

	public void testCalculate_emptyPrior() {
		assertEquals(7, CursorPositionCalculator.calculate(0, "", "123test"));
	}

	public void testCalculate_emptyNew() {
		assertEquals(0, CursorPositionCalculator.calculate(0, "test", ""));
	}

	public void testCalculate_nonsense1() {
		assertEquals(7,
				CursorPositionCalculator.calculate(99, "test", "test123"));
	}
}
