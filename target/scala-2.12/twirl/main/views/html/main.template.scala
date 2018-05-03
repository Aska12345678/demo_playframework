
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(head: Html)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    """),_display_(/*12.6*/head),format.raw/*12.10*/("""
  """),format.raw/*13.3*/("""</head>
  """),_display_(/*14.4*/content),format.raw/*14.11*/("""
"""),format.raw/*15.1*/("""</html>
"""))
      }
    }
  }

  def render(head:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(head)(content)

  def f:((Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (head) => (content) => apply(head)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 03 19:44:30 ICT 2018
                  SOURCE: D:/Workspace/note/play-java-seed/app/views/main.scala.html
                  HASH: 251b046674fb73511690c42b1d27f60d70314f00
                  MATRIX: 1199->255|1320->283|1347->284|1420->331|1445->335|1475->338|1512->349|1540->356|1568->357
                  LINES: 33->7|38->8|39->9|42->12|42->12|43->13|44->14|44->14|45->15
                  -- GENERATED --
              */
          