package rmu.mtlab.mtlab_listview;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private String[] data={"ไทย","บรูไน","อินโดนีเซีย","ลาว",
            "มาเลเชีย","พม่า","สิงคโปร์","เวียดนาม","ฟิลิปปินส์","กัมพูชา",};
    private int[] picture={R.drawable.thailand,R.drawable.brunei,R.drawable.indonesia,R.drawable.lao,
    R.drawable.malaysia,R.drawable.myanmar,R.drawable.singapore,R.drawable.vietnam,
    R.drawable.cambodia};

    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.lvMenu);

        // สร้าง adapter แบบง่าย
//        adapter=new ArrayAdapter<String>(getApplicationContext(),
//                android.R.layout.simple_list_item_1,data);

        // ใช้ adapter ที่สร้างขึ้น และส่งข้อมูลเข้าไป
        MyAdapter adapter=new MyAdapter(data,picture,getApplicationContext());

        // กำหนด adapter ให้กับ listview
        lv.setAdapter(adapter);


        //คลิก item ของ listview
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // ตรวจสอบแสดงการคลิกตำแหน่งของ item
                Toast.makeText(getApplicationContext(),"ลำดับ "+data[i],Toast.LENGTH_SHORT).show();
            }
        });

    }
}
