package com.example.nikhilscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bsin,bcos,btan,bb1,bb2,blog,bac,bc,b1byx,bdiv,bln,bmul,bfact,bmin,bsqrt,bplus,bsquare,bpi,bdot,bequal;
    TextView tvsec,tvmain;
    String pi = "3.14159263";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        blog = findViewById(R.id.blog);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        b1byx = findViewById(R.id.b1byx);
        bdiv = findViewById(R.id.bdiv);
        bln = findViewById(R.id.bln);
        bmul = findViewById(R.id.bmul);
        bfact = findViewById(R.id.bfact);
        bmin= findViewById(R.id.bmin);
        bsqrt = findViewById(R.id.bsqrt);
        bplus = findViewById(R.id.bplus);
        bsquare = findViewById(R.id.bsquare);
        bpi = findViewById(R.id.bpi);
        bdot = findViewById(R.id.bdot);
        bequal = findViewById(R.id.bequal);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"0");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvsec.getText()+".");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvmain.getText().toString();
                tvmain.setText(val.substring(0,val.length()-1));
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"+");
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"x");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"÷");
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(tvmain.getText().toString());
                double square = result*result;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(result+"²");
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Math.sqrt(Double.parseDouble(tvmain.getText().toString()));
                tvmain.setText(String.valueOf(result));
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText()+pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"tan");
            }
        });
        b1byx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"^(-1)");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = Integer.parseInt(tvmain.getText().toString());
                int fact = factorial(val);
                tvmain.setText(String.valueOf(fact));
                tvsec.setText(val+"!");
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"ln");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"log");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvmain.getText().toString();
                String replacedStr = val.replace('÷','/').replace('x','*');
                double result = eval(replacedStr);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);

            }
        });
    }
    private int factorial(int num)
    {
        if(num==0||num==1)
        {
            return 1;
        }
        return num*factorial(num-1);
    }

    private double eval(String str) {

        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while(ch==' ')nextChar();
                if(ch == charToEat) {
                    nextChar();
                    return true;
                }
                return  false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if(pos < str.length()) throw new RuntimeException("Unknown : "+(char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for( ; ; )
                {
                    if(eat('+')) x += parseTerm();
                    else if(eat('-')) x-= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for( ; ; )
                {
                    if(eat('*')) x*= parseFactor();
                    else if(eat('/')) x/= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if(eat('+')) return parseFactor();
                if(eat('-')) return -parseFactor();

                double x;
                int startpos = this.pos;
                if(eat('(')) {
                    x = parseExpression();
                    eat(')');
                }
                else if(ch>='0' && ch<='9' || ch=='.')
                {
                    while(ch>='0' && ch<='9' || ch=='.')
                    {
                        nextChar();
                    }
                    x = Double.parseDouble(str.substring(startpos,this.pos));
                }
                else if(ch>='a' && ch <='z')
                {
                    while(ch>='a' && ch<='z')
                    {
                        nextChar();
                    }
                    String func = str.substring(startpos,this.pos);
                    x = parseFactor();
                    if(func.equals("sqrt")) x = Math.sqrt(x);
                    else if(func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if(func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if(func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if(func.equals("log")) x = Math.log10(x);
                    else if(func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function : "+func);
                }
                else {
                    throw new RuntimeException("Unexpected : "+(char) ch);
                }
                if(eat('^')) x = Math.pow(x,parseFactor());
                return x;
            }
        }.parse();
    }
}