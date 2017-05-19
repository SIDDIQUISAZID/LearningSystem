package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class InterVeiwQuestion extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,
    t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44,t45;
    LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22
            ,l23,l24,l25,l26,l27,l28,l29,l30,l31
            ,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45;
    int[] z=new int[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inter_veiw_question);

        t1=(TextView)findViewById(R.id.layouttext1);
        t2=(TextView)findViewById(R.id.layouttext2);
        t3=(TextView)findViewById(R.id.layouttext3);
        t4=(TextView)findViewById(R.id.layouttext4);
        t5=(TextView)findViewById(R.id.layouttext5);
        t6=(TextView)findViewById(R.id.layouttext6);
        t7=(TextView)findViewById(R.id.layouttext7);
        t8=(TextView)findViewById(R.id.layouttext8);

        t9=(TextView)findViewById(R.id.layouttext9);
        t10=(TextView)findViewById(R.id.layouttext10);
        t11=(TextView)findViewById(R.id.layouttext11);
        t12=(TextView)findViewById(R.id.layouttext12);
        t13=(TextView)findViewById(R.id.layouttext13);
        t14=(TextView)findViewById(R.id.layouttext14);
        t15=(TextView)findViewById(R.id.layouttext15);
        t16=(TextView)findViewById(R.id.layouttext16);

        t17=(TextView)findViewById(R.id.layouttext17);
        t18=(TextView)findViewById(R.id.layouttext18);
        t19=(TextView)findViewById(R.id.layouttext19);
        t20=(TextView)findViewById(R.id.layouttext20);
        t21=(TextView)findViewById(R.id.layouttext21);
        t22=(TextView)findViewById(R.id.layouttext22);
        t23=(TextView)findViewById(R.id.layouttext23);
        t24=(TextView)findViewById(R.id.layouttext24);

        t25=(TextView)findViewById(R.id.layouttext25);
        t26=(TextView)findViewById(R.id.layouttext26);
        t27=(TextView)findViewById(R.id.layouttext27);
        t28=(TextView)findViewById(R.id.layouttext28);
        t29=(TextView)findViewById(R.id.layouttext29);
        t30=(TextView)findViewById(R.id.layouttext30);
        t31=(TextView)findViewById(R.id.layouttext31);
        t32=(TextView)findViewById(R.id.layouttext32);

        t33=(TextView)findViewById(R.id.layouttext33);
        t34=(TextView)findViewById(R.id.layouttext34);
        t35=(TextView)findViewById(R.id.layouttext35);
        t36=(TextView)findViewById(R.id.layouttext36);
        t37=(TextView)findViewById(R.id.layouttext37);
        t38=(TextView)findViewById(R.id.layouttext38);
        t39=(TextView)findViewById(R.id.layouttext39);
        t40=(TextView)findViewById(R.id.layouttext40);

        t41=(TextView)findViewById(R.id.layouttext41);
        t42=(TextView)findViewById(R.id.layouttext42);
        t43=(TextView)findViewById(R.id.layouttext43);
        t44=(TextView)findViewById(R.id.layouttext44);
        t45=(TextView)findViewById(R.id.layouttext45);




        l1=(LinearLayout)findViewById(R.id.layout1);
        l2=(LinearLayout)findViewById(R.id.layout2);
        l3=(LinearLayout)findViewById(R.id.layout3);
        l4=(LinearLayout)findViewById(R.id.layout4);
        l5=(LinearLayout)findViewById(R.id.layout5);
        l6=(LinearLayout)findViewById(R.id.layout6);
        l7=(LinearLayout)findViewById(R.id.layout7);
        l8=(LinearLayout)findViewById(R.id.layout8);

        l9=(LinearLayout)findViewById(R.id.layout9);
        l10=(LinearLayout)findViewById(R.id.layout10);
        l11=(LinearLayout)findViewById(R.id.layout11);
        l12=(LinearLayout)findViewById(R.id.layout12);
        l13=(LinearLayout)findViewById(R.id.layout13);
        l14=(LinearLayout)findViewById(R.id.layout14);
        l15=(LinearLayout)findViewById(R.id.layout15);
        l16=(LinearLayout)findViewById(R.id.layout16);

        l17=(LinearLayout)findViewById(R.id.layout17);
        l18=(LinearLayout)findViewById(R.id.layout18);
        l19=(LinearLayout)findViewById(R.id.layout19);
        l20=(LinearLayout)findViewById(R.id.layout20);
        l21=(LinearLayout)findViewById(R.id.layout21);
        l22=(LinearLayout)findViewById(R.id.layout22);
        l23=(LinearLayout)findViewById(R.id.layout23);
        l24=(LinearLayout)findViewById(R.id.layout24);

        l25=(LinearLayout)findViewById(R.id.layout25);
        l26=(LinearLayout)findViewById(R.id.layout26);
        l27=(LinearLayout)findViewById(R.id.layout27);
        l28=(LinearLayout)findViewById(R.id.layout28);
        l29=(LinearLayout)findViewById(R.id.layout29);
        l30=(LinearLayout)findViewById(R.id.layout30);
        l31=(LinearLayout)findViewById(R.id.layout31);
        l32=(LinearLayout)findViewById(R.id.layout32);

        l33=(LinearLayout)findViewById(R.id.layout33);
        l34=(LinearLayout)findViewById(R.id.layout34);
        l35=(LinearLayout)findViewById(R.id.layout35);
        l36=(LinearLayout)findViewById(R.id.layout36);
        l37=(LinearLayout)findViewById(R.id.layout37);
        l38=(LinearLayout)findViewById(R.id.layout38);
        l39=(LinearLayout)findViewById(R.id.layout39);
        l40=(LinearLayout)findViewById(R.id.layout40);

        l41=(LinearLayout)findViewById(R.id.layout41);
        l42=(LinearLayout)findViewById(R.id.layout42);
        l43=(LinearLayout)findViewById(R.id.layout43);
        l44=(LinearLayout)findViewById(R.id.layout44);
        l45=(LinearLayout)findViewById(R.id.layout45);




        l1.setVisibility(View.GONE);
        l2.setVisibility(View.GONE);
        l3.setVisibility(View.GONE);
        l4.setVisibility(View.GONE);
        l5.setVisibility(View.GONE);
        l6.setVisibility(View.GONE);
        l7.setVisibility(View.GONE);
        l8.setVisibility(View.GONE);

        l9.setVisibility(View.GONE);
        l10.setVisibility(View.GONE);
        l11.setVisibility(View.GONE);
        l12.setVisibility(View.GONE);
        l13.setVisibility(View.GONE);
        l14.setVisibility(View.GONE);
        l15.setVisibility(View.GONE);
        l16.setVisibility(View.GONE);

        l17.setVisibility(View.GONE);
        l18.setVisibility(View.GONE);
        l19.setVisibility(View.GONE);
        l20.setVisibility(View.GONE);
        l21.setVisibility(View.GONE);
        l22.setVisibility(View.GONE);
        l23.setVisibility(View.GONE);
        l24.setVisibility(View.GONE);

        l25.setVisibility(View.GONE);
        l26.setVisibility(View.GONE);
        l27.setVisibility(View.GONE);
        l28.setVisibility(View.GONE);
        l29.setVisibility(View.GONE);
        l30.setVisibility(View.GONE);
        l31.setVisibility(View.GONE);
        l32.setVisibility(View.GONE);

        l33.setVisibility(View.GONE);
        l34.setVisibility(View.GONE);
        l35.setVisibility(View.GONE);
        l36.setVisibility(View.GONE);
        l37.setVisibility(View.GONE);
        l38.setVisibility(View.GONE);
        l39.setVisibility(View.GONE);
        l40.setVisibility(View.GONE);

        l41.setVisibility(View.GONE);
        l42.setVisibility(View.GONE);
        l43.setVisibility(View.GONE);
        l44.setVisibility(View.GONE);
        l45.setVisibility(View.GONE);


        t1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l1.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.VISIBLE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l2.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l3.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.VISIBLE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l4.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.VISIBLE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l5.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.VISIBLE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l6.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.VISIBLE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l7.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.VISIBLE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l2.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.VISIBLE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l2.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.VISIBLE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l9.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.VISIBLE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l10.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.VISIBLE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l11.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.VISIBLE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l12.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.VISIBLE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l13.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.VISIBLE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l14.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.VISIBLE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l15.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.VISIBLE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l16.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.VISIBLE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l17.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.VISIBLE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l18.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.VISIBLE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.VISIBLE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });


        t19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l2.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.VISIBLE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });


        t20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l20.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.VISIBLE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l21.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.VISIBLE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });
        t22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l22.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.VISIBLE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });
        t23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l23.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.VISIBLE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l24.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.VISIBLE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l25.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.VISIBLE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l26.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.VISIBLE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l27.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.VISIBLE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l28.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.VISIBLE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t29.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l29.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.VISIBLE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t30.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l30.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.VISIBLE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t31.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l31.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.VISIBLE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t32.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l32.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.VISIBLE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t33.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l33.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.VISIBLE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t34.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l34.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.VISIBLE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t35.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l35.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.VISIBLE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t36.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l36.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.VISIBLE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t37.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l37.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.VISIBLE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t38.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l38.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.VISIBLE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t39.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l39.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.VISIBLE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t40.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l40.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.VISIBLE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t41.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l41.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.VISIBLE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t42.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l2.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.VISIBLE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t43.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l43.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.VISIBLE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t44.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l44.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.VISIBLE);
                    l45.setVisibility(View.GONE);




                    z[0]=1;
                }

            }
        });

        t45.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(z[0]==1){
                    l45.setVisibility(View.GONE);
                    z[0]=0;
                }
                else {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                    l7.setVisibility(View.GONE);
                    l8.setVisibility(View.GONE);

                    l9.setVisibility(View.GONE);
                    l10.setVisibility(View.GONE);
                    l11.setVisibility(View.GONE);
                    l12.setVisibility(View.GONE);
                    l13.setVisibility(View.GONE);
                    l14.setVisibility(View.GONE);
                    l15.setVisibility(View.GONE);
                    l16.setVisibility(View.GONE);

                    l17.setVisibility(View.GONE);
                    l18.setVisibility(View.GONE);
                    l19.setVisibility(View.GONE);
                    l20.setVisibility(View.GONE);
                    l21.setVisibility(View.GONE);
                    l22.setVisibility(View.GONE);
                    l23.setVisibility(View.GONE);
                    l24.setVisibility(View.GONE);

                    l25.setVisibility(View.GONE);
                    l26.setVisibility(View.GONE);
                    l27.setVisibility(View.GONE);
                    l28.setVisibility(View.GONE);
                    l29.setVisibility(View.GONE);
                    l30.setVisibility(View.GONE);
                    l31.setVisibility(View.GONE);
                    l32.setVisibility(View.GONE);

                    l33.setVisibility(View.GONE);
                    l34.setVisibility(View.GONE);
                    l35.setVisibility(View.GONE);
                    l36.setVisibility(View.GONE);
                    l37.setVisibility(View.GONE);
                    l38.setVisibility(View.GONE);
                    l39.setVisibility(View.GONE);
                    l40.setVisibility(View.GONE);

                    l41.setVisibility(View.GONE);
                    l42.setVisibility(View.GONE);
                    l43.setVisibility(View.GONE);
                    l44.setVisibility(View.GONE);
                    l45.setVisibility(View.VISIBLE);




                    z[0]=1;
                }

            }
        });


    }

}
