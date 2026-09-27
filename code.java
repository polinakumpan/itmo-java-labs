public class code {
	public static void main (String[] args) {

		short[] q = new short[18];
		for (short i=2; i<=19; i++)
			q[i-2]=i;

		float[] x = new float[12];
		for (int i=0; i<12; i++) 
			x[i]=(float)(Math.random() * 10.0 - 5.0);

		float[][] g = new float[18][12];
		for (int i = 0; i < 18; i++) 
            		for (int j = 0; j < 12; j++) 
                		g[i][j] = g_calc(q[i], x[j]);
		g_print(g);
		}


	public static float g_calc (short q, float x) {
		float res;
		if (q==5)
			res = (float) Math.pow(Math.PI * Math.atan(Math.cos(x)),2);
		else if (q==2 || q==6 || q==7 || q==9 || q==11 || q==13 || q==14 || q==17 || q==19)
			res = (float) Math.pow(Math.sin(Math.pow(2.0/3.0/x,3)),1.0/3.0);
		else
			res = (float) Math.exp(Math.exp(2.0/Math.pow(3.0/4.0/(x+1.0/4.0),3)));
		return res;
		}
	
	public static void g_print(float[][] g) {
		String[][] g_string = new String[18][12];
		int ml=0;
		for (int i=0; i<18; i++) {
			for (int j=0; j<12; j++) {
				String s;
				if (Float.isNaN(g[i][j]))
					s = Float.toString(g[i][j]);
				else if (Float.isInfinite(g[i][j])) 
					s = Float.toString(g[i][j]);
				else
					s = String.format("%.4f", g[i][j]);
				ml=Math.max(ml,s.length()); 
				g_string[i][j] = s;
				}
			}

		for (int i=0; i<18; i++) {
			for (int j=0; j<12; j++) {
				System.out.print(g_string[i][j]);
				for (int l=g_string[i][j].length(); l<=ml+1;  l++)
					System.out.print(" ");
				}
			System.out.println(" ");
			}
		}
	}
