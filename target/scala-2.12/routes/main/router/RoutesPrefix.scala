// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Workspace/note/play-java-seed/conf/routes
// @DATE:Thu May 03 20:13:15 ICT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
