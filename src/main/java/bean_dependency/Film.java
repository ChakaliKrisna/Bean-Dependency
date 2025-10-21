package bean_dependency;

public class Film {
	
	
	
	Actor actor;
	
	public Film(Actor actor) {
		// TODO Auto-generated constructor stub
		this.actor=actor;
	}

	public void startFilm() {
		actor.act();
		
	}

}
