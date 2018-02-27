/**
 * Returns first non-repeated character in the given string, or returns null
 * if no such character is found. A non-repeated character is one that occurs
 * only once in the given string.
 * @param s input string
 * @return first character that appears only once, or null if none exists
 */
fun findFirstUniqChar(s: String): Char? {
  // Map each character to uniqueness flag, maintained in LRU order.
  val map = LinkedHashMap<Char, Boolean>(s.length, 0.75f, true)
  for (ch in s) map.merge(ch, true, { _, _ -> false })
  return map.iterator().takeIf { it.hasNext() }?.next()?.takeIf { it.value }?.key
}
