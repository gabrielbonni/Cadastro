package br.edu.ifsp.scl.ads.pdm.cadastro;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

public class User {
    private String name;
    private String phone;
    private String email;
    private CheckBox masc;
    private CheckBox fem;
    private String city;
    private Spinner state;
    private Button btnSave;
    private Button btnClear;

    User user = new User();

    public User(String name, String phone, String email, CheckBox masc, CheckBox fem, String city, Spinner state){
        name = this.name;
        phone = this.phone;
        email = this.email;
        masc = this.masc;
        fem = this.fem;
        city = this.city;
        state = this.state;
    }

}
