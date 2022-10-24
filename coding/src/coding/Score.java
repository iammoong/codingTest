package coding;

public class Score implements Comparable<Score> {

	private int point;

	public Score(int point) {
		this.point = point;
	}

	@Override
	public int compareTo(Score o) {
		if(this.point > o.point) {
			return 1;
		} else if(this.point == o.point) {
			return 0;
		} else {
			return -1;
		}
	}
}
