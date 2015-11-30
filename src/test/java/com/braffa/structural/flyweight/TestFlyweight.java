/*
 * http://www.javacodegeeks.com/2015/09/flyweight-design-pattern.html
 * 
 *	When to use the Flyweight Pattern
 *		The Flyweight pattern’s effectiveness depends heavily on how and where it’s used. 
 *		Apply the Flyweight pattern when all of the following are true:
 *
 *		1. An application uses a large number of objects.
 *		2. Storage costs are high because of the sheer quantity of objects.
 *		3. Most object state can be made extrinsic.
 *		4. Many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed.
 *		5. The application doesn’t depend on object identity. Since flyweight objects may be shared, identity tests will return 
 *         true for conceptually distinct objects.
 */

package com.braffa.structural.flyweight;

import org.junit.Before;
import org.junit.Test;

public class TestFlyweight {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Code code = new Code();
		code.setCode("C Code...");
		IPlatform platform = PlatformFactory.getPlatformInstance("C");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("C Code2...");
		platform = PlatformFactory.getPlatformInstance("C");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("JAVA Code...");
		platform = PlatformFactory.getPlatformInstance("JAVA");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("JAVA Code2...");
		platform = PlatformFactory.getPlatformInstance("JAVA");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("RUBY Code...");
		platform = PlatformFactory.getPlatformInstance("RUBY");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("RUBY Code2...");
		platform = PlatformFactory.getPlatformInstance("RUBY");
		platform.execute(code);
	}

}
