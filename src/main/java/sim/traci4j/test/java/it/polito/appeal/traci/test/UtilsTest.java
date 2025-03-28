/*   
    Copyright (C) 2013 ApPeAL Group, Politecnico di Torino

    This file is part of TraCI4J.

    TraCI4J is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    TraCI4J is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with TraCI4J.  If not, see <http://www.gnu.org/licenses/>.
*/

package sim.traci4j.test.java.it.polito.appeal.traci.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import sim.traci4j.src.java.it.polito.appeal.traci.Utils;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("javadoc")
public class UtilsTest {

	Set<String> before = new HashSet<String>();
	Set<String> after = new HashSet<String>();
	
	@Before
	public void setUp() {
		before.add("A");
		before.add("B");
		before.add("C");
		
		after.add("A");
		after.add("B");
		after.add("D");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetAddedItems() {
		Set<String> expected = new HashSet<String>();
		expected.add("D");
		Set<String> added = Utils.getAddedItems(before, after);
		assertThat(added, equalTo(expected));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetRemovedItems() {
		Set<String> expected = new HashSet<String>();
		expected.add("C");
		Set<String> removed = Utils.getRemovedItems(before, after);
		assertThat(removed, equalTo(expected));
	}

}
