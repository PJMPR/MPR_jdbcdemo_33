package jdbcdemo;

import jdbcdemo.dao.PersonRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PersonRepository repository = new PersonRepository();
        System.out.println( "Koniec" );
    }
}
