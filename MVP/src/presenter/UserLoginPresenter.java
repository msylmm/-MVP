package presenter;

import android.os.Handler;
import view.IUserLoginView;
import model.IUserBiz;
import model.OnLoginListener;
import model.User;
import model.UserBiz;

public class UserLoginPresenter {

	private IUserBiz userBiz;
	private  IUserLoginView userLoginView;
	private Handler mhandler=new Handler();
	
	
	public UserLoginPresenter(IUserLoginView userLoginView){
		this.userBiz=new UserBiz();
		this.userLoginView=userLoginView;
	}
	
	
	public void login(){
		userLoginView.showLading();
		userBiz.login(userLoginView.getUserName(), userLoginView.getPassword(), new OnLoginListener(){

			@Override
			public void loginSuccess(final User user) {
				// TODO Auto-generated method stub
				//需要在UI线程执行
				mhandler.post(new Runnable()
				{
                   //需要在UI线程执行
					@Override
					public void run() {
						// TODO Auto-generated method stub
						userLoginView.tomainActivity(user);
						userLoginView.hideLoding();
					}
					
				});
			}

			@Override
			public void loginFailed() {
				// TODO Auto-generated method stub
				//需要在UI线程上执行
				mhandler.post(new Runnable(){

					@Override
					public void run() {
						// TODO Auto-generated method stub
						userLoginView.showFailedError();
						userLoginView.hideLoding();
					}
					
				});
			}
			
		});
	}
	public void clear(){
		userLoginView.clearUserName();
	}
}
