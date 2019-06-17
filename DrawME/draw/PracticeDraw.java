package draw;

import java.awt.Color;

import grid.Grid;

public class PracticeDraw {

	public static void main(String[] args) {
		
		
		Grid grid = new Grid(20);
		System.out.println("Grid Height is : " + grid.getHt());
		System.out.println("Grid Width is : " + grid.getWd());
		/*
		for(int i = 0; i < grid.getHt(); i++) {
			grid.setColor(i, 0, Color.RED);
		}
		
		for(int i = 1; i < grid.getWd(); i++) {
			grid.setColor(0, i, Color.RED);
		}
		
		for(int i = 0; i < grid.getHt(); i++) {
			grid.setColor(i, grid.getWd()-1, Color.RED);
		}
		
		for(int i = 1; i < grid.getWd(); i++) {
			grid.setColor(grid.getHt()-1, i, Color.RED);
		}
		*/
		// Franch flag
		/*for(int row =0; row <10; row++) {
			for(int col=0; col<10; col++) {
				if(col>=0 && col<=7) {
					grid.setColor(row, col, Color.BLUE);
				}
			}
		}
		for(int row =0; row <10; row++) {
			for(int col=7; col<14; col++) {
				if(col>=7 && col<=14) {
					grid.setColor(row, col, Color.WHITE);
				}
			}
		}
		for(int row =0; row <10; row++) {
			for(int col=14; col<20; col++) {
				if(col>=14 && col<=20) {
					grid.setColor(row, col, Color.red);
				}
			}
		}
		*/
		/*
		//Russian flag
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 20; col++) {
				if(row >=0 && row <=3) {
					grid.setColor(row, col, Color.blue);
				}
			}
		}
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 20; col++) {
				if(row >=4 && row <=7) {
					grid.setColor(row, col, Color.white);
				}
			}
		}
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 20; col++) {
				if(row >=7 && row <=10) {
					grid.setColor(row, col, Color.red);
				}
			}
		}
		*/
		// American flag
		/*
		for (int i = 0; i < grid.getHt(); i++ )
			for (int n= 0; n <grid.getWd(); n++) {
				if (i % 2 == 0) {
					grid.setColor(i,n, Color.red);
				} else {
					grid.setColor(i, n, Color.white);
				}
			}
		
		for (int i = 0; i < (grid.getHt()/2)+1; i++)
			for (int n = 0; n <(grid.getWd()/2)+1;n++) {
				grid.setColor(i, n, Color.blue);
			}
		
		for (int i = 0; i <(grid.getHt()/2); i++) {
			for (int n = 0; n<(grid.getWd()/2); n++) {
				if( i % 2 == 0 && n % 2 == 0) {
					grid.setColor(i+1, n+1, Color.white);
				}
			}
		}
		*/
		
		//czech republic
		for(int i=0; i<grid.getHt();i++) {
			for(int j=0;j<grid.getWd()/2;j++) {
					grid.setColor(i,j , Color.blue);
				}
			}
		
		for(int i=grid.getHt()/2; i>=0;i--) {
			for(int j=grid.getWd();j>=i;j--) {
				if(i-1 == j) {
					grid.setColor(i,j , Color.blue);
				}
			}
		}



	}

}
