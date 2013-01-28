package org.gleason.superhockey.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;

public class TargetBox extends BoxActor {
	public static final float HEIGHT = 25;
	public static final float WIDTH = 25;
	private World world;
	private boolean dead;
	
	public TargetBox(World world){
		super();
		this.world = world;
		setHeight(HEIGHT, false);
		setWidth(WIDTH, false);
		resize();
	}
	public static GameActor createNew(World world, float x,float y){
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyType.StaticBody;
		bodyDef.position.set(x, y);
		bodyDef.angle = 0;
		TargetBox returnVal = new TargetBox(world);
		returnVal.setBody(world.createBody(bodyDef));
		returnVal.createFixture();
		addSprite(returnVal);
		return returnVal;
	}
	public static GameActor create(World world, float x,float y, boolean isMeters){
		if(isMeters){
			return createNew(world, x, y);
		}
		else{
			return createNew(world, convertPixelsToMeters(x), convertPixelsToMeters(y));
		}
	}
	public boolean isDead(){
		return dead;
	}
	public void setDead(boolean dead){
		this.dead = dead;
	}
	public void killed(){
		if(getBody() != null){
			try{
				world.destroyBody(getBody());
			}
			catch(Exception e){
				String test = "sdasdsa";
			}
			
		}
	}
	@Override
	public long getScoreValue() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public FileHandle getImage() {
		// TODO Auto-generated method stub
		return Gdx.files.internal("WolverineBlock.png");
	}
	
	
}
