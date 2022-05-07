import org.scalatest._
import flatspec._
import matchers._

class MainSpec extends AnyFlatSpec with should.Matchers {

  val parser: Main.type = Main

  val directory = "C:\\Users\\a.szczepanik\\sandbox\\scala-academy-sandbox\\anja\\file-listing\\src"
  val main = "C:\\Users\\a.szczepanik\\sandbox\\scala-academy-sandbox\\anja\\file-listing\\src\\main"
  val test = "C:\\Users\\a.szczepanik\\sandbox\\scala-academy-sandbox\\anja\\file-listing\\src\\test"
  val actual: Seq[String] = parser.getFileFromDir(directory).map((el) => el.toString)

  it should "check if file exist in result" in {
    actual should contain(main)
    actual should contain(test)
  }

  it should "return empty Seq if no directory was provided" in {
    parser.getFileFromDir("") shouldBe Seq()
    Seq.empty shouldBe empty
  }

  it should "let us check the size of collections" in {
    val listOfFiles = List("build.sbt", "Main", "MainSpec")
    listOfFiles should have size 3
    listOfFiles should not be empty
  }

  it should "return sequence of files contained in directory" in {
    actual shouldBe Seq(main, test)
  }

}