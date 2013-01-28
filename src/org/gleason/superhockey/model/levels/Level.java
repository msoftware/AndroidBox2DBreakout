package org.gleason.superhockey.model.levels;

import java.util.ArrayList;
import java.util.List;

import org.gleason.superhockey.model.ArenaBarrier;
import org.gleason.superhockey.model.GameActor;
import org.gleason.superhockey.model.TargetBox;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;

import com.badlogic.gdx.Gdx;

public abstract class Level {
	private float topValue;
	private float bottomValue;
	private float rightValue;
	private float leftValue;
	private List<GameActor> targetBoxes = new ArrayList<GameActor>();
	public static final float BORDER_VAL = 10;
	private List<GameActor> barriers = new ArrayList<GameActor>();
	private Sprite bkgSprite;
	
	public void genBoxMap(World world){
		topValue = Gdx.graphics.getHeight() - Level.BORDER_VAL;
		bottomValue = Level.BORDER_VAL;
		rightValue = Gdx.graphics.getWidth() -  Level.BORDER_VAL;
		leftValue =  Level.BORDER_VAL;
//		barriers.add(ArenaBarrier.create(world, (Gdx.graphics.getWidth() / 2),
//				10, (Gdx.graphics.getWidth() / 2) -  Level.BORDER_VAL, 0, false));
		barriers.add(ArenaBarrier.create(world,  Level.BORDER_VAL,
				Gdx.graphics.getHeight() / 2, 0, (Gdx.graphics.getHeight() / 2)
						-  Level.BORDER_VAL, false));
		barriers.add(ArenaBarrier.create(world, Gdx.graphics.getWidth() / 2,
				Gdx.graphics.getHeight() -  Level.BORDER_VAL, Gdx.graphics.getWidth()
						/ 2 -  Level.BORDER_VAL, 0, false));
		barriers.add(ArenaBarrier.create(world, Gdx.graphics.getWidth()
				-  Level.BORDER_VAL, Gdx.graphics.getHeight() / 2, 0,
				Gdx.graphics.getHeight() / 2 -  Level.BORDER_VAL, false));
	}
	
	/**
	 * @return the topValue
	 */
	public float getTopValue() {
		return topValue;
	}
	/**
	 * @param topValue the topValue to set
	 */
	public void setTopValue(float topValue) {
		this.topValue = topValue;
	}
	/**
	 * @return the bottomValue
	 */
	public float getBottomValue() {
		return bottomValue;
	}
	/**
	 * @param bottomValue the bottomValue to set
	 */
	public void setBottomValue(float bottomValue) {
		this.bottomValue = bottomValue;
	}
	/**
	 * @return the rightValue
	 */
	public float getRightValue() {
		return rightValue;
	}
	/**
	 * @param rightValue the rightValue to set
	 */
	public void setRightValue(float rightValue) {
		this.rightValue = rightValue;
	}
	/**
	 * @return the leftValue
	 */
	public float getLeftValue() {
		return leftValue;
	}
	/**
	 * @param leftValue the leftValue to set
	 */
	public void setLeftValue(float leftValue) {
		this.leftValue = leftValue;
	}

	/**
	 * @return the targetBoxes
	 */
	public List<GameActor> getTargetBoxes() {
		return targetBoxes;
	}

	/**
	 * @param targetBoxes the targetBoxes to set
	 */
	public void setTargetBoxes(List<GameActor> targetBoxes) {
		this.targetBoxes = targetBoxes;
	}
	
	public void addTargetBox(TargetBox tb){
		this.targetBoxes.add(tb);
	}
	public void removeTargetBox(TargetBox tb){
		this.targetBoxes.remove(tb);
	}

	/**
	 * @return the bkgSprite
	 */
	public Sprite getBkgSprite() {
		return bkgSprite;
	}

	/**
	 * @param bkgSprite the bkgSprite to set
	 */
	public void setBkgSprite(Sprite bkgSprite) {
		this.bkgSprite = bkgSprite;
	}
}