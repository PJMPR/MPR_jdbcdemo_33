package jdbcdemo;

import java.util.List;

import jdbcdemo.dao.PersonRepository;
import jdbcdemo.domain.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PersonRepository repository = new PersonRepository();
    	//repository.createTable();
        Person jan = new Person();
        jan.setName("jan");
        jan.setSurname("kowalski");
        
        repository.add(jan);
        
        List<Person> people = repository.getAll();
    	for(Person p: people){
    		System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getSurname());
    	}
    	System.out.println( "Koniec" );
    }
}
