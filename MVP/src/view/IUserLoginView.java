package view;

import model.User;

public interface IUserLoginView {

	  String getUserName();
	  String getPassword();
	  void    clearUserName();
	  void   claerPassword();
	  void  showLading();
	  void  hideLoding();
	  void   tomainActivity(User user);
	  void   showFailedError();
}
