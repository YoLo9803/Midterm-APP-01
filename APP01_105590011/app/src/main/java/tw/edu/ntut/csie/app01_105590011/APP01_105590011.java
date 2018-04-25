package tw.edu.ntut.csie.app01_105590011;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class APP01_105590011 extends AppCompatActivity {
    private EditText meditGrade;
    private Button mBtnOk;
    private TextView mMsgGrade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app01_105590011);
        meditGrade = (EditText) findViewById(R.id.editGrade);
        mBtnOk = (Button) findViewById(R.id.BtnOk);
        mMsgGrade = (TextView)findViewById(R.id.MsgGrade);

        mBtnOk.setOnClickListener(btnOkOnclick);
    }
    private View.OnClickListener btnOkOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            LetterGrade LG = new LetterGrade();
            int iGrade=Integer.parseInt(meditGrade.getText().toString());
            String G = LG.lettergrade(iGrade);
            String Ans =  "等第：";
            if (G == "X")
                Ans += "輸入分數應介於0..100";
            else
                Ans += G;
            mMsgGrade.setText(Ans);
        }
    };



}
