// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Workspace/note/play-java-seed/conf/routes
// @DATE:Thu May 03 20:13:15 ICT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def signUp(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signUp")
    }
  
    // @LINE:7
    def signIn(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signIn")
    }
  
    // @LINE:8
    def loadSignUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signUp")
    }
  
    // @LINE:6
    def login(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
