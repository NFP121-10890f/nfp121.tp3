package question1;

public class PileTest extends junit.framework.TestCase {
    // Dé?finissez ici les variables d'instance né?cessaires à vos engagements;
    // Vous pouvez é?galement les saisir automatiquement du pré?sentoir
    // à l'aide du menu contextuel "Pré?sentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du pré?sentoir (les objets sans constructeur, comme int, float, etc.).

    private Pile pile1;
    /**
     * Constructeur de la classe-test PileTest
     */
    public PileTest() {
    }

    /**
     * Met en place les engagements.
     * 
     * Mé?thode appelé?e avant chaque appel de mé?thode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        System.out.println("Debut test");
        pile1 = new Pile(3);
    }

    /**
     * Supprime les engagements
     * 
     * Mé?thode appelé?e après chaque appel de mé?thode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        // Libé?rez ici les ressources engagé?es par setUp()
        pile1 = null;
        System.out.println("Fin Test");
    }

    /**
     * Il ne vous reste plus qu'à dé?finir une ou plusieurs mé?thodes de test. Ces
     * mé?thodes doivent vé?rifier les ré?sultats attendus à l'aide d'assertions
     * assertTrue(<boolean>). Par convention, leurs noms devraient dé?buter par
     * "test". Vous pouvez é?baucher le corps grâce au menu contextuel
     * "Enregistrer une mé?thode de test".
     */

    public void testEncourageant(){
        assertTrue(true);
    }

    public void test_Pile_estPleine() throws Exception {
        pile1.empiler(3);
        pile1.empiler(2);
        pile1.empiler(1);

        assertEquals(true, pile1.estPleine());
        
        try {
            pile1.empiler(0);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof question1.PilePleineException);
        }
    }

    public void test_Pile_estVide() throws Exception {
        assertEquals(true, pile1.estVide());
        try {
            Object r = pile1.depiler();
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof question1.PileVideException);
        }
    }

    public void test_Pile_toString() throws Exception {
        assertEquals("toString incorrect ? ", "[]", pile1.toString());
        pile1.empiler(4);
        assertEquals("toString incorrect ? ", "[4]", pile1.toString());
        pile1.empiler(5);
        assertEquals("toString incorrect ? ", "[5, 4]", pile1.toString());
        pile1.empiler(3);
        assertEquals("toString incorrect ? ", "[3, 5, 4]", pile1.toString());

    }
}
