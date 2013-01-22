package org.gleason.superhockey.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.World;

public class Pad extends BoxActor {
	public Pad(){
		super();
		setHeight(10);
		setWidth(40);
		resize();
	}
	public static Pad create(World world, float x,float y){
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyType.KinematicBody;
		bodyDef.position.set(x, y);
		bodyDef.angle = 0;
		Pad returnVal = new Pad();
		returnVal.setBody(world.createBody(bodyDef));
		returnVal.createFixture();
		addSprite(returnVal);
		return returnVal;
	}
	@Override
	public FileHandle getImage() {
		// TODO Auto-generated method stub
		return Gdx.files.internal("Pad.png");
	}
	
	
}
