import scala.io.Source

/**
 * reads lines from a file, and prints them out prepended
 * with the number of characters in each line.
 *
 */
object CountChars {

  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines.toList

      val longestLine = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b)
      val maxWidth = widthOfLength(longestLine)

      lines.foreach { x => println(prepareForPrint(maxWidth, x)) }
    }
  }

  private def widthOfLength(s: String) = s.length.toString.length

  private def prepareForPrint(maxWidth: Int, line: String): String = {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    padding + line.length + "| " + line
  }
}