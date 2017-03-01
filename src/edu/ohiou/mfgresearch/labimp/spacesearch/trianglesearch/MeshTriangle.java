package edu.ohiou.mfgresearch.labimp.spacesearch.trianglesearch;

import java.util.Set;

import javafx.scene.shape.*;

import edu.ohiou.mfgresearch.labimp.spacesearch.DefaultSpaceState;
import edu.ohiou.mfgresearch.labimp.spacesearch.Searchable;

public class MeshTriangle extends DefaultSpaceState {
	Mesh mesh;
	
	public MeshTriangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Set<Searchable> makeNewStates() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean equals(Searchable s) {
		// TODO Auto-generated method stub
		return false;
	}


	public int[] setSearchTypes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "MeshTriangle [index=" + index + "]";
	}

}
