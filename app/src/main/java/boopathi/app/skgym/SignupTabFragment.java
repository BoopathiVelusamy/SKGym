package boopathi.app.skgym;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    EditText email, mobile,pass,cpass;
    Button signupbtn;


    float v=0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
         ViewGroup root = (ViewGroup)inflater.inflate(R.layout.signup_fragment,container,false);

        email = (EditText)root.findViewById(R.id.email1);
        pass = (EditText)root.findViewById(R.id.pass1);
        mobile = (EditText)root.findViewById(R.id.mobile1);
        cpass = (EditText)root.findViewById(R.id.confirmpass1);
        signupbtn = (Button)root.findViewById(R.id.signupbtn);

        email.setTranslationY(300);
        pass.setTranslationY(300);
        mobile.setTranslationY(300);
        cpass.setTranslationY(300);
        signupbtn.setTranslationY(300);

        email.setAlpha(v);
        pass.setAlpha(v);
        mobile.setAlpha(v);
        cpass.setAlpha(v);
        signupbtn.setAlpha(v);


        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        pass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        mobile.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        cpass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();
        signupbtn.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();

        return root;
    }
}
