import java.util.Iterator;  
import java.util.List;  
  
public class Question{  
private int id;  
private String name;  
private List<String> answers;  
private List<String> Levels;

public Question() {}  
public Question(int id, String name, List<String> answers,List<String>Levels) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.answers = answers;
    this.Levels=Levels;
    System.out.println("Question() constructor invoked");
}  
  
public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("answers are:");  
    for(Iterator<String> itr=answers.iterator();itr.hasNext();){  
        System.out.println(itr.next());  
    }  
    System.out.println("Levels are:");  
    for(Iterator<String> itr=Levels.iterator();itr.hasNext();){  
        System.out.println(itr.next());  
    }
}  
  
}