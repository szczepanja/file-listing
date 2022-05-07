import org.scalatest._
import flatspec._
import matchers._

class FileListingSpec extends AnyFlatSpec with should.Matchers {

  val parser: FileListing.type = FileListing

  val directory = "C:\\Users\\a.szczepanik\\docker\\file-listing"
  val buildSbt = "build.sbt"
  val readme = "README.md"
  val actual: Seq[String] = parser.listFilesFromDir(directory)
  val emptyDir: Seq[String] = parser.listFilesFromDir("")

  it should "check if file exist in result of method" in {
    actual should contain(buildSbt)
    actual should contain(readme)
  }

  it should "return empty sequence if no directory was provided" in {
    emptyDir shouldBe Seq.empty[String]
    Seq.empty shouldBe empty
  }

  it should "return the size of collection" in {
    actual should have size 2
    actual should not be empty
  }

  it should "return sequence of files contained in directory" in {
    actual shouldBe Seq(buildSbt, readme)
    actual should not be empty
  }

}
