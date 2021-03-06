package level;

import entity.DefaultCrate;
import entity.IceCrate;
import entity.Player;
import entity.Switch;
import entity.Wall;
import gameframework.game.GameData;

public class Level1 extends SokobanLevel {

	public Level1(GameData data) {
		super(data);
	}

	@Override
	public void createMaze() {
		addGameEntity(new Wall(data.getCanvas(), 7, 8));
		addGameEntity(new Wall(data.getCanvas(), 5, 1));
		addGameEntity(new Wall(data.getCanvas(), 7, 7));
		addGameEntity(new Wall(data.getCanvas(), 8, 3));
		addGameEntity(new Wall(data.getCanvas(), 7, 3));
		addGameEntity(new Wall(data.getCanvas(), 8, 1));
	}

	@Override
	public void initEntities() {
		addGameEntity(new Switch(data, 1, 3));
		addGameEntity(new Switch(data, 6, 3));
		addGameEntity(new Switch(data, 8, 2));
		addGameEntity(new DefaultCrate(data, 3, 3));
		addGameEntity(new DefaultCrate(data, 3, 5));
		addGameEntity(new IceCrate(data, 5, 5));
		addGameEntity(new Player(data, 2, 2));
	}

}
