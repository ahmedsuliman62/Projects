import static org.junit.Assert.*;  
import org.junit.Test;  
  
public class SimpleWordProblemTest2 {  
  
    @Test  
    public void answerCheck(){  
        assertEquals("That's the correct answer good job!",SimpleWordProblem.checkAnswer(4, 5));  
        assertEquals("Sorry, that's not the correct answer please try again!", SimpleWordProblem.checkAnswer(4, 5));  
    }  
}  