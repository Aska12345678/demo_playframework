
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

object signUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Html,Form[AccountDto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(head: Html, signUpForm: Form[AccountDto]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.44*/("""
"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
    """),_display_(/*4.6*/head),format.raw/*4.10*/("""
""")))}/*5.2*/ {_display_(Seq[Any](format.raw/*5.4*/("""
    """),format.raw/*6.5*/("""<body class="login-layout">
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
                                <div id="signup-box" class="signup-box login-box visible widget-box no-border">
                                    <div class="widget-body">
                                        <div class="widget-main">
                                            <h4 class="header green lighter bigger">
                                                <i class="ace-icon fa fa-users blue"></i>
                                                New User Registration
                                            </h4>

                                            <div class="space-6"></div>
                                            <p> Enter your details to begin: </p>

                                            """),_display_(/*35.46*/form(action = routes.HomeController.signUp())/*35.91*/ {_display_(Seq[Any](format.raw/*35.93*/("""
                                                """),_display_(/*36.50*/helper/*36.56*/.CSRF.formField),format.raw/*36.71*/("""
                                                """),format.raw/*37.49*/("""<fieldset>
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

                                                    <label class="block clearfix">
                                                        <span class="block input-icon input-icon-right">
                                                            <input type="password" class="form-control" placeholder="Repeat password" />
                                                            <i class="ace-icon fa fa-retweet"></i>
                                                        </span>
                                                    </label>

                                                    <div class="space-24"></div>

                                                    <div class="clearfix">
                                                        <button type="button" class="width-65 pull-right btn btn-sm btn-success">
                                                            <span class="bigger-110">Register</span>

                                                            <i class="ace-icon fa fa-arrow-right icon-on-right"></i>
                                                        </button>
                                                    </div>
                                                </fieldset>
                                            """)))}),format.raw/*69.46*/("""
                                        """),format.raw/*70.41*/("""</div>

                                        <div class="toolbar center">
                                            <a href=""""),_display_(/*73.55*/routes/*73.61*/.HomeController.login),format.raw/*73.82*/("""" data-target="#login-box" class="back-to-login-link">
                                                <i class="ace-icon fa fa-arrow-left"></i>
                                                Back to login
                                            </a>
                                        </div>
                                    </div><!-- /.widget-body -->
                                </div><!-- /.signup-box -->
                            </div>
                        </div><!-- /.col -->
                    </div><!-- /.row -->
                </div><!-- /.main-content -->
            </div>
        </div><!-- /.main-container -->
        <script src=""""),_display_(/*86.23*/routes/*86.29*/.Assets.versioned("components/jquery/dist/jquery.js")),format.raw/*86.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*87.23*/routes/*87.29*/.Assets.versioned("components/jquery.1x/dist/jquery.js")),format.raw/*87.85*/("""" type="text/javascript"></script>
    </body>
""")))}))
      }
    }
  }

  def render(head:Html,signUpForm:Form[AccountDto]): play.twirl.api.HtmlFormat.Appendable = apply(head,signUpForm)

  def f:((Html,Form[AccountDto]) => play.twirl.api.HtmlFormat.Appendable) = (head,signUpForm) => apply(head,signUpForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 03 20:29:00 ICT 2018
                  SOURCE: D:/Workspace/note/play-java-seed/app/views/signUp.scala.html
                  HASH: f355f84115e26e19d5833fe6b3339d4e2413385b
                  MATRIX: 964->1|1079->46|1124->43|1152->64|1163->68|1201->70|1233->77|1257->81|1277->84|1315->86|1347->92|2995->1713|3049->1758|3089->1760|3167->1811|3182->1817|3218->1832|3296->1882|5732->4287|5802->4329|5963->4463|5978->4469|6020->4490|6736->5179|6751->5185|6825->5238|6910->5296|6925->5302|7002->5358
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|36->4|37->5|37->5|38->6|67->35|67->35|67->35|68->36|68->36|68->36|69->37|101->69|102->70|105->73|105->73|105->73|118->86|118->86|118->86|119->87|119->87|119->87
                  -- GENERATED --
              */
          