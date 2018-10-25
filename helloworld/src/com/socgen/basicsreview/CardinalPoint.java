package com.socgen.basicsreview;

public enum CardinalPoint {

    NORD(false), SOUTH(true), EAST(false), WEST(true);

    private boolean hot = false;

    private CardinalPoint(boolean hot) {

	this.hot = hot;

    }

    public boolean isHot() {
	return hot;
    }

}
