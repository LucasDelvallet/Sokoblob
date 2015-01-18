package levels;

import entities.DefaultCrate;
import entities.IceCrate;
import entities.Player;
import entities.Switch;
import entities.Wall;
import gameframework.drawing.GameUniverseViewPortDefaultImpl;
import gameframework.game.GameData;
import gameframework.game.GameLevelDefaultImpl;

public class Level1 extends GameLevelDefaultImpl {

	public Level1(GameData data) {
		super(data);
		gameBoard = new GameUniverseViewPortDefaultImpl(data);
	}

	@Override
	protected void init() {
		// universe = this.data.getUniverse();
		this.gameBoard = new GameUniverseViewPortDefaultImpl(data);

		/*
		 * player prend désormé directement un data, pour prendre son canevas et
		 * sont moveblocker
		 */
		universe.addGameEntity(new DefaultCrate(data, 96, 96));
		universe.addGameEntity(new DefaultCrate(data, 96, 160));
		universe.addGameEntity(new IceCrate(data, 160, 160));
		universe.addGameEntity(new Switch(data, 1, 3));
		universe.addGameEntity(new Player(data, 64, 64));
		createContourWalls();
		createCourse();
	}

	protected void createContourWalls() {
		createLeftSideWalls();
		createBottomSideWalls();
		createRightSideWalls();
		createTopSideWalls();
	}

	public void createLeftSideWalls() {
		for (int i = 0; i < 9; i++)
			universe.addGameEntity(new Wall(data.getCanvas(), 0, i));
	}

	public void createBottomSideWalls() {
		for (int i = 0; i < 9; i++)
			universe.addGameEntity(new Wall(data.getCanvas(), i, 9));
	}

	public void createRightSideWalls() {
		for (int i = 9; i > 0; i--)
			universe.addGameEntity(new Wall(data.getCanvas(), 9, i));
	}

	public void createTopSideWalls() {
		for (int i = 9; i > 0; i--)
			universe.addGameEntity(new Wall(data.getCanvas(), i, 0));
	}

	public void createCourse() {
		universe.addGameEntity(new Wall(data.getCanvas(), 7, 8));
		universe.addGameEntity(new Wall(data.getCanvas(), 7, 7));

		universe.addGameEntity(new Wall(data.getCanvas(), 8, 3));
		universe.addGameEntity(new Wall(data.getCanvas(), 7, 3));
		universe.addGameEntity(new Wall(data.getCanvas(), 8, 1));

	}

}
