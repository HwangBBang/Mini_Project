package KoreanWave;

public class RunCode {

	public static void main(String[] args) {
		KoreaWave koreawave = new KoreaWave();
		String kind = koreawave.selectTheme();
		koreawave.startProgram(kind);

	}

}
