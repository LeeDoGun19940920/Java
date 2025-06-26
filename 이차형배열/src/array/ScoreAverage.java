package array;

public class ScoreAverage {
	public static void main(String[] args) {
		double[][] score = {{3.3, 3.4}, 
				{3.5, 3.6}, 
				{3.7, 3.8}, 
				{3.9, 4.0}};
		
		double sum = 0;
		
		for(int year = 0; year < score.length; year++) {
			for(int term = 0; term < score[year].length; term++) 
				sum += score[year][term];
		}
		int n = score.length;
		int m = score[0].length;		
				
		System.out.print(sum/(n*m));
		double d = sum/(n*m);
				
		System.out.printf("4년 전체 평점 평균 : %.2f", d);
	}
}
