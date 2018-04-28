package edu.neu.csye6200.patterns;

import edu.neu.csye6200.api.AbstractExplosionFactoryAPI;
import edu.neu.csye6200.api.Explosion;

public class GunShotFactory extends AbstractExplosionFactoryAPI{

	@Override
	public Explosion getObject() {
		return new GunShot();
	}

}
