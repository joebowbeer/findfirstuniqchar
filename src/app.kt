/**
 * Returns first non-repeated character in the given string, or returns null
 * if no such character is found. A non-repeated character is one that occurs
 * only once in the given string.
 * @param s input string
 * @return first character that appears only once, or null if none exists
 */
fun findFirstUniqChar(s: String): Char? {
  val uniques = LinkedHashSet<Char>() // preserves insertion order
  val dupes = HashSet<Char>()
  for (ch in s.toCharArray()) {
    if (!dupes.contains(ch)) {
      if (uniques.remove(ch)) {
        dupes.add(ch)
      } else {
        uniques.add(ch)
      }
    }
  }
  return uniques.firstOrNull()
}
