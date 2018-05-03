
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

object loginH extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<title>"""),_display_(/*3.9*/title),format.raw/*3.14*/("""</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta http-equiv="Content-Security-Policy" content="default-src 'self' gap:; script-src 'self' data: https://ssl.gstatic.com 'unsafe-eval'; object-src *; style-src 'self' data: 'unsafe-inline'; img-src 'self' data:; media-src 'self' data:; font-src 'self' data:; connect-src *">
<meta charset="utf-8" />
<meta name="description" content="User login page" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
  <!-- bootstrap & fontawesome -->
<link rel="stylesheet" href=""""),_display_(/*10.31*/routes/*10.37*/.Assets.versioned("assets/css/bootstrap.css")),format.raw/*10.82*/("""" />
<link rel="stylesheet" href=""""),_display_(/*11.31*/routes/*11.37*/.Assets.versioned("components/font-awesome/css/font-awesome.css")),format.raw/*11.102*/("""" />
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.versioned("assets/css/ace-fonts.css")),format.raw/*12.82*/("""" />

<link rel="stylesheet" href=""""),_display_(/*14.31*/routes/*14.37*/.Assets.versioned("assets/css/ace-part2.css")),format.raw/*14.82*/("""" />
<link rel="stylesheet" href=""""),_display_(/*15.31*/routes/*15.37*/.Assets.versioned("assets/css/ace-rtl.css")),format.raw/*15.80*/("""" />
<link rel="stylesheet" href=""""),_display_(/*16.31*/routes/*16.37*/.Assets.versioned("assets/css/ace.css")),format.raw/*16.76*/("""" />
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 03 20:03:02 ICT 2018
                  SOURCE: D:/Workspace/note/play-java-seed/app/views/loginH.scala.html
                  HASH: ec1f2eb2afb8ecba6325f70ca7af970298dbf138
                  MATRIX: 949->1|1059->16|1089->20|1122->28|1147->33|1770->629|1785->635|1851->680|1914->716|1929->722|2016->787|2079->823|2094->829|2160->874|2225->912|2240->918|2306->963|2369->999|2384->1005|2448->1048|2511->1084|2526->1090|2586->1129
                  LINES: 28->1|33->1|35->3|35->3|35->3|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16
                  -- GENERATED --
              */
          