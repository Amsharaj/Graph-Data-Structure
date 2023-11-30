package graph_implement.main;

import graph_implement.ConnectedGraph;

public class Connected_main {

	public static void main(String[] args) {
		//Create an object of Graph class
		int noVertices=5;
		int noEdges=8;
		ConnectedGraph g=new ConnectedGraph(noVertices,noEdges);
		
		//Create Graph
		g.edge[0].src=1;        //edge 1---2
		g.edge[0].dest=2;
		
		g.edge[1].src=1;        //edge 1---3
		g.edge[1].dest=3;
		
		g.edge[2].src=1;        //edge 1---4
		g.edge[2].dest=4;
		
		g.edge[3].src=2;        //edge 2---4
		g.edge[3].dest=4;
		
		g.edge[4].src=2;        //edge 2---5
		g.edge[4].dest=5;
		
		g.edge[5].src=3;        //edge 3---4
		g.edge[5].dest=4;
		
		g.edge[6].src=3;        //edge 3---5
		g.edge[6].dest=5;
		
		g.edge[7].src=4;         //edge 4---5
		g.edge[7].dest=5;
		
		//Print graph
		
		for(int i=0;i<noEdges;i++) {
			System.out.println(g.edge[i].src+"-"+g.edge[i].dest);
		}



	}

}
