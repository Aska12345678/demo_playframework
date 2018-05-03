package controllers;

import javax.inject.Inject;
import javax.inject.Singleton;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

@Singleton
public class HomeController extends Controller {

  private final Form<AccountDto> loginForm;

  @Inject
  public HomeController(FormFactory formFactory) {
    this.loginForm = formFactory.form(AccountDto.class);
  }

  public Result login() {
    return ok(views.html.signIn.render(views.html.loginH.render("Login"), loginForm));
  }


  public Result signIn() {
    return ok(views.html.signIn.render(views.html.loginH.render("SignUp"), loginForm));
  }

  public Result loadSignUp() {
    return ok(views.html.signUp.render(views.html.loginH.render("SignUp"), loginForm));
  }

  public Result signUp() {
    return ok(views.html.signUp.render(views.html.loginH.render("SignUp"), loginForm));
  }
}
