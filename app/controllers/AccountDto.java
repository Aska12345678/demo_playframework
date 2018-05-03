package controllers;

import play.data.validation.Constraints;

public class AccountDto {

  @Constraints.Required
  @Constraints.MaxLength(20)
  @Constraints.MinLength(5)
  private String userName;

  @Constraints.Required
  @Constraints.MinLength(8)
  @Constraints.MaxLength(200)
  private String password;


  public AccountDto() {
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
