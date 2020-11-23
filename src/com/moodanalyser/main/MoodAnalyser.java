package com.moodanalyser.main;

public class MoodAnalyser {
	public String analyseMood(String mood) throws MoodAnalyserException {
		// TODO Auto-generated method stub
		try {
			if (mood.equals("SAD")) { 
				return "SAD";
			}
			else 
			return mood;
		}catch(NullPointerException e) {
			throw new MoodAnalyserException("Invalid Mood");
		}	
	}
				

}
