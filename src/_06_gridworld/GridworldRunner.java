package _06_gridworld;

import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1 = ran.nextInt(10);
		int r2 = ran.nextInt(10);
		World w = new World();
		Bug b = new Bug();
		Location l = new Location(5, 5);
		Bug b2 = new Bug();
		Location l2 = new Location(r1, r2);
		w.add(l, b);
		w.add(l2, b2);
		w.show();
	}
}
