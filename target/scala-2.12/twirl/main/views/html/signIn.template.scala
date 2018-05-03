
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

object signIn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Html,Form[AccountDto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(head: Html, signInForm: Form[AccountDto]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.44*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main/*4.6*/ {_display_(Seq[Any](format.raw/*4.8*/("""
    """),_display_(/*5.6*/head),format.raw/*5.10*/("""
""")))}/*6.2*/ {_display_(Seq[Any](format.raw/*6.4*/("""
    """),format.raw/*7.5*/("""<body class="login-layout">
        <div class="main-container">
            <div class="main-content">
                <div class="row">
                    <div class="col-sm-10 col-sm-offset-1">
                        <div class="login-container">
                            <div class="center">
                                <h1>
                                    <i class="ace-icon fa fa-leaf green"></i>
                                    <span class="red">Ace</span>
                                    <span class="white" id="id-text2">Application</span>
                                </h1>
                                <h4 class="blue" id="id-company-text">&copy; Company Name</h4>
                            </div>

                            <div class="space-6"></div>

                            <div class="position-relative">
                                <div id="login-box" class="login-box visible widget-box no-border">
                                    <div class="widget-body">
                                        <div class="widget-main">
                                            <h4 class="header blue lighter bigger">
                                                <i class="ace-icon fa fa-coffee green"></i>
                                                Please Enter Your Information
                                            </h4>

                                            <div class="space-6"></div>

                                            """),_display_(/*35.46*/form(action = routes.HomeController.signIn())/*35.91*/ {_display_(Seq[Any](format.raw/*35.93*/("""
                                                """),format.raw/*36.49*/("""<fieldset>
                                                    <label class="block clearfix">
                                                        <span class="block input-icon input-icon-right">
                                                            <input type="text" class="form-control" placeholder="Username" />
                                                            <i class="ace-icon fa fa-user"></i>
                                                        </span>
                                                    </label>

                                                    <label class="block clearfix">
                                                        <span class="block input-icon input-icon-right">
                                                            <input type="password" class="form-control" placeholder="Password" />
                                                            <i class="ace-icon fa fa-lock"></i>
                                                        </span>
                                                    </label>

                                                    <div class="space"></div>

                                                    <div class="clearfix">
                                                        <button type="button" class="width-35 pull-right btn btn-sm btn-primary">
                                                            <i class="ace-icon fa fa-key"></i>
                                                            <span class="bigger-110">Login</span>
                                                        </button>
                                                    </div>

                                                    <div class="space-4"></div>
                                                </fieldset>
                                            """)))}),format.raw/*62.46*/("""

                                            """),format.raw/*64.45*/("""<div class="social-or-login center">
                                                <span class="bigger-110">Or Login Using</span>
                                            </div>

                                            <div class="space-6"></div>

                                        </div><!-- /.widget-main -->

                                        <div class="toolbar clearfix center">
                                            <div>
                                                <a href=""""),_display_(/*74.59*/routes/*74.65*/.HomeController.loadSignUp),format.raw/*74.91*/("""" data-target="#signup-box" class="user-signup-link">
                                                    I want to register
                                                    <i class="ace-icon fa fa-arrow-right"></i>
                                                </a>
                                            </div>
                                        </div>
                                    </div><!-- /.widget-body -->
                                </div><!-- /.login-box -->

                                <div id="forgot-box" class="forgot-box widget-box no-border">
                                    <div class="widget-body">
                                        <div class="toolbar center">
                                            <a href="#" data-target="#login-box" class="back-to-login-link">
                                                Back to login
                                                <i class="ace-icon fa fa-arrow-right"></i>
                                            </a>
                                        </div>
                                    </div><!-- /.widget-body -->
                                </div><!-- /.forgot-box -->
                            </div><!-- /.position-relative -->
                        </div>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.main-content -->
        </div><!-- /.main-container -->

        <!-- basic scripts -->

        <!--[if !IE]> -->
        <script src=""""),_display_(/*103.23*/routes/*103.29*/.Assets.versioned("components/jquery/dist/jquery.js")),format.raw/*103.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*104.23*/routes/*104.29*/.Assets.versioned("components/jquery.1x/dist/jquery.js")),format.raw/*104.85*/("""" type="text/javascript"></script>
    </body>
""")))}),format.raw/*106.2*/("""
"""))
      }
    }
  }

  def render(head:Html,signInForm:Form[AccountDto]): play.twirl.api.HtmlFormat.Appendable = apply(head,signInForm)

  def f:((Html,Form[AccountDto]) => play.twirl.api.HtmlFormat.Appendable) = (head,signInForm) => apply(head,signInForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 03 20:27:35 ICT 2018
                  SOURCE: D:/Workspace/note/play-java-seed/app/views/signIn.scala.html
                  HASH: cd436a142594132792afd2d76b7f168899554e3e
                  MATRIX: 964->1|1079->46|1124->43|1152->63|1180->66|1191->70|1229->72|1261->79|1285->83|1305->86|1343->88|1375->94|2937->1629|2991->1674|3031->1676|3109->1726|5041->3627|5117->3675|5667->4198|5682->4204|5729->4230|7325->5798|7341->5804|7416->5857|7502->5915|7518->5921|7596->5977|7677->6027
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|37->5|38->6|38->6|39->7|67->35|67->35|67->35|68->36|94->62|96->64|106->74|106->74|106->74|135->103|135->103|135->103|136->104|136->104|136->104|138->106
                  -- GENERATED --
              */
          