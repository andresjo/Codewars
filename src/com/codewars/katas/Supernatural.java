/*Those wayward Winchester boys are in trouble again, hunting something down in New Orleans. 
You are Bobby Singer, you know how "idjits" they can be, so you have to prepare. 
They will call you any minute with the race of the thing, and you want to answer as soon as possible. 
By answer, I mean: tell them how to kill, or fight it.

The guys call you: bob('rugaru')

...and you reply (return) with the info, and your signature saying of yours! Burn it alive, idjits!*/

package com.codewars.katas;

import java.util.HashMap;
import java.util.Map;

public class Supernatural {

	public static String bob(String beast) {
		
		Map<String, String> database = new HashMap<>();
		database.put("werewolf","Silver knife or bullet to the heart");
		database.put("vampire", "Behead it with a machete");
		database.put("wendigo", "Burn it to death");
		database.put("shapeshifter", "Silver knife or bullet to the heart" );
		database.put("angel", "Use the angelic blade");
		database.put("demon","Use Ruby's knife, or some Jesus-juice" );
		database.put("ghost", "Salt and iron, and don't forget to burn the corpse");
		database.put("dragon", "You have to find the excalibur for that");
		database.put("djinn", "Stab it with silver knife dipped in a lamb's blood");
		database.put("pagan god", "It depends on which one it is");
		database.put("leviathan","Use some Borax, then kill Dick" );
		database.put("ghoul", "Behead it");
		database.put("jefferson starship", "Behead it with a silver blade");
		database.put("reaper", "If it's nasty, you should gank who controls it");
		database.put("rugaru", "Burn it alive");
		database.put("skinwalker","A silver bullet will do it" );
		database.put("phoenix", "Use the colt");
		database.put("witch", "They are humans");
		
		if (database.containsKey(beast)){
			return database.get(beast) + ", idjits!";
		}else{
			return "I have friggin no idea yet, idjits!";
		}
		
	}

}
