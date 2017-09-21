package com.codewars.katas;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;

import com.codewars.katas.Supernatural;
import org.junit.Test;

/**
 *
 * @author isvorcz
 */
public class SupernaturalTest
{
    private static final Beast[] BEASTS = new Beast[]
    {
            new Beast("else", "I have friggin no idea yet"), new Beast("werewolf", "Silver knife or bullet to the heart"),
            new Beast("vampire", "Behead it with a machete"), new Beast("wendigo", "Burn it to death"),
            new Beast("shapeshifter", "Silver knife or bullet to the heart"), new Beast("angel", "Use the angelic blade"),
            new Beast("demon", "Use Ruby\'s knife, or some Jesus-juice"),
            new Beast("ghost", "Salt and iron, and don\'t forget to burn the corpse"),
            new Beast("dragon", "You have to find the excalibur for that"),
            new Beast("djinn", "Stab it with silver knife dipped in a lamb\'s blood"),
            new Beast("pagan god", "It depends on which one it is"), new Beast("leviathan", "Use some Borax, then kill Dick"),
            new Beast("ghoul", "Behead it"), new Beast("jefferson starship", "Behead it with a silver blade"),
            new Beast("reaper", "If it\'s nasty, you should gank who controls it"), new Beast("rugaru", "Burn it alive"),
            new Beast("skinwalker", "A silver bullet will do it"), new Beast("phoenix", "Use the colt"),
            new Beast("witch", "They are humans")
    };

    public static String bob(String beast)
    {
        return  Arrays.stream(BEASTS).filter( b -> b.name.equals(beast)).findFirst().orElse(BEASTS[0]).hint +", idjits!";
    }

    @Test public void testBobDoesntKnow()
    {
        assertEquals("SomeThing", "I have friggin no idea yet, idjits!", Supernatural.bob(String.valueOf("r2d2")));
    }

    /**
     * Test of bob method, of class Supernatural.
     */
    @Test public void testBobKnows()
    {
        for (Beast b : BEASTS)
        {
             assertEquals(b.name, b.hint + ", idjits!", Supernatural.bob(b.name));
        }
    }

    private static class Beast
    {
        private final String hint;
        private final String name;

        public Beast(String name, String hint)
        {
            this.name = name;
            this.hint = hint;
        }
    }
}