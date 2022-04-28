package com.injectinginnerbean;

public class TextEditor {
	
	private SpellChecker spellchecker;
	
		public void setSpellChecker(SpellChecker spellchecker) {
			this.spellchecker=spellchecker;
			System.out.println("Inside spellChecker");
			}
		
				public SpellChecker getSpellChecker() {
						return spellchecker;
				}
					public void spellCheck() {
					    spellchecker.checkSpelling();
					}
}
