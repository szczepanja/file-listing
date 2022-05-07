import Main._
import org.scalatest._
import flatspec._
import matchers._

class MainSpec extends AnyFlatSpec with should.Matchers {

  "Main.getFileFromDir" should "return empty List if no directory was provided" in {
    getFileFromDir("") shouldBe List()
    List.empty shouldBe empty
  }

  it should "let us check the size of collections" in {
    val listOfFiles = List("build.sbt", "Main", "MainSpec")
    listOfFiles should have size 3
    listOfFiles should not be empty
  }

}