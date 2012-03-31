package siena.base.test.model;

import siena.Id;
import siena.Model;

public class PersonRef extends Model{

	@Id
	public long id;
	
	public PersonUUID personUUID;
	public PersonLongAutoID personlongautoid;
	
	public PersonRef(){
		super();
	}
	
}


