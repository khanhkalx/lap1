package com.example.firstappcntt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    public Spinner sp1 ;
    public EditText HoTen;
    public EditText phoneNumber;
    public Button bt1;
    String [] course = {"An Giang", "Bà Rịa-Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai",
            "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "TP. Hồ Chí Minh", "Hòa Bình",
            "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam",
            "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên - Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái",
    };

    public ListView lv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        addAction();
    }

    private void addAction() {
        bt1.setOnClickListener(this);
    }

    private void initView() {
        String [] list = {"Nguyễn Hoàng Khánh-Nam-0865554513-Hà Nội" , "Nguyễn Hoàng Anh-Nam-0865554513-Vĩnh Phúc"};
        HoTen = findViewById(R.id.Hoten);
        phoneNumber = findViewById(R.id.phone);
        bt1  = findViewById(R.id.add_in);
        sp1 = findViewById(R.id.quequan);
        sp1.setOnItemClickListener(this);
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, course);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(ad);
        lv1 = findViewById(R.id.list_view);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<>(
                this,
                R.layout.activity_main,
                list);
        lv1.setAdapter(arr);



    }
    RadioGroup radioGroup = findViewById(R.id.group_button);


    int selectedId = radioGroup.getCheckedRadioButtonId();
    public ArrayAdapter<String> laythongtin(){
        String[] arr ;
        String a = String.valueOf(HoTen.getText());
        String b = String.valueOf(phoneNumber.getText());
        String selectedValue;
        if (selectedId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedId);
            selectedValue = selectedRadioButton.getText().toString();

        }


        return null;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),
                        course[position],
                        Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onClick(View v) {

    }


}