package com.example.uibestpractice;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ListView msgListView;
    private EditText inputText;
    private Button send;
    private MsgAdapter adapter;
    private List<Msg> msgList = new ArrayList<Msg>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMsgs();//初始化消息数据 历史数据
        adapter = new MsgAdapter(MainActivity.this,R.layout.msg_item,msgList);
        inputText = (EditText)findViewById(R.id.input_text);
        send = (Button)findViewById(R.id.send);
        msgListView = (ListView) findViewById(R.id.msg_list_view);
        msgListView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if (!"".equals(content)){
                    int size =  msgList.size();
                    Msg msg = new Msg(content,Msg.TYPE_SENT);
                    if (size%2 == 1){ msg = new Msg(content,Msg.TYPE_RECEIVEC);}
                    msgList.add(msg);
                    adapter.notifyDataSetChanged();
                    msgListView.setSelection(msgList.size());
                    inputText.setText("");
                }
            }
        });
    }
    public void initMsgs(){
        Msg msg1 = new Msg("hello",Msg.TYPE_RECEIVEC);
        msgList.add(msg1);
        Msg msg2 = new Msg("hello,who",Msg.TYPE_SENT);
        msgList.add(msg2);
        Msg msg3 = new Msg("gun",Msg.TYPE_RECEIVEC);
        msgList.add(msg3);
    }
}
