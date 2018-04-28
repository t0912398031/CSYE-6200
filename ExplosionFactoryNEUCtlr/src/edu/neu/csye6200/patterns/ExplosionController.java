package edu.neu.csye6200.patterns;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.api.AbstractExplosionFactoryAPI;
import edu.neu.csye6200.api.Explosion;

public class ExplosionController {
	private int explosionCount = 0;
	private List<Explosion> explosions = new ArrayList<>();
	private List<AbstractExplosionFactoryAPI> factories = new ArrayList<>();
	
	public ExplosionController() {

	}
	
	public ExplosionController(int count) {
		this.explosionCount = count;
		this.load(new GunShotFactory());
		this.load(new GrenadeFactory());
		this.load(new ABombFactory());
		System.out.println(this.factories.size() + " factories Added.");
		this.load();
	}
	
	public void load(AbstractExplosionFactoryAPI f) {
		factories.add(f);
	}
	
	private void load() {
		this.add(this.explosionCount);
	}
	public void load(int n) {
		if (0 == n) {
			this.explosions.clear();
			this.explosionCount = n;
		} else {			
			this.add(n);
		}
	}	
	private void add(int n) {
		System.out.println( "Adding " + n * this.factories.size() + " explosions (" + n + " each of " + this.factories.size() + " different types).");
		for (int i = 0; i < n; i++) {
			for (AbstractExplosionFactoryAPI f : this.factories) {
				this.explosions.add(f.getObject());
				this.explosionCount++;
			}
		}
	}
	
	public void load(Explosion e) {
		this.explosions.add(e);
		this.explosionCount++;
	}
	
	public void start() {
		System.out.println(explosions.size() + " explosions to set off.");
		for (Explosion e : explosions) {
			System.out.print(e.getClass().getSimpleName() + " ");
			e.explode();
		}
	}
	public static void demo() {
		System.out.println("\t" + ExplosionController.class.getName() + " .demo() starting...\n");
		ExplosionController obj = new ExplosionController(2);		
		/*
		 * usng Factor Pattern
		 */
		obj.start();
		
//		obj.load(new GunShot());
//		obj.load(new Grenade());
//		obj.load(new ABomb());
//		obj.start();
		System.out.println(ExplosionController.class.getName() + " .demo() done!\n");
	}
	
	public static void demo2() {
		System.out.println("\t" + ExplosionController.class.getName() + " .demo() starting...\n");
		ExplosionController obj = new ExplosionController();
		
		obj.load(new GunShotFactory());
		obj.load(new GrenadeFactory());
		obj.load(new ABombFactory());
		
		obj.load(2);
		obj.start();	
	}
}
