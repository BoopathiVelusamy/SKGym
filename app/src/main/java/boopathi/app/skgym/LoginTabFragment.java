package boopathi.app.skgym;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {

    EditText email, pass;
    Button loginbtn;
    TextView forgetpwd;

    float v=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.login_fragment,container,false);

        email = (EditText)root.findViewById(R.id.email);
        pass = (EditText)root.findViewById(R.id.pass);
        loginbtn = (Button)root.findViewById(R.id.loginbtn);
        forgetpwd = (TextView)root.findViewById(R.id.forgetpwd);

        email.setTranslationY(300);
        pass.setTranslationY(300);
        loginbtn.setTranslationY(300);
        forgetpwd.setTranslationY(300);

        email.setAlpha(v);
        pass.setAlpha(v);
        loginbtn.setAlpha(v);
        forgetpwd.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        pass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        loginbtn.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        forgetpwd.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();

        return root;
    }
}
