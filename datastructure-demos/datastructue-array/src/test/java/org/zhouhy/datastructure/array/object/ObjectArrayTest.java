package org.zhouhy.datastructure.array.object;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.zhouhy.datastructure.array.object.entity.User;


public class ObjectArrayTest {

	private ObjectArray objectArray;
	
	@Before
	public void init(){
		System.out.println("≤‚ ‘ø™ º");
		this.objectArray = new ObjectArray(100);
	}
	
	@Test
	public void testInsert1() {
		this.objectArray.insert(new User(1,"a","acc"));
		this.objectArray.insert(new User(2,"b","acc"));
		User[] users = this.objectArray.getDatas();
		assertTrue (users[0].getUsername().equals("a"));
	}
	
	@Test
	public void testInsert2() {
		this.objectArray.insert(new User(1,"abb","acc"));
		this.objectArray.insert(new User(2,"abc","acc"));
		User[] users = this.objectArray.getDatas();
		assertTrue (users[0].getUsername().equals("abb"));
	}
	
	@Test
	public void testRemove1() {
		this.objectArray.insert(new User(1,"abb","acc"));
		this.objectArray.insert(new User(1,"abc","acc"));
		this.objectArray.insert(new User(1,"ccs","acc"));
		this.objectArray.insert(new User(2,"aaa","acc"));
		this.objectArray.insert(new User(1,"www","acc"));
		this.objectArray.insert(new User(3,"abbb","acc"));
		
		
		this.objectArray.remove(new User(1,"www","acc"));
		User[] users = this.objectArray.getDatas();
		int currentIndex = this.objectArray.getCurrentIndex();
		assertTrue (currentIndex==5);
	}
	
	@After
	public void destory() {
		System.out.println("≤‚ ‘Ω· ¯");
	}

}
