import java.io.File

object FileListing extends App {

  def listFilesFromDir(dir: String): List[File] = {
    val file = new File(dir)

    dir match {
      case dir if (file.exists && file.isDirectory) =>
        file
          .listFiles
          .toList
      case _ => List[File]()
    }
  }

  listFilesFromDir(args(0))
}
