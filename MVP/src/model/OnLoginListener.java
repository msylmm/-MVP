package model;

public interface OnLoginListener {
    
	void loginSuccess(User user);
	
	void loginFailed();
}
