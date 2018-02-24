import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class MyTestClass {
  @Test fun `ensure everything works`() {
    assertEquals(Character.valueOf('H'), findFirstUniqChar("Hello world!"))
    assertEquals(Character.valueOf('y'), findFirstUniqChar("My name is Max"))
    assertEquals(Character.valueOf('g'), findFirstUniqChar("abcdefgfedcba"))
    assertNull(findFirstUniqChar(""))
    assertNull(findFirstUniqChar("aabbcc"))
  }
}
