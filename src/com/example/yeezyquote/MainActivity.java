package com.example.yeezyquote;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private YeezyQuote oneYeezyQuote = new YeezyQuote();
	private TextView quoteBox;
	private Button getDissQuoteButton;
	private Button getMotivationalQuoteButton;
	private Button getPhilosophicalQuoteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Declare the View variables and then assign them the Views from the layout file
        quoteBox = (TextView) findViewById(R.id.textView1);
        getDissQuoteButton = (Button) findViewById(R.id.button1);
        getPhilosophicalQuoteButton = (Button) findViewById(R.id.button2);
        getMotivationalQuoteButton = (Button) findViewById(R.id.button3);
        
        
        
        

        getDissQuoteButton.setOnClickListener(new View.OnClickListener() {  
           @Override
            public void onClick(View v) {
            	String displayedQuote = oneYeezyQuote.getDissQuote();
                
                // Update the label with our dynamic answer
                quoteBox.setText(displayedQuote);
                
                animateQuote();
            }
        });
        
        
        getMotivationalQuoteButton.setOnClickListener(new View.OnClickListener() {
            
            @Override
             public void onClick(View v) {
             	String displayedQuote = oneYeezyQuote.getMotivationalQuote();
                 
                 // Update the label with our dynamic answer
                 quoteBox.setText(displayedQuote);
                 
                 animateQuote();
             }
         });
         
        
       
        getPhilosophicalQuoteButton.setOnClickListener(new View.OnClickListener() {
            
            @Override
             public void onClick(View v) {
             	String displayedQuote = oneYeezyQuote.getPhilosophicalQuote();
                 
                 // Update the label with our dynamic answer
                 quoteBox.setText(displayedQuote);
                 
                 animateQuote();
             }
         });
         
    }
    
    
    
    private void animateQuote(){
    	
    	AlphaAnimation fadeInAnimation = new AlphaAnimation(0,1);
    	fadeInAnimation.setDuration(1500);
    	fadeInAnimation.setFillAfter(true);
    	
    	quoteBox.setAnimation(fadeInAnimation);
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up buttonn AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}