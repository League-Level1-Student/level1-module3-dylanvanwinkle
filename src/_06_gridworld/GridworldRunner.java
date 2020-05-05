package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1 = ran.nextInt(8) + 1;
		int r2 = ran.nextInt(8) + 1;
		World w = new World();
		Bug b = new Bug();
		Location l = new Location(5, 5);
		Bug b2 = new Bug();
		Location l2 = new Location(r1, r2);
		Location l3 = new Location(r1, (r2 - 1));
		Flower f1 = new Flower();
		Location l4 = new Location(r1, (r2 + 1));
		Flower f2 = new Flower();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Location l5 = new Location(i,j);
				Flower f3 = new Flower();
				w.add(l5, f3);		
			}
		}
		/*w.add(l3, f1);
		w.add(l4, f2);
		b2.setColor(Color.BLUE);
		b2.turn();
		b2.turn();
		w.add(l, b);
		w.add(l2, b2);
		*/
		w.show();
	}
}
