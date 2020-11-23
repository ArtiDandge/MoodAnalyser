package com.moodanalyser.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	MoodAnalyser moodAnalyser = new MoodAnalyser();
	
	@Test
	public void givenSad_WhenAnalaylseMood_ThenShouldReturnSAD() {
		Assert.assertEquals("I am in SAD mood",moodAnalyser.analyseMood("I am in SAD mood"));
		
	}
	
	@Test
	public void givenHappy_WhenAnalaylseMood_ThenShouldReturnHAPPY() {
		Assert.assertEquals("I am in HAPPY mood",moodAnalyser.analyseMood("I am in HAPPY mood"));
		
	}
	
}
