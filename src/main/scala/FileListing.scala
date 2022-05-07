import java.io.File

object FileListing extends App {

  def listFilesFromDir(dir: String): List[String] = {
    val file = new File(dir)

    dir match {
      case dir if (file.exists && file.isDirectory) =>
        file
          .listFiles
          .filter(_.isFile)
          .map(_.getName)
          .toList
      case _ => List[String]()
    }
  }

  listFilesFromDir(args(0))
}
