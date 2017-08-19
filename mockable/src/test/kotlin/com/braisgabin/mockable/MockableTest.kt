package com.braisgabin.mockable

import org.junit.Test
import org.mockito.Mockito.mock

class MockableTest {

  @Test
  fun test() {
    mock(TestClass::class.java)
  }
}

@Mockable
class TestClass

class ChildTestClass : TestClass() // Test compile
