/*
 * This file is part of SpoutAPI.
 *
 * Copyright (c) 2011-2012, SpoutDev <http://www.spout.org/>
 * SpoutAPI is licensed under the SpoutDev License Version 1.
 *
 * SpoutAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * SpoutAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.api.model.mesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.spout.api.material.block.BlockFace;
import org.spout.api.math.Vector2;
import org.spout.api.math.Vector3;

public class CubeMesh extends OrientedMesh {

	public CubeMesh(Vector2 [][] uvs){
		super(new ArrayList<OrientedMeshFace>(12));
		
		Vector3 vertex0 = new Vector3(0, 0, 0);
		Vector3 vertex1 = new Vector3(0, 1, 0);
		Vector3 vertex2 = new Vector3(1, 1, 0);
		Vector3 vertex3 = new Vector3(1, 0, 0);
		Vector3 vertex4 = new Vector3(0, 0, 1);
		Vector3 vertex5 = new Vector3(0, 1, 1);
		Vector3 vertex6 = new Vector3(1, 1, 1);
		Vector3 vertex7 = new Vector3(1, 0, 1);

		Vertex v1 = null, v2 = null, v3 = null, v4 = null;

		v1 = new Vertex(vertex1, BlockFace.TOP.getOffset(), getUV(uvs, 0, 3));
		v2 = new Vertex(vertex2, BlockFace.TOP.getOffset(), getUV(uvs, 0, 2));
		v3 = new Vertex(vertex6, BlockFace.TOP.getOffset(), getUV(uvs, 0, 1));
		v4 = new Vertex(vertex5, BlockFace.TOP.getOffset(), getUV(uvs, 0, 0));
		meshFace.add(new OrientedMeshFace(v1, v2, v3, new HashSet<BlockFace>(Arrays.asList(BlockFace.TOP))));
		meshFace.add(new OrientedMeshFace(v3, v4, v1, new HashSet<BlockFace>(Arrays.asList(BlockFace.TOP))));

		v1 = new Vertex(vertex0, BlockFace.BOTTOM.getOffset(), getUV(uvs, 1, 3));
		v2 = new Vertex(vertex4, BlockFace.BOTTOM.getOffset(), getUV(uvs, 1, 2));
		v3 = new Vertex(vertex7, BlockFace.BOTTOM.getOffset(), getUV(uvs, 1, 1));
		v4 = new Vertex(vertex3, BlockFace.BOTTOM.getOffset(), getUV(uvs, 1, 3));
		meshFace.add(new OrientedMeshFace(v1, v2, v3, new HashSet<BlockFace>(Arrays.asList(BlockFace.BOTTOM))));
		meshFace.add(new OrientedMeshFace(v3, v4, v1, new HashSet<BlockFace>(Arrays.asList(BlockFace.BOTTOM))));

		v1 = new Vertex(vertex0, BlockFace.NORTH.getOffset(), getUV(uvs, 2, 2));
		v2 = new Vertex(vertex1, BlockFace.NORTH.getOffset(), getUV(uvs, 2, 1));
		v3 = new Vertex(vertex5, BlockFace.NORTH.getOffset(), getUV(uvs, 2, 0));
		v4 = new Vertex(vertex4, BlockFace.NORTH.getOffset(), getUV(uvs, 2, 3));
		meshFace.add(new OrientedMeshFace(v1, v2, v3, new HashSet<BlockFace>(Arrays.asList(BlockFace.NORTH))));
		meshFace.add(new OrientedMeshFace(v3, v4, v1, new HashSet<BlockFace>(Arrays.asList(BlockFace.NORTH))));

		v1 = new Vertex(vertex7, BlockFace.SOUTH.getOffset(), getUV(uvs, 3, 1));
		v2 = new Vertex(vertex6, BlockFace.SOUTH.getOffset(), getUV(uvs, 3, 0));
		v3 = new Vertex(vertex2, BlockFace.SOUTH.getOffset(), getUV(uvs, 3, 3));
		v4 = new Vertex(vertex3, BlockFace.SOUTH.getOffset(), getUV(uvs, 3, 2));
		meshFace.add(new OrientedMeshFace(v1, v2, v3, new HashSet<BlockFace>(Arrays.asList(BlockFace.SOUTH))));
		meshFace.add(new OrientedMeshFace(v3, v4, v1, new HashSet<BlockFace>(Arrays.asList(BlockFace.SOUTH))));

		v1 = new Vertex(vertex0, BlockFace.EAST.getOffset(), getUV(uvs, 4, 2));
		v2 = new Vertex(vertex3, BlockFace.EAST.getOffset(), getUV(uvs, 4, 1));
		v3 = new Vertex(vertex2, BlockFace.EAST.getOffset(), getUV(uvs, 4, 0));
		v4 = new Vertex(vertex1, BlockFace.EAST.getOffset(), getUV(uvs, 4, 3));
		meshFace.add(new OrientedMeshFace(v1, v2, v3, new HashSet<BlockFace>(Arrays.asList(BlockFace.EAST))));
		meshFace.add(new OrientedMeshFace(v3, v4, v1, new HashSet<BlockFace>(Arrays.asList(BlockFace.EAST))));

		v1 = new Vertex(vertex5, BlockFace.WEST.getOffset(), getUV(uvs, 5, 0));
		v2 = new Vertex(vertex6, BlockFace.WEST.getOffset(), getUV(uvs, 5, 3));
		v3 = new Vertex(vertex7, BlockFace.WEST.getOffset(), getUV(uvs, 5, 2));
		v4 = new Vertex(vertex4, BlockFace.WEST.getOffset(), getUV(uvs, 5, 1));
		meshFace.add(new OrientedMeshFace(v1, v2, v3, new HashSet<BlockFace>(Arrays.asList(BlockFace.WEST))));
		meshFace.add(new OrientedMeshFace(v3, v4, v1, new HashSet<BlockFace>(Arrays.asList(BlockFace.WEST))));
	}

	private static Vector2 getUV(Vector2 [][] uvs, int face, int vertex) {
		int i = face % uvs.length; //Allow to render all face of a cube with a one face specified
		return uvs[i][vertex % uvs[i].length];
	}

}
