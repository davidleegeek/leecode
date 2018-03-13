package prog;

public class ChampagneTower {

	public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] A = new double[101][101];
        A[0][0] = poured;
        
        for (int i = 0; i <= query_row; i++) {
        	for (int j = 0; j <= i; j++) {
        		if (A[i][j] > 1) {
        			double q = (A[i][j] - 1.0) / 2.0;
        			A[i+1][j] += q;
        			A[i+1][j+1] += q;
        		}
        	}
        }
        
        return Math.min(1.0, A[query_row][query_glass]);
    }
	
	public static void main(String[] args) {
		ChampagneTower ct = new ChampagneTower();
		double full = ct.champagneTower(1090, 99, 49);
		System.out.println(full);

	}

}
