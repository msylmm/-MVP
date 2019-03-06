package model;

public class UserBiz  implements IUserBiz{

	@Override
	public void login(final String username, final String password,
			final OnLoginListener loginListener) {
		// TODO Auto-generated method stub
		//模拟子线程
		new Thread(){
			public void run(){
				try{
					Thread.sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				if("zhy".equals(username) && "123".equals(password)){
					User user=new User();
					user.setUsername(username);
					user.setPassword(password);
					loginListener.loginSuccess(user);
				}else{
					loginListener.loginFailed();
				}
			}
	 //模拟登陆成功
			
		}.start();
	}

}
