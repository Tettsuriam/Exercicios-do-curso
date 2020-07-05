package hostel;

public class Quartos {
	
	private String name;
	private int room;
	private String email;
	
	public Quartos(String name, int room, String email) {
		this.name = name;
		this.room = room;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public int getRoom() {
		return room;
	}
	public String getEmail() {
		return email;
	}
	
	public String up() {
		return "name: "+name
				+" email: "+email
				+" room: "+room;
	}

	
	

}
