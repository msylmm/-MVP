package view;

import presenter.UserLoginPresenter;
import model.User;
import android.R;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class UserLoginActivity extends ActionBarActivity implements IUserLoginView {

	private EditText mEtUsername,mEtPassword;
	private Button mBtnLogin,mBtnClear;
	private ProgressBar mPbLoading;
	
	private UserLoginPresenter mUserLoginPresenter=new UserLoginPresenter(this);
	
	protected  void  oncreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_item);
		initViews();
	}
	
	private void initViews() {
		// TODO Auto-generated method stub
		mEtUsername=(EditText)findViewById(R.id.text1);
		mEtPassword=(EditText)findViewById(R.id.text2);
		mBtnClear=(Button)findViewById(R.id.content);
		mBtnLogin=(Button)findViewById(R.id.text2);
		
		mPbLoading=(ProgressBar)findViewById(R.id.button3);
		
		mBtnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				mUserLoginPresenter.login();
			}
		});
		mBtnClear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				mUserLoginPresenter.clear();
			}
		});
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return mEtUsername.getText().toString();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return mEtPassword.getText().toString();
	}

	@Override
	public void clearUserName() {
		// TODO Auto-generated method stub
		mEtUsername.setText("");
	}

	@Override
	public void claerPassword() {
		// TODO Auto-generated method stub
		mEtPassword.setText("");
	}

	@Override
	public void showLading() {
		// TODO Auto-generated method stub
		mPbLoading.setVisibility(View.VISIBLE);
	}

	@Override
	public void hideLoding() {
		// TODO Auto-generated method stub
	 mPbLoading.setVisibility(View.GONE);
	}

	@Override
	public void tomainActivity(User user) {
		// TODO Auto-generated method stub
	Toast.makeText(this, user.getUsername()+"login success , to MainActivity",Toast.LENGTH_SHORT).show();
	}

	@Override
	public void showFailedError() {
		// TODO Auto-generated method stub
		Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show();
	}

}
