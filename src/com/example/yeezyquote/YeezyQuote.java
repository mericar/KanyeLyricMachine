package com.example.yeezyquote;
import java.util.Random;

public class YeezyQuote {
	
	// Distinct quotes: Philosophical, motivational, disses
	
		public String[] philQuotes = {
	    		"Did you realize, that you were a champion?... Uh huh, yes I did,"
	    		+ "that's why packed it up and took it back to the crib...",
	    		"... More Louis V, my mamma couldn't get through to me...",
	    		"Damn... Everything I'm not made me everything I am."};
		
		
		public String[] motivationalQuotes = {
	    		"You can live through anything if Magic made it.",
	    		"Did you realize, that you were a champion?"};
		
		
		public String[] dissQuotes = {
	    		"... Got a lotta cheese award."};
		
		
		
		// Methods 
		public String getDissQuote() {
			
			return randomSelector(dissQuotes);
		}
		
		
		
		public String getPhilosophicalQuote() {
			
			return randomSelector(philQuotes);
			
		}
		
		
		
		public String getMotivationalQuote() {
			
			return randomSelector(motivationalQuotes);
			
		}
		
		
		
		public String randomSelector(String[] quotetype) {
			
			String quote = "";
			
			Random randomGenerator = new Random(); // Construct a Random number generator
            int randomNumber = randomGenerator.nextInt(quotetype.length);
            
            quote = quotetype[randomNumber];
            
            return  quote;
			
		} 
	

}
