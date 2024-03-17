package ch.ost.mas.ood.gpslibrary;

import java.util.Objects;

public class SwissGrid implements Coordinate {
	private final int y;
	private final int x;

	public SwissGrid(int y, int x) {
		this.y = y;
		this.x = x;
	}
	
	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getX() {
		return x;
	}
	
	@Override
	public SwissGrid toSwissGrid() {
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SwissGrid other = (SwissGrid) obj;
		return x == other.x && y == other.y;
	}
}
