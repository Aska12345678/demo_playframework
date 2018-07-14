// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/anh.tst/Workspace/Anh.TST/play-java-starter-example/conf/routes
// @DATE:Sat Jul 14 22:04:02 ICT 2018


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
