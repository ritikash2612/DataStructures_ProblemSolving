import java.util.Comparator;

public class SortingComparator implements Comparator<Player> {

	public static void main(String[] args) {
		// customize code
	}

	@Override
	public int compare(Player a, Player b) {

		if (a.score == b.score) {
			return a.name.compareTo(b.name);

		}
		return b.score - a.score;
	}

}

class Player {
	int score;
	String name;
}